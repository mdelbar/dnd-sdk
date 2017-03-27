/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dnd.sdk.alignment;

/**
 *
 * @author Arne
 */
public enum Alignment {

    LAWFUL_GOOD(Order.LAWFUL, Morality.GOOD),
    NEUTRAL_GOOD(Order.NEUTRAL, Morality.GOOD),
    CHAOTIC_GOOD(Order.CHAOTIC, Morality.GOOD),
    LAWFUL_NEUTRAL(Order.LAWFUL, Morality.NEUTRAL),
    NEUTRAL(Order.NEUTRAL, Morality.NEUTRAL),
    CHAOTIC_NEUTRAL(Order.LAWFUL, Morality.NEUTRAL),
    UNALIGNED(Order.NOT_AVAILABLE, Morality.NOT_AVAILABLE)
    ;
    
    private Morality morality;
    private Order order;
    
    private Alignment(Order order, Morality morality) {
        this.order = order;
        this.morality = morality;
    }

    public Morality getMorality() {
        return morality;
    }

    public void setMorality(Morality morality) {
        this.morality = morality;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
}
