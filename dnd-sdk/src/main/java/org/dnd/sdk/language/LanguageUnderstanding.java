package org.dnd.sdk.language;

/**
 *
 * @author Arne
 */
public class LanguageUnderstanding {

    private boolean read;
    private boolean write;
    private boolean speak;
    
    private Language language;

    public LanguageUnderstanding(Language language, boolean read, boolean write, boolean speak) {
        this.read = read;
        this.write = write;
        this.speak = speak;
        this.language = language;
    }

    public boolean canRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean canWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    public boolean canSpeak() {
        return speak;
    }

    public void setSpeak(boolean speak) {
        this.speak = speak;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
    
    public static LanguageUnderstanding construct(Language language, boolean read, boolean write, boolean speak) {
        return new LanguageUnderstanding(language, read, write, speak);
    }
}
