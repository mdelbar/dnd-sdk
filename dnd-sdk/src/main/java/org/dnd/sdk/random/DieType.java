
package org.dnd.sdk.random;

/**
 *
 * @author Arne
 */
public enum DieType {
    D4(4), D6(6), D8(8), D10(10), D20(20), D100(100);
    
    private int max;
    private DieType(int max) {
        this.max = max;
    }
    
    public int getMaximum() {
        return max;
    }
}
