package no.finn.task.Delievery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> wordArray = new ArrayList<String>();
        Main main = new Main();
        wordArray = main.readInput(new File(args[0]));
        AnagramChecker anagramChecker = new AnagramChecker(wordArray);

    }

    private ArrayList<String> readInput(File inputFile) throws IOException {
        ArrayList<String> wordArray = new ArrayList<String>();
        FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String currentLine;
        while((currentLine = bufferedReader.readLine())!=null) {
            wordArray.add(currentLine);
            System.out.printf("Current line read is: %s \n", currentLine);
        }
        return wordArray;
    }
}