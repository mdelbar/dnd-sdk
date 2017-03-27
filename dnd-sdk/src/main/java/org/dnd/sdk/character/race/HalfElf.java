/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dnd.sdk.character.race;

import org.dnd.sdk.character.race.interfaces.Race;
import java.util.Arrays;
import java.util.List;
import org.dnd.sdk.ability.Ability;
import org.dnd.sdk.ability.AbilityIncrease;

/**
 *
 * @author Arne
 */
public class HalfElf extends Race {
    
    private final Ability chosenAbility1;
    private final Ability chosenAbility2;

    public HalfElf(Ability chosenAbility1, Ability chosenAbility2) {
        this.chosenAbility1 = chosenAbility1;
        this.chosenAbility2 = chosenAbility2;
    }   
    
    public List<AbilityIncrease> getAbilityIncreases() {
        return Arrays.asList(
                AbilityIncrease.construct(Ability.CONSTITUTION, 2),
                AbilityIncrease.construct(this.chosenAbility1, 1),
                AbilityIncrease.construct(this.chosenAbility2, 1)
        );
    }
}
