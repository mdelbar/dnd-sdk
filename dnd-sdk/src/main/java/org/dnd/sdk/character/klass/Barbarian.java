
package org.dnd.sdk.character.klass;

import org.dnd.sdk.ability.Ability;
import org.dnd.sdk.character.klass.abstracts.Klass;

/**
 *
 * @author vanraar
 */
public class Barbarian extends Klass {

    @Override
    public Ability getPrimaryAbility() {
        return Ability.STRENGTH;
    }
    
}
