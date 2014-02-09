package no.finn.task.Delievery;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Project: ${PROJECT_NAME}
 * Package: ${PACKAGE_NAME}
 *
 * Author: Vegard Fjogstad
 * Time and date: 1:10 PM, 2/7/14
 */
public class AnagramCheckerTest {
    AnagramChecker anagramChecker;

    @Before
    public void setUp() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("banana");
        arrayList.add("ananab");
        anagramChecker = new AnagramChecker(arrayList);

    }

    @Test
    public void testHashWord() throws Exception {
        anagramChecker.hashWord();
        HashMap<String, Set<String>> hashMap = anagramChecker.getHashMap();
        Set<String> result = hashMap.get("aaabnn");
        assertTrue(result.contains("banana"));
        assertTrue(result.contains("ananab"));
    }

    @Test
    public void testSortWord() throws Exception {
        String result = anagramChecker.sortWord("dcba");
        assertEquals("abcd", result);
    }
}