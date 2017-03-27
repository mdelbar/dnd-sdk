
package org.dnd.sdk.character.race;

/**
 * Elf extends from AbstractRace class.
 * Pro: 
 *  Cleaner code, only override what you want to change from default behaviour.
 *  Default behaviour can encompass a lot of different things (not always as simple as this example).
 * 
 * Con:
 *  Java does not have poly-extend so we're a child of AbstractRace or need to make a layer in-between.
 * 
 * @author Matthias Delbar
 */
public class Elf extends AbstractRace {

    @Override
    public int getDexterityModifier() {
        return 2;
    }
    
}
