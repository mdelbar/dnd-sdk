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
import org.dnd.sdk.ability.AbilityIncrease;
import org.dnd.sdk.language.Language;
import org.dnd.sdk.language.LanguageUnderstanding;

/**
 *
 * @author Arne
 */
public class Dragonborn extends Race {

    public List<AbilityIncrease> getAbilityIncreases() {
        return Arrays.asList(
            AbilityIncrease.construct(Ability.STRENGTH, 2),
            AbilityIncrease.construct(Ability.CHARISMA, 1)
        );
    }

    public int getMatureAge() {
        return 15;
    }

    public int getAverageAge() {
        return 80;
    }

    @Override
    public List<LanguageUnderstanding> getLanguages() {
        return Arrays.asList(
            LanguageUnderstanding.construct(Language.DRACONIC, true, true, true)               
        );
    }
    
}