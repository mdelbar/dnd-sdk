/*
 */
package org.dnd.sdk.ability;

/**
 *
 * @author Arne
 */
public class AbilityScore {
    private AbilityType ability;
    private int value;

    public AbilityScore(AbilityType ability, int value) {
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
    
    public static AbilityScore construct (AbilityType ability, int value) {
        return new AbilityScore(ability, value);
    }
}
