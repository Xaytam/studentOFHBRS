package org.hbrs.se1.ws24.exercises.uebung1.factory;

import org.hbrs.se1.ws24.exercises.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws24.exercises.uebung1.control.Translator;

import java.time.LocalDate;

public class TranslatorFactory {
    public static Translator createGermanTranslator() {



        GermanTranslator translator= new GermanTranslator();
        LocalDate rn= LocalDate.now();
        translator.setDate(rn.getMonth() + "/" + rn.getYear());

        return translator;
    }
}
