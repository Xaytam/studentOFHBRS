package org.hbrs.se1.ws24.exercises.uebung1.view;

import org.hbrs.se1.ws24.exercises.uebung1.control.EnglishTranslator;
import org.hbrs.se1.ws24.exercises.uebung1.control.GermanTranslator;

public class Assembler {

    public static void main(String[] args) {
        GermanTranslator translator = new GermanTranslator();
        Client client = new Client(translator);
        client.display(2);

        client.setTranslator(new EnglishTranslator());
        client.display(3);
    }
}
