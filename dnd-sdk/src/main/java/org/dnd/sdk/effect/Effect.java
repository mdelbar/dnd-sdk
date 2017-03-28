
package org.dnd.sdk.effect;

import org.dnd.sdk.monster.Monster;

/**
 * Visitor like pattern that an effect can be different for a character and for a monster
 * @author Arne
 */
public abstract class Effect {
    abstract void effectFor (Character character);
    abstract void effectFor (Monster monster);
}
