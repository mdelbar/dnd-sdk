
package org.dnd.sdk.character.race.interfaces;

import org.dnd.sdk.ability.AbilityIncreaser;
import org.dnd.sdk.age.Aging;

/**
 *
 * @author Matthias Delbar
 */
public abstract class Race implements AbilityIncreaser, Aging {
    private int age;
    
    public int getAge() {
        return this.age;
    }
}
