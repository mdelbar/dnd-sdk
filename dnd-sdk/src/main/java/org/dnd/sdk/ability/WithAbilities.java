/*
 */
package org.dnd.sdk.ability;

/**
 *
 * @author Arne
 */
public interface WithAbilities {
    int getAbilityScore (AbilityType ability);
    int getAbilityModifier (AbilityType ability);
}
