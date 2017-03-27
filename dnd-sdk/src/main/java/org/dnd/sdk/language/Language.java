/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dnd.sdk.language;

/**
 *
 * @author Arne
 */
public enum Language {
    
    COMMON(Script.COMMON),
    DWARVISH(Script.DWARVISH),
    ELVISH(Script.ELVISH),
    GIANT(Script.DWARVISH),
    GNOMISH(Script.DWARVISH),
    GOBLIN(Script.DWARVISH),
    HALFLING(Script.COMMON),
    ORC(Script.DWARVISH),
    ABYSSAL(Script.INFERNAL),
    CELESTIAL(Script.CELESTIAL),
    DRACONIC(Script.DRACONIC),
    DEEP_SPEECH(Script.NONE),
    INFERNAL(Script.INFERNAL),
    PRIMORDIAL(Script.DWARVISH),
    SYLVAN(Script.ELVISH),
    UNDERCOMMON(Script.ELVISH)
    ;
    
    private Script script;
    
    private Language(Script script) {
        this.script = script;
    }

    public Script getScript() {
        return script;
    }

    public void setScript(Script script) {
        this.script = script;
    }
    
}
