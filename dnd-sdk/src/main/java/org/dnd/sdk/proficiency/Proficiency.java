
package org.dnd.sdk.proficiency;

/**
 *
 * @author Arne
 */
public class Proficiency {
    
    public static int getProfiencyBonusForLevel (int level) {
        return (level / 5) + 1; 
    }
}
