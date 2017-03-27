
package org.dnd.sdk.character;

import org.dnd.sdk.character.race.Race;

/**
 *
 * @author Matthias Delbar
 */
public class Character {
    
    private int hitPoints;
    private String name;
    private Race race;

    
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
