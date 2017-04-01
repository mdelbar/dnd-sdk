
package org.dnd.sdk.character;

import java.util.List;
import java.util.function.Consumer;
import org.dnd.sdk.ability.AbilityScore;
import org.dnd.sdk.ability.Ability;
import org.dnd.sdk.ability.AbilityModifier;
import org.dnd.sdk.ability.AbilityScores;
import org.dnd.sdk.ability.WithAbilities;
import org.dnd.sdk.alignment.Alignment;
import org.dnd.sdk.character.race.abstracts.Race;
import org.dnd.sdk.condition.Condition;
import org.dnd.sdk.language.LanguageUnderstanding;
import org.dnd.sdk.age.WithAge;
import org.dnd.sdk.character.klass.abstracts.Klass;
import org.dnd.sdk.move.WithMove;
import org.dnd.sdk.proficiency.Proficiency;
import org.dnd.sdk.random.Die;
import org.dnd.sdk.random.DieType;
import org.dnd.sdk.random.Roll;
import org.dnd.sdk.skill.Skill;

/**
 *
 * @author Matthias Delbar
 */
public class Character implements WithAge, WithMove, WithAbilities {

    private final Race race;
    private final Klass klass;
    private int level;
    private int age;
    private Condition condition;
    private final Alignment alignment;
    private AbilityScores abilities;
    private int proficiency;
    private int experience;
    private int currentHitPoints;
    private int maximumHitPoints;
    private int temporaryHitPoints;

    public Character(Alignment alignment, Race race, Klass klass, int age, AbilityScores abilities) {
        this.race = race;
        this.age = age;
        this.condition = Condition.NORMAL;
        this.alignment = alignment;
        this.abilities = abilities;
        this.klass = klass;
    }

    public int getAge() {
        return this.age;
    }

    // MD: Unsure if relevant? Do we ever want to know the character's mature/avg age?
    //     Might be better done via getRace().getMat/Avg
    // Sure... you can easily access it through the race
    public int getMatureAge() {
        return this.race.getMatureAge();
    }

    // MD: Unsure if relevant? Do we ever want to know the character's mature/avg age?
    //     Might be better done via getRace().getMat/Avg
    // Sure... you can easily access it through the race
    public int getAverageAge() {
        return this.race.getAverageAge();
    }

    @Override
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

    public int getAbilityScore(Ability ability) {
        int base = abilities.getAbilityScore(ability);
            base += this.race.getAbilityModifiers()
                                .stream()
                                .filter(modifier -> modifier.getAbility() == ability)
                                .mapToInt(AbilityModifier::getValue)
                                .sum();
        
        return base;
    }

    public int getAbilityModifier(Ability ability) {
        int score = getAbilityScore(ability);
        return ((score - 10) / 2);
    }

    public void gainExperience (int experience) {
        this.experience += experience;
        // TODO: check if level increase... and what to do if level is increased.
    }
    
    public boolean isProficientIn(Skill skill) {
        return false;
    }
    
    public int abilityCheck (Ability ability) {
        int result = Die.instance.roll(new Roll(DieType.D20, 1));
        result += this.getAbilityModifier(ability);
        if (this.klass.getPrimaryAbility() == ability) result += Proficiency.getProfiencyBonusForLevel(this.getLevel());
        return result;
    }
    
    public int skillCheck (Skill skill) {
        int check = this.abilityCheck(skill.getAbility());
        if (this.isProficientIn(skill)) check += Proficiency.getProfiencyBonusForLevel(this.getLevel());
        return check;
    }

    public int getLevel() {
        return this.level;
    }
    
}
