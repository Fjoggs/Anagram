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
public class AnagramSolverTest {
    private AnagramSolver anagramSolver;

    @Before
    public void setUp() {
        anagramSolver = new AnagramSolver();
    }

    @Test
    public void testReadInput() throws Exception {
        ArrayList<String> output = new ArrayList<String>();
        output = anagramSolver.readInput(new File("junitTest.txt"));
        assertEquals("banana", output.get(0));
        assertEquals("orange", output.get(1));
        assertEquals("apple", output.get(2));
    }
}
