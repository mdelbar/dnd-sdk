
package org.dnd.sdk.character.race.interfaces;

import org.dnd.sdk.ability.AbilityIncreaser;
import org.dnd.sdk.age.Aging;
import org.dnd.sdk.age.LifeExpectancy;
import org.dnd.sdk.move.Moveable;

/**
 *
 * @author Matthias Delbar
 */
public abstract class Race implements AbilityIncreaser, LifeExpectancy, Moveable {
   public int getMovementSpeed() {
       return 30;
   }
}
