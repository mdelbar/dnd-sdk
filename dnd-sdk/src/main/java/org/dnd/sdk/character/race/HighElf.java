
package org.dnd.sdk.character.race;

import java.util.Arrays;
import java.util.List;
import org.dnd.sdk.ability.AbilityType;
import org.dnd.sdk.ability.AbilityModifier;
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
    public List<AbilityModifier> getAbilityModifiers() {
        List<AbilityModifier> elfIncreases = super.getAbilityModifiers();
        elfIncreases.addAll(Arrays.asList(AbilityModifier.construct(AbilityType.INTELLIGENCE, 1)
        ));
        return elfIncreases;
    }
}
