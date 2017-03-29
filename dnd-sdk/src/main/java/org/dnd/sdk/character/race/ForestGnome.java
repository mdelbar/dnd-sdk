
package org.dnd.sdk.character.race;

import java.util.Arrays;
import java.util.List;
import org.dnd.sdk.ability.AbilityModifier;
import org.dnd.sdk.ability.AbilityType;

/**
 *
 * @author Arne
 */
public class ForestGnome extends Gnome {
    @Override
    public List<AbilityModifier> getAbilityModifiers() {
        List<AbilityModifier> increases = super.getAbilityModifiers();
        increases.addAll(Arrays.asList(
                AbilityModifier.construct(AbilityType.DEXTERITY, 1)
        ));
        return increases;
    }  
}
