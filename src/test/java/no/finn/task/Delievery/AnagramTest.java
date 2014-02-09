package no.finn.task.Delievery;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Project: ${PROJECT_NAME}
 * Package: ${PACKAGE_NAME}
 *
 * Author: Vegard Fjogstad
 * Time and date: 1:10 PM, 2/7/14
 */
public class AnagramTest {
    private Anagram anagram;

    @Before
    public void setUp() {
        anagram = new Anagram();
    }

    @Test
    public void testReadInput() throws Exception {
        ArrayList<String> output = new ArrayList<String>();
        output = anagram.readInput(new File("junitTest.txt"));
        /*
        File structure:
        Banana
        Orange
        Apple
         */
        assertEquals("banana", output.get(0));
        assertEquals("orange", output.get(1));
        assertEquals("apple", output.get(2));
    }
}
