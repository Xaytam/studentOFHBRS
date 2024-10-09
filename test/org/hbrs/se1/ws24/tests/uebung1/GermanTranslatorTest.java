package org.hbrs.se1.ws24.tests.uebung1;

import org.hbrs.se1.ws24.exercises.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    @Test
    public void ZeroTest() {
        GermanTranslator translator = new GermanTranslator();

        assertEquals("Übersetzung der Zahl " + 0 + " nicht möglich (Version: 1.0)", translator.translateNumber(0));
    }
    @Test
    public void testPositive() {
        GermanTranslator translator = new GermanTranslator();

        assertEquals("acht", translator.translateNumber(8));
    }
    @Test
    public void TestNegative() {
        GermanTranslator translator = new GermanTranslator();

        assertEquals("Übersetzung der Zahl " + 100 + " nicht möglich (Version: 1.0)", translator.translateNumber(100));
        assertEquals("Übersetzung der Zahl " + -5 + " nicht möglich (Version: 1.0)", translator.translateNumber(-5));
    }
}