
package org.dnd.sdk.character;

import java.util.List;
import org.dnd.sdk.age.Aging;
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
    
    private Race race;
    private int age;
    
    private Condition currentCondition;
    
    

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
    
}
