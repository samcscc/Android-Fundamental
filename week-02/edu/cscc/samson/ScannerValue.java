package edu.cscc.samson;

/**
 * Created by OWNER on 1/28/2016.
 */
public class ScannerValue {

    public static void main(String[] args) {
       String[] words = {"hellow" , "how", "you" };
        String searchTerm = "how";
        for (String word: words){

            System.out.println("Element: " + word);
            if (word.equals(searchTerm)){
                System.out.println("word found");
                break;


            }
        }
    }
}
