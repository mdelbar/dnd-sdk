
package org.dnd.sdk.character.klass;

import org.dnd.sdk.ability.Ability;
import org.dnd.sdk.character.klass.abstracts.Klass;

/**
 *
 * @author vanraar
 */
public class Fighter extends Klass {
    
    private Ability chosenPrimaryAbility;
    
    public Fighter (Ability chosenPrimaryAbility) {
        if (chosenPrimaryAbility == Ability.STRENGTH || chosenPrimaryAbility == Ability.DEXTERITY) {
            this.chosenPrimaryAbility = chosenPrimaryAbility;
        } else {
            throw new RuntimeException("Fighters can only choose STRENGTH or DEXTERITY as primary ability");
        }
    }
    
    @Override
    public Ability getPrimaryAbility() {
        return this.chosenPrimaryAbility;
    }
}
