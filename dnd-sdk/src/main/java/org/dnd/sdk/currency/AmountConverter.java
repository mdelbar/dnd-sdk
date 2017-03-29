
package org.dnd.sdk.currency;

import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author Arne
 */
public class AmountConverter {
    
    private static Map<Currency, Map<Currency, Double>> converters;
    
    {
        converters = new EnumMap<Currency, Map<Currency, Double>>(Currency.class);
        
        Map<Currency, Double> copperConverter = new EnumMap<Currency, Double>(Currency.class);
        copperConverter.put(Currency.CP, 1d);
        copperConverter.put(Currency.SP, 0.1);
        copperConverter.put(Currency.EP, 0.5);
        copperConverter.put(Currency.GP, 0.01);
        copperConverter.put(Currency.PP, 0.001);
        converters.put(Currency.CP, copperConverter);
        
        Map<Currency, Double> silverConverter = new EnumMap<Currency, Double>(Currency.class);
        copperConverter.put(Currency.CP, 1d);
        copperConverter.put(Currency.SP, 1d);
        copperConverter.put(Currency.EP, 1d);
        copperConverter.put(Currency.GP, 1d);
        copperConverter.put(Currency.PP, 1d);
        converters.put(Currency.CP, silverConverter);
        
        Map<Currency, Double> electrumConverter = new EnumMap<Currency, Double>(Currency.class);
        copperConverter.put(Currency.CP, 1d);
        copperConverter.put(Currency.SP, 1d);
        copperConverter.put(Currency.EP, 1d);
        copperConverter.put(Currency.GP, 1d);
        copperConverter.put(Currency.PP, 1d);
        converters.put(Currency.CP, electrumConverter);
        
        Map<Currency, Double> goldConverter = new EnumMap<Currency, Double>(Currency.class);
        copperConverter.put(Currency.CP, 1d);
        copperConverter.put(Currency.SP, 1d);
        copperConverter.put(Currency.EP, 1d);
        copperConverter.put(Currency.GP, 1d);
        copperConverter.put(Currency.PP, 1d);
        converters.put(Currency.CP, copperConverter);
        
        Map<Currency, Double> platinumConverter = new EnumMap<Currency, Double>(Currency.class);
        copperConverter.put(Currency.CP, 1d);
        copperConverter.put(Currency.SP, 1d);
        copperConverter.put(Currency.EP, 1d);
        copperConverter.put(Currency.GP, 1d);
        copperConverter.put(Currency.PP, 1d);
        converters.put(Currency.CP, platinumConverter);
    }
   
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
