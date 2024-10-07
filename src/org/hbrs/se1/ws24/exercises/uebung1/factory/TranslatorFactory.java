package org.hbrs.se1.ws24.exercises.uebung1.factory;

import org.hbrs.se1.ws24.exercises.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws24.exercises.uebung1.control.Translator;

public class TranslatorFactory {
    public static Translator createGermanTranslator() {
         GermanTranslator translator= new GermanTranslator();
        return translator;
    }
}
