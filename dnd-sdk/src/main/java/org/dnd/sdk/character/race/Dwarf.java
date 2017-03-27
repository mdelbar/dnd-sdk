
package org.dnd.sdk.character.race;

/**
 * Dwarf implements Race interface.
 * Pro:
 *  You can inherit from a thousand interfaces.
 * 
 * Con:
 *  You need to implement every single method.
 *  The above might lead to lots of duplication (though partially avoidable through Util classes etc).
 *
 * @author Matthias Delbar
 */
public class Dwarf implements Race {

    public int getStrengthModifier() {
        return 0;
    }

    public int getDexterityModifier() {
        return 0;
    }

    public int getConstitutionModifier() {
        return 0;
    }

    public int getIntelligenceModifier() {
        return 0;
    }

    public int getWisdomModifier() {
        return 0;
    }

    public int getCharismaModifier() {
        return 0;
    }

}
