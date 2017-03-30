
package org.dnd.sdk.character.race;

import java.util.Arrays;
import java.util.List;
import org.dnd.sdk.ability.AbilityModifier;
import org.dnd.sdk.ability.Ability;

/**
 *
 * @author Arne
 */
public class MountainDwarf extends Dwarf {
    
    @Override
    public List<AbilityModifier> getAbilityModifiers() {
        List<AbilityModifier> dwarfIncreases = super.getAbilityModifiers();
        dwarfIncreases.addAll(Arrays.asList(AbilityModifier.construct(Ability.STRENGTH, 2)
        ));
        return dwarfIncreases;
    }
}
