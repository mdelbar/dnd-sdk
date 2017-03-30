
package org.dnd.sdk.character.race;

import java.util.Arrays;
import java.util.List;
import org.dnd.sdk.ability.AbilityModifier;
import org.dnd.sdk.ability.Ability;

/**
 *
 * @author Arne
 */
public class DarkElf extends Elf{
    @Override
    public List<AbilityModifier> getAbilityModifiers() {
        List<AbilityModifier> increases = super.getAbilityModifiers();
        increases.addAll(Arrays.asList(AbilityModifier.construct(Ability.CHARISMA, 1)
        ));
        return increases;
    }
}
