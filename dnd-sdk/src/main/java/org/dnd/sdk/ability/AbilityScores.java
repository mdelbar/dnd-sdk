/*
 */
package org.dnd.sdk.ability;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Arne
 */
public class AbilityScores {
    
    private Map<Ability, Integer> scores = new HashMap<Ability, Integer>();
    
    public AbilityScores (AbilityScore[] ...scores) {
        
    }
    
    public void modifyAbilityScore (AbilityModifier modifier) {
        int currentAbilityScore = this.scores.get(modifier.getAbility());
        this.scores.put(modifier.getAbility(), currentAbilityScore + modifier.getValue());
    }
    
    public void setAbilityScore (AbilityScore score) {
        this.scores.put(score.getAbility(), score.getValue());
    }
    
    public int getAbilityScore (Ability ability) {
        return this.scores.get(ability);
    }       
    
}
