
package org.dnd.sdk.character;

import java.util.List;
import java.util.function.Consumer;
import org.dnd.sdk.ability.Ability;
import org.dnd.sdk.ability.AbilityModifier;
import org.dnd.sdk.ability.AbilityScores;
import org.dnd.sdk.ability.WithAbilities;
import org.dnd.sdk.alignment.Alignment;
import org.dnd.sdk.character.race.abstracts.Race;
import org.dnd.sdk.condition.Condition;
import org.dnd.sdk.language.Language;
import org.dnd.sdk.language.LanguageUnderstanding;
import org.dnd.sdk.move.Moveable;
import org.dnd.sdk.age.WithAge;

/**
 *
 * @author Matthias Delbar
 */
public class Character implements WithAge, Moveable, WithAbilities {
    
    private final Race race;
    private int age;    
    private Condition currentCondition;    
    private final Alignment alignment;    
    private AbilityScores abilities;    
    private int proficiency;   
    private int experience;
    private int currentHitPoints;
    private int maximumHitPoints;
    private int temporaryHitPoints;
    
    public Character (Alignment alignment, Race race, int age, AbilityScores abilities) {
        this.race = race;
        this.age = age;
        this.currentCondition = Condition.NORMAL;
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

    public int getMatureAge() {
        return this.race.getMatureAge();
    }

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

    public Condition getCurrentCondition() {
        return currentCondition;
    }

    public void setCurrentCondition(Condition currentCondition) {
        this.currentCondition = currentCondition;
    }

    public int getAbilityScore(Ability ability) {
        // TODO: apply Ability Score Modifiers ... or not, if they have been applied elsewhere
        return this.abilities.getAbilityScore(ability) ;
    }

    public int getAbilityModifier(Ability ability) {
        return this.getAbilityScore(ability) / 2;
    }
    
    public void gainExperience (int experience) {
        this.experience += experience;
        // TODO: check if level increase... and what to do if level is increased.       
    }
}
