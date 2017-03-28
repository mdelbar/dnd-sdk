/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dnd.sdk.character.race;

import org.dnd.sdk.character.race.interfaces.Race;
import java.util.Arrays;
import java.util.List;
import org.dnd.sdk.ability.Ability;
import org.dnd.sdk.ability.AbilityModifier;
import org.dnd.sdk.language.Language;
import org.dnd.sdk.language.LanguageUnderstanding;

/**
 *
 * @author Arne
 */
public class HalfElf extends Race {
    
    private final Ability chosenAbility1;
    private final Ability chosenAbility2;
    private final Language chosenLanguage;

    public HalfElf(Ability chosenAbility1, Ability chosenAbility2, Language chosenLanguage) {
        this.chosenAbility1 = chosenAbility1;
        this.chosenAbility2 = chosenAbility2;
        this.chosenLanguage = chosenLanguage;
    }   
    
    public List<AbilityModifier> getAbilityModifiers() {
        return Arrays.asList(AbilityModifier.construct(Ability.CONSTITUTION, 2),
                AbilityModifier.construct(this.chosenAbility1, 1),
                AbilityModifier.construct(this.chosenAbility2, 1)
        );
    }

    public int getMatureAge() {
        return 20;
    }

    public int getAverageAge() {
        return 180;
    }
    
    @Override
    public List<LanguageUnderstanding> getLanguages() {
        return Arrays.asList(
            LanguageUnderstanding.construct(Language.ELVISH, true, true, true),
            LanguageUnderstanding.construct(Language.COMMON, true, true, true),
            LanguageUnderstanding.construct(chosenLanguage, true, true, true)
        );
    }
}
