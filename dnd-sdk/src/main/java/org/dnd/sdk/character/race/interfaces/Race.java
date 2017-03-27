
package org.dnd.sdk.character.race.interfaces;

import java.util.List;
import org.dnd.sdk.ability.AbilityIncreaser;
import org.dnd.sdk.age.Aging;
import org.dnd.sdk.age.LifeExpectancy;
import org.dnd.sdk.language.Language;
import org.dnd.sdk.language.LanguageUnderstanding;
import org.dnd.sdk.move.Moveable;

/**
 *
 * @author Matthias Delbar
 */
public abstract class Race implements AbilityIncreaser, LifeExpectancy, Moveable {
   public int getMovementSpeed() {
       return 30;
   }

    public abstract List<LanguageUnderstanding> getLanguages();
}
