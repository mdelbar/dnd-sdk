
package org.dnd.sdk.character.race;

import java.util.Arrays;
import java.util.List;
import org.dnd.sdk.ability.Ability;
import org.dnd.sdk.ability.AbilityIncrease;

/**
 *
 * @author Arne
 */
public class HillDwarf extends Dwarf {

    @Override
    public List<AbilityIncrease> getAbilityIncreases() {
        List<AbilityIncrease> dwarfIncreases = super.getAbilityIncreases();
        dwarfIncreases.addAll(Arrays.asList(
            AbilityIncrease.construct(Ability.WISDOM, 1)
        ));
        return dwarfIncreases;
    }
    
}
