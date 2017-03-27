/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dnd.sdk.character.lifestyle;

import org.dnd.sdk.currency.Currency;

/**
 *
 * @author Arne
 */
public enum Lifestyle {
    WRETCHED(0),
    SQUALID(1),
    POOR(2),
    MODEST(100),
    COMFORTABLE(200),
    WEALTHY(400),
    ARISTOCRATIC(10000)
    ;
    
    public static final Currency CURRENCY = Currency.SP;
    // Cost in SP (Silver pieces)
    private int cost; 
    private Lifestyle(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }    
    
}
