/*
 */
package org.dnd.sdk.ability;

/**
 *
 * TODO: Name is going to be confusing with AbilityScoreModifier which is the 
 * modifier of a certain ability score
 * 
 * @author Arne
 */
public class AbilityModifier {
    
    private AbilityType ability;
    private int value;

    public AbilityModifier(AbilityType ability, int value) {
        this.ability = ability;
        this.value = value;
    }

    public AbilityType getAbility() {
        return ability;
    }

    public void setAbility(AbilityType ability) {
        this.ability = ability;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public static AbilityModifier construct(AbilityType ability, int value) {
        return new AbilityModifier(ability, value);
    }
    
}
