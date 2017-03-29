
package org.dnd.sdk.character.race;

import java.util.Arrays;
import java.util.List;
import org.dnd.sdk.ability.AbilityType;
import org.dnd.sdk.ability.AbilityModifier;

/**
 *
 * @author Arne
 */
public class HillDwarf extends Dwarf {

    @Override
    public List<AbilityModifier> getAbilityModifiers() {
        List<AbilityModifier> dwarfIncreases = super.getAbilityModifiers();
        dwarfIncreases.addAll(Arrays.asList(AbilityModifier.construct(AbilityType.WISDOM, 1)
        ));
        return dwarfIncreases;
    }
    
}
