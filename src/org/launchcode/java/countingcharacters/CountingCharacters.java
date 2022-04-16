package org.launchcode.java.countingcharacters;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main (String[] args) {

       HashMap<Character, Integer> words = new HashMap<>();
       Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
       String myString = input.nextLine();
       myString = myString.toLowerCase();
        char[] charactersInString = myString.toCharArray();

        for (int i = 0; i < charactersInString.length; i++) {
           if(Character.isLetter(charactersInString[i])){
            if (!words.containsKey(charactersInString[i])){
                words.put(charactersInString[i], 1);
            } else {
                words.put(charactersInString[i], words.get(charactersInString[i]) + 1);
            }
           }
        }
        System.out.println(words);
    }

}

