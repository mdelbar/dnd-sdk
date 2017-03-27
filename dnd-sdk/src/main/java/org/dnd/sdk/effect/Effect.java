
package org.dnd.sdk.effect;

import org.dnd.sdk.monster.Monster;

/**
 * Visitor like pattern that an effect can be different for a character and for a monster
 * @author Arne
 */
public interface Effect {
    public void effectFor (Character character);
    public void effectFor (Monster monster);
}
