/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dnd.sdk.ability;

/**
 *
 * @author Arne
 */
public class AbilityIncrease {
    
    private Ability ability;
    private int value;

    public AbilityIncrease(Ability ability, int value) {
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
    
    public static AbilityIncrease construct(Ability ability, int value) {
        return new AbilityIncrease(ability, value);
    }
    
}
