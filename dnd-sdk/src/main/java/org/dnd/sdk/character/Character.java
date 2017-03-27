
package org.dnd.sdk.character;

import org.dnd.sdk.age.Aging;
import org.dnd.sdk.character.race.interfaces.Race;

/**
 *
 * @author Matthias Delbar
 */
public class Character implements Aging {
    
    private Race race;
    private int age;

    public int getAge() {
        return this.age;
    }

    public int getMatureAge() {
        return this.race.getMatureAge();
    }

    public int getAverageAge() {
        return this.race.getAverageAge();
    }
    
}
