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

    public AnagramChecker(ArrayList<String> wordArray) {
        hashMap = new HashMap<String, Set<String>>();
        this.wordArray = wordArray;
    }

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
                stringSet = new HashSet<String>();
                hashMap.put(sortedWord, stringSet);
            }
            stringSet.add(unsortedWord);
            //System.out.printf("HashMap print: %s", hashMap.toString());
        }
    }

    public String sortWord(String word) {
        //System.out.printf("Unsorted word is: %s \n", word);
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        String sortedWord = new String(charArray);
        //System.out.printf("Sorted word is: %s \n", sortedWord);
        return sortedWord;
    }

    public void prettyPrint() {
        for(Map.Entry<String, Set<String>> entry : hashMap.entrySet()) {
            //String key = entry.getKey();
            Set<String> value = entry.getValue();
            if(value.size()>1) {
                System.out.println(value.toString());
            }
        }
    }
 }
