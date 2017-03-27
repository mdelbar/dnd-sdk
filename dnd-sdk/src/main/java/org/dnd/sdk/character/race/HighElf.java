
package org.dnd.sdk.character.race;

import java.util.Arrays;
import java.util.List;
import org.dnd.sdk.ability.Ability;
import org.dnd.sdk.ability.AbilityIncrease;
import org.dnd.sdk.language.Language;
import org.dnd.sdk.language.LanguageUnderstanding;

/**
 *
 * @author Arne
 */
public class HighElf extends Elf {
    
    private Language chosenLanguage;
    
    public HighElf (Language chosenLanguage) {
        this.chosenLanguage = chosenLanguage;
    }
    
    @Override
    public List<LanguageUnderstanding> getLanguages() {
        List<LanguageUnderstanding> elfLanguages = super.getLanguages();
        elfLanguages.addAll(Arrays.asList(
                LanguageUnderstanding.construct(chosenLanguage, true, true, true)
        ));
        return elfLanguages;                
    }
    
    @Override
    public List<AbilityIncrease> getAbilityIncreases() {
        List<AbilityIncrease> elfIncreases = super.getAbilityIncreases();
        elfIncreases.addAll(Arrays.asList(
            AbilityIncrease.construct(Ability.INTELLIGENCE, 1)
        ));
        return elfIncreases;
    }
}
