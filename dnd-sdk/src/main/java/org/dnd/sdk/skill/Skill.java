
package org.dnd.sdk.skill;

import org.dnd.sdk.ability.Ability;

/**
 *
 * @author Arne
 */
public enum Skill {
    
    DECEPTION(Ability.CHARISMA),INTIMIDATION(Ability.CHARISMA), PERFORMANCE(Ability.CHARISMA), PERSUASION(Ability.CHARISMA),
    ACROBATICS(Ability.DEXTERITY), SLEIGHT_OF_HANDS(Ability.DEXTERITY), STEALTH(Ability.DEXTERITY),
    ARCANA(Ability.INTELLIGENCE), HISTORY(Ability.INTELLIGENCE), INVESTIGATION(Ability.INTELLIGENCE), 
    NATURE(Ability.INTELLIGENCE), RELIGION(Ability.INTELLIGENCE),
    ATHLETICS(Ability.STRENGTH), ANIMAL_HANDLING(Ability.WISDOM), INSIGHT(Ability.WISDOM),
    MEDICINE(Ability.WISDOM), PERCEPTION(Ability.WISDOM), SURVIVAL(Ability.WISDOM)
    ;
    
    private Ability ability;
    private Skill(Ability ability) {
        this.ability = ability;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }
    
}
