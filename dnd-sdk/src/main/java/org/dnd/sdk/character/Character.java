
package org.dnd.sdk.character;

import java.util.List;
import org.dnd.sdk.ability.AbilityScore;
import org.dnd.sdk.ability.Ability;
import org.dnd.sdk.ability.WithAbilities;
import org.dnd.sdk.alignment.Alignment;
import org.dnd.sdk.character.race.abstracts.Race;
import org.dnd.sdk.condition.Condition;
import org.dnd.sdk.language.LanguageUnderstanding;
import org.dnd.sdk.age.WithAge;
import org.dnd.sdk.move.WithMove;

/**
 *
 * @author Matthias Delbar
 */
public class Character implements WithAge, WithMove, WithAbilities {

    private final Race race;
    private int age;
    private Condition condition;
    private final Alignment alignment;
    private List<AbilityScore> abilities;
    private int proficiency;
    private int experience;
    private int currentHitPoints;
    private int maximumHitPoints;
    private int temporaryHitPoints;

    public Character(Alignment alignment, Race race, int age, List<AbilityScore> abilities) {
        this.race = race;
        this.age = age;
        this.condition = Condition.NORMAL;
        this.alignment = alignment;
        this.abilities = abilities;

        // Alternative that does not work with because this references the anynomous class' instance
        // Don't know the correct way to do this
//        race.getAbilityIncreases().forEach(new Consumer<AbilityIncrease> () {
//            public void accept(AbilityIncrease modifier) {
//                abilities.modifyAbilityScore(modifier);
//            }
//        });
    }

    public int getAge() {
        return this.age;
    }

    // MD: Unsure if relevant? Do we ever want to know the character's mature/avg age?
    //     Might be better done via getRace().getMat/Avg
    public int getMatureAge() {
        return this.race.getMatureAge();
    }

    // MD: Unsure if relevant? Do we ever want to know the character's mature/avg age?
    //     Might be better done via getRace().getMat/Avg
    public int getAverageAge() {
        return this.race.getAverageAge();
    }

    public int getMovementSpeed() {
        // TODO: Add speed modifiers by equiped items etc.
        return this.race.getMovementSpeed();
    }

    public List<LanguageUnderstanding> getLanguages() {
        return this.race.getLanguages();
    }

    public Race getRace() {
        return race;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition currentCondition) {
        this.condition = currentCondition;
    }

    public int getAbilityScore(Ability abilityType) {
        if(abilityType == null) {
            return 0;
        }
        // TODO: apply Ability Score Modifiers ... or not, if they have been applied elsewhere
        for(AbilityScore ab : abilities) {
            if(abilityType.equals(ab.getAbility())) {
                return ab.getValue();
            }
        }
        return 0;
    }

    public int getAbilityModifier(Ability ability) {
        int score = getAbilityScore(ability);
        return ((score - 10) / 2);
    }

    public void gainExperience (int experience) {
        this.experience += experience;
        // TODO: check if level increase... and what to do if level is increased.
    }
}
