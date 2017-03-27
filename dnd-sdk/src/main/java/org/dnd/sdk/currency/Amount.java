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
public class Amount {
    private int value;
    private Currency currency;

    public Amount(int value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    
    public static Amount construct(int value, Currency currency) {
        return new Amount(value, currency);
    }
}
