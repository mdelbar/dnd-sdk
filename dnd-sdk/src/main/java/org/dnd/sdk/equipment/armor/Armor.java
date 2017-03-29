
package org.dnd.sdk.equipment.armor;

import org.dnd.sdk.currency.WithValue;

/**
 *
 * @author Arne
 */
public class Armor implements WithValue {
    private int value;
    private ArmorType type;
    private int AC;
    
    public int getValue() {
        return value;
    }

}
