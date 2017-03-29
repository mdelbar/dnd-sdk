
package org.dnd.sdk.character.race;

import org.dnd.sdk.character.race.abstracts.Race;
import java.util.Arrays;
import java.util.List;
import org.dnd.sdk.ability.AbilityType;
import org.dnd.sdk.ability.AbilityModifier;
import org.dnd.sdk.language.Language;
import org.dnd.sdk.language.LanguageUnderstanding;

/**
 * Dwarf implements Race interface.
 * Pro:
 *  You can inherit from a thousand interfaces.
 * 
 * Con:
 *  You need to implement every single method.
 *  The above might lead to lots of duplication (though partially avoidable through Util classes etc).
 *
 * @author Matthias Delbar
 */
public class Dwarf extends Race {

    public List<AbilityModifier> getAbilityModifiers() {
        return Arrays.asList(AbilityModifier.construct(AbilityType.CONSTITUTION, 2)
        );
    }

    public int getMatureAge() {
        return 50;
    }

    public int getAverageAge() {
        return 350;
    }
    
    @Override
    public int getMovementSpeed() {
        return 25;
    }
    
    @Override
    public List<LanguageUnderstanding> getLanguages() {
        return Arrays.asList(
            LanguageUnderstanding.construct(Language.DRACONIC, true, true, true)               
        );
    }

}
