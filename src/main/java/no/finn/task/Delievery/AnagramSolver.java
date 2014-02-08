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
     * Method takes an inputfile as the first argument.
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> wordArray = new ArrayList<String>();
        AnagramSolver anagramSolver = new AnagramSolver();
        try {
            wordArray = anagramSolver.readInput(new File(args[0]));
        } catch (IOException e) {
            System.out.println("File not found.");
        }
        AnagramChecker anagramChecker = new AnagramChecker(wordArray);
        anagramChecker.performAnagramCheck();
        anagramChecker.prettyPrint();
    }

    /**
     *
     * @param inputFile
     * @return An ArrayList containing all the words found in the input file.
     * @throws IOException
     */
    public ArrayList<String> readInput(File inputFile) throws IOException {
        ArrayList<String> wordArray = new ArrayList<String>();
        FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine())!=null) {
            String lowerCaseLine = line.toLowerCase();
            System.out.printf("Current line read is: %s \n", lowerCaseLine);
            wordArray.add(lowerCaseLine);
        }
        fileReader.close();
        bufferedReader.close();
        return wordArray;
    }
}
