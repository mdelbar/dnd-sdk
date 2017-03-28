/*
 */
package org.dnd.sdk.ability;

/**
 *
 * @author Arne
 */
public class AbilityScore {
    private Ability ability;
    private int value;

    public AbilityScore(Ability ability, int value) {
        this.ability = ability;
        this.value = value;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public static AbilityScore construct (Ability ability, int value) {
        return new AbilityScore(ability, value);
    }
}
