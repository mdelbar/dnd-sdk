
package org.dnd.sdk.ability;

/**
 *
 * @author Matthias Delbar
 */
public class Ability {

    private AbilityType type;
    private int score;

    public AbilityType getType() {
        return type;
    }

    public void setType(final AbilityType type) {
        this.type = type;
    }

    public int getScore() {
        return score;
    }

    public void setScore(final int score) {
        this.score = score;
    }

}
