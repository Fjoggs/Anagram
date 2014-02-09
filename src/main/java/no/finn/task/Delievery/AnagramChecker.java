package no.finn.task.Delievery;

import java.util.*;

/**
 * Project: ${PROJECT_NAME}
 * Package: ${PACKAGE_NAME}
 *
 * Author: Vegard Fjogstad
 * Time and date: 1:09 PM, 2/7/14
 */
public class AnagramChecker {
    private HashMap<String, Set<String>> hashMap;
    private ArrayList<String> wordArray;
    private Set<String> stringSet;

    /**
     *
     * @param wordArray an array of strings containing the words to be checked.
     */
    public AnagramChecker(ArrayList<String> wordArray) {
        hashMap = new HashMap<String, Set<String>>();
        this.wordArray = wordArray;
    }

    /**
     * This constructor is only used for jUnit testing.
     */
    public AnagramChecker() {
        hashMap = new HashMap<String, Set<String>>();
        wordArray = new ArrayList<String>();
    }

    public void performAnagramCheck() {
        hashWord();
    }

    public void hashWord() {
        for(String unsortedWord : wordArray) {
            String sortedWord = sortWord(unsortedWord);
            stringSet = hashMap.get(sortedWord);
            if(stringSet==null) {
                /*
                If the stringSet is null we create a new one and place it in the HashMap.
                 */
                stringSet = new HashSet<String>();
                hashMap.put(sortedWord, stringSet);
            }
            stringSet.add(unsortedWord);
        }
    }

    /**
     * Takes a word and sorts it by using the sort method found in the Arrays class.
     * "edcba" returns "abcde".
     * @param word an unsorted word
     * @return the sorted word
     */
    public String sortWord(String word) {
        //System.out.printf("Unsorted word is: %s \n", word);
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        String sortedWord = new String(charArray);
        //System.out.printf("Sorted word is: %s \n", sortedWord);
        return sortedWord;
    }

    /**
     * Prints out all words that has at least 1 anagram in the given input file."
     * Loops the HashMap and fetches each entry. The it simply prints it using the
     * set class toString method.
     */
    public void prettyPrint() {
        for(Map.Entry<String, Set<String>> entry : hashMap.entrySet()) {
            Set<String> value = entry.getValue();
            if(value.size()>1) {
                System.out.println(value.toString());
            }
        }
    }
 }
