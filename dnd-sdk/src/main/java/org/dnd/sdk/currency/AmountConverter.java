/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dnd.sdk.currency;

/**
 *
 * @author Arne
 */
public class AmountConverter {
    /**
     * TODO: To implement
     * @param amount
     * @param to
     * @return 
     */
    public static Amount convert (Amount amount, Currency to) {
        return Amount.construct(0, Currency.GP);
    }
    
}
