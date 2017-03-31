
package org.dnd.sdk.random;

import java.util.List;
import java.util.Random;

/**
 *
 * @author Arne
 */
public class Die {
    public static Die instance = new Die();
    
    private Random generator;
    
    public Die () {
        this.generator = new Random();
    }
    
    public int roll (List<Roll> rolls) {
        return rolls.stream().mapToInt(this::roll).sum();
    }
    
    public int roll (Roll roll) {
        int total = 0;
        for (int i = 0; i < roll.getAmount(); i++) {
            total += this.generator.nextInt(roll.getType().getMaximum()) + 1;
        }
        return total;
    }
}
