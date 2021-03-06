
package org.dnd.sdk.character.race.abstracts;

import java.util.List;
import org.dnd.sdk.ability.AbilityModifier;
import org.dnd.sdk.age.WithLifeExpectancy;
import org.dnd.sdk.language.Language;
import org.dnd.sdk.language.LanguageUnderstanding;
import org.dnd.sdk.age.WithAge;
import org.dnd.sdk.move.WithMove;

/**
 *
 * @author Matthias Delbar
 */
public abstract class Race implements WithLifeExpectancy, WithMove {
    
    public int getMovementSpeed() {
       return 30;
    }

    public abstract List<LanguageUnderstanding> getLanguages();
    public abstract List<AbilityModifier> getAbilityModifiers();
}
