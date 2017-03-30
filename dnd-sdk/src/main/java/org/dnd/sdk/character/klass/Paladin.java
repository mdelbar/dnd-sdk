
package org.dnd.sdk.character.klass;

import org.dnd.sdk.ability.Ability;
import org.dnd.sdk.character.klass.abstracts.Klass;

/**
 *
 * @author vanraar
 */
public class Paladin extends Klass {
    private Ability chosenPrimaryAbility;
    
    public Paladin (Ability chosenPrimaryAbility) {
        if (chosenPrimaryAbility == Ability.STRENGTH || chosenPrimaryAbility == Ability.CHARISMA) {
            this.chosenPrimaryAbility = chosenPrimaryAbility;
        } else {
            throw new RuntimeException("Paladins can only choose STRENGTH or CHARISMA as primary ability");
        }
    }
    
    @Override
    public Ability getPrimaryAbility() {
        return this.chosenPrimaryAbility;
    }
}
