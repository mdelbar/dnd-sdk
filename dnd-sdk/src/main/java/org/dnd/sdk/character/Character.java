
package org.dnd.sdk.character;

import java.util.List;
import org.dnd.sdk.age.Aging;
import org.dnd.sdk.alignment.Alignment;
import org.dnd.sdk.character.race.interfaces.Race;
import org.dnd.sdk.condition.Condition;
import org.dnd.sdk.language.Language;
import org.dnd.sdk.language.LanguageUnderstanding;
import org.dnd.sdk.move.Moveable;

/**
 *
 * @author Matthias Delbar
 */
public class Character implements Aging, Moveable {
    
    private final Race race;
    private int age;
    
    private Condition currentCondition;
    
    private final Alignment alignment;
    
    public Character (Alignment alignment, Race race, int age) {
        this.race = race;
        this.age = age;
        this.currentCondition = Condition.NORMAL;
        this.alignment = alignment;
    }

    public int getAge() {
        return this.age;
    }

    public int getMatureAge() {
        return this.race.getMatureAge();
    }

    public int getAverageAge() {
        return this.race.getAverageAge();
    }

    public int getMovementSpeed() {
        // TODO: Add speed modifiers by equiped items etc.
        return this.race.getMovementSpeed();
    }
    
    public List<LanguageUnderstanding> getLanguages() {
        return this.race.getLanguages();
    }

    public Race getRace() {
        return race;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public Condition getCurrentCondition() {
        return currentCondition;
    }

    public void setCurrentCondition(Condition currentCondition) {
        this.currentCondition = currentCondition;
    }
}
