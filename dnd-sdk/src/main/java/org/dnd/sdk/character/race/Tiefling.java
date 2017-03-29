/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dnd.sdk.character.race;

import java.util.Arrays;
import java.util.List;
import org.dnd.sdk.ability.AbilityType;
import org.dnd.sdk.ability.AbilityModifier;
import org.dnd.sdk.character.race.abstracts.Race;
import org.dnd.sdk.language.Language;
import org.dnd.sdk.language.LanguageUnderstanding;

/**
 *
 * @author Arne
 */
public class Tiefling extends Race {
    public List<AbilityModifier> getAbilityModifiers() {
        return Arrays.asList(AbilityModifier.construct(AbilityType.INTELLIGENCE, 1),
                AbilityModifier.construct(AbilityType.CHARISMA, 2)
        );
    }   

    public int getMatureAge() {
        return 18;
    }

    public int getAverageAge() {
        return 90;
    }
    
    @Override
    public List<LanguageUnderstanding> getLanguages() {
        return Arrays.asList(
            LanguageUnderstanding.construct(Language.INFERNAL, true, true, true),
            LanguageUnderstanding.construct(Language.COMMON, true, true, true)    
        );
    }
}
