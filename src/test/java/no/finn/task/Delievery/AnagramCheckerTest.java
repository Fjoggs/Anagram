package no.finn.task.Delievery;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fjogen on 2/7/14.
 */
public class AnagramCheckerTest {
    AnagramChecker anagramChecker;

    @Before
    public void setUp() {
        anagramChecker = new AnagramChecker();

    }

    @Test
    public void testSortWord() throws Exception {
        String result = anagramChecker.sortWord("dcba");
        assertEquals("abcd", result);
    }
}
