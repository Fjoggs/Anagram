package no.finn.task.Delievery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Project: ${PROJECT_NAME}
 * Package: ${PACKAGE_NAME}
 *
 * Author: Vegard Fjogstad
 * Time and date: 1:10 PM, 2/7/14
 */
public class AnagramSolver {
    /**
     * Method takes a string as the first argument, which point to the
     * file containing the words to be checked.
     * Included in the project is the file "string-array.txt" which contains
     * the words provided with the task.
     * @param args First and only argument needed is a string pointing to a file
     *             containing words to be tested.
     */
    public static void main(String[] args) {
        ArrayList<String> wordArray = new ArrayList<String>();
        try {
            wordArray = readInput(new File(args[0]));
            AnagramChecker anagramChecker = new AnagramChecker(wordArray);
            anagramChecker.performAnagramCheck();
            anagramChecker.prettyPrint();
        } catch (IOException e) {
            System.out.println("File not found. Exiting program..");
        }
    }

    /**
     *
     * @param inputFile
     * @return An ArrayList containing all the words found in the input file.
     * @throws IOException
     */
    public static ArrayList<String> readInput(File inputFile) throws IOException {
        ArrayList<String> wordArray = new ArrayList<String>();
        FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String readLine;
        while((readLine = bufferedReader.readLine())!=null) {
            String lowerCaseLine = readLine.toLowerCase();
            System.out.printf("Current line read is: %s \n", lowerCaseLine);
            wordArray.add(lowerCaseLine);
        }
        fileReader.close();
        bufferedReader.close();
        return wordArray;
    }
}
