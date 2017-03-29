
package org.dnd.sdk.skill;

import org.dnd.sdk.ability.AbilityType;

/**
 *
 * @author Arne
 */
public enum Skill {
    
    DECEPTION(AbilityType.CHARISMA),INTIMIDATION(AbilityType.CHARISMA), PERFORMANCE(AbilityType.CHARISMA), PERSUASION(AbilityType.CHARISMA),
    ACROBATICS(AbilityType.DEXTERITY), SLEIGHT_OF_HANDS(AbilityType.DEXTERITY), STEALTH(AbilityType.DEXTERITY),
    ARCANA(AbilityType.INTELLIGENCE), HISTORY(AbilityType.INTELLIGENCE), INVESTIGATION(AbilityType.INTELLIGENCE), 
    NATURE(AbilityType.INTELLIGENCE), RELIGION(AbilityType.INTELLIGENCE),
    ATHLETICS(AbilityType.STRENGTH), ANIMAL_HANDLING(AbilityType.WISDOM), INSIGHT(AbilityType.WISDOM),
    MEDICINE(AbilityType.WISDOM), PERCEPTION(AbilityType.WISDOM), SURVIVAL(AbilityType.WISDOM)
    ;
    
    private AbilityType ability;
    private Skill(AbilityType ability) {
        this.ability = ability;
    }

    public AbilityType getAbility() {
        return ability;
    }

    public void setAbility(AbilityType ability) {
        this.ability = ability;
    }
    
}
