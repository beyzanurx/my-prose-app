/*
 * Copyright (c) 2026 beyzanurx
 *
 * SPDX-License-Identifier: MIT
 */

package de.htw_berlin.fb4.ossd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testFoodSentenceLength() {
        FoodSentence sentence = new FoodSentence();
        String result = sentence.get();

        // Überprüfen, dass der Satz existiert und nicht leer ist
        assertNotNull(result);
        assertFalse(result.isEmpty());

        // Test auf die Länge (Aufgabenstellung: "test for the length of the sentence")
        // Wir testen, ob der Satz mehr als 3 Zeichen hat
        assertTrue(result.length() > 3, "Der FoodSentence sollte länger als 3 Zeichen sein.");
    }

    @Test
    public void testRealitySentenceLength() {
        RealitySentence sentence = new RealitySentence();
        String result = sentence.get();

        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertTrue(result.length() > 3, "Der RealitySentence sollte länger als 3 Zeichen sein.");
    }
}
