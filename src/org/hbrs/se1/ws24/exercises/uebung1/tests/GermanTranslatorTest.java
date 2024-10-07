package org.hbrs.se1.ws24.exercises.uebung1.tests;

import org.hbrs.se1.ws24.exercises.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {


    @Test
    public void sTest() {
        GermanTranslator translator = new GermanTranslator();

        assertEquals(new IllegalArgumentException("Übersetzung der Zahl " + 0 + " nicht möglich"), translator.translateNumber(-5));
    }

    @Test
    public void aTest() {
        GermanTranslator translator = new GermanTranslator();

        assertEquals(new IllegalArgumentException("Übersetzung der Zahl " + 0 + " nicht möglich"), translator.translateNumber(0));
    }
    @Test
    public void bTest() {
        GermanTranslator translator = new GermanTranslator();

        assertEquals("acht", translator.translateNumber(8));
    }
    @Test
    public void cTest() {
        GermanTranslator translator = new GermanTranslator();

        assertEquals(new IllegalArgumentException("Übersetzung der Zahl " + 0 + " nicht möglich"), translator.translateNumber(11));
    }
}