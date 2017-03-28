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
public class Human extends Race {
    
    private Language chosenLanguage;
    
    public Human (Language chosenLanguage) {
        this.chosenLanguage = chosenLanguage;
    }
    
    public List<AbilityModifier> getAbilityModifiers() {
        return Arrays.asList(AbilityModifier.construct(Ability.STRENGTH, 1),
                AbilityModifier.construct(Ability.CONSTITUTION, 1),
                AbilityModifier.construct(Ability.DEXTERITY, 1),
                AbilityModifier.construct(Ability.INTELLIGENCE, 1),
                AbilityModifier.construct(Ability.WISDOM, 1),
                AbilityModifier.construct(Ability.CHARISMA, 1)
        );
    }   

    public int getMatureAge() {
        return 18;
    }

    public int getAverageAge() {
        return 85;
    }
    
    @Override
    public List<LanguageUnderstanding> getLanguages() {
        return Arrays.asList(            
            LanguageUnderstanding.construct(Language.COMMON, true, true, true),
            LanguageUnderstanding.construct(chosenLanguage, true, true, true)
        );
    }
}
