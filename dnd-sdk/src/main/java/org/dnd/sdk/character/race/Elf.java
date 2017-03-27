
package org.dnd.sdk.character.race;

import org.dnd.sdk.character.race.interfaces.Race;
import java.util.Arrays;
import java.util.List;
import org.dnd.sdk.ability.Ability;
import org.dnd.sdk.ability.AbilityIncrease;
import org.dnd.sdk.language.Language;
import org.dnd.sdk.language.LanguageUnderstanding;

/**
 * Elf extends from AbstractRace class.
 * Pro: 
 *  Cleaner code, only override what you want to change from default behaviour.
 *  Default behaviour can encompass a lot of different things (not always as simple as this example).
 * 
 * Con:
 *  Java does not have poly-extend so we're a child of AbstractRace or need to make a layer in-between.
 * 
 * @author Matthias Delbar
 */
public class Elf extends Race {
    
    public List<AbilityIncrease> getAbilityIncreases() {
        return Arrays.asList(
                AbilityIncrease.construct(Ability.DEXTERITY, 2)
        );
    }

    public int getMatureAge() {
        return 100;
    }

    public int getAverageAge() {
        return 750;
    }

    @Override
    public List<LanguageUnderstanding> getLanguages() {
        return Arrays.asList(
            LanguageUnderstanding.construct(Language.ELVISH, true, true, true),
            LanguageUnderstanding.construct(Language.COMMON, true, true, true)  
        );
    }
    
}