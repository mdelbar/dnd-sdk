
package org.dnd.sdk.character.race;

import java.util.Arrays;
import java.util.List;
import org.dnd.sdk.ability.AbilityModifier;
import org.dnd.sdk.ability.AbilityType;

/**
 *
 * @author Arne
 */
public class WoodElf extends Elf {

    @Override
    public List<AbilityModifier> getAbilityModifiers() {
        List<AbilityModifier> increases = super.getAbilityModifiers();
        increases.addAll(Arrays.asList(
                AbilityModifier.construct(AbilityType.WISDOM, 1)
        ));
        return increases;
    }
    
    @Override
    public int getMovementSpeed() {
       return 35;
    }
    
}
