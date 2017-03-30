
package org.dnd.sdk.character.klass;

import org.dnd.sdk.ability.Ability;
import org.dnd.sdk.character.klass.abstracts.Klass;

/**
 *
 * @author vanraar
 */
public class Monk extends Klass {
    private Ability chosenPrimaryAbility;
    
    public Monk (Ability chosenPrimaryAbility) {
        if (chosenPrimaryAbility == Ability.DEXTERITY || chosenPrimaryAbility == Ability.WISDOM) {
            this.chosenPrimaryAbility = chosenPrimaryAbility;
        } else {
            throw new RuntimeException("Monks can only choose DEXTERITY or WISDOM as primary ability");
        }
    }
    
    @Override
    public Ability getPrimaryAbility() {
        return this.chosenPrimaryAbility;
    }
}
