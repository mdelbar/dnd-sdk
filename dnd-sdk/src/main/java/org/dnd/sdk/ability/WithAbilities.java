/*
 */
package org.dnd.sdk.ability;

/**
 *
 * @author Arne
 */
public interface WithAbilities {
    int getAbilityScore (Ability ability);
    int getAbilityModifier (Ability ability);
}
