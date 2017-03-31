
package org.dnd.sdk.random;

/**
 *
 * @author Arne
 */
public class Roll {
    private DieType type;
    private int amount;

    public Roll(DieType type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public DieType getType() {
        return type;
    }

    public void setType(DieType type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
