package com.walking.intensive.chapter2.task10;

public class Task10 {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Палиндромина - ни морд, ни лап"));
    }

    static boolean isPalindrome(String inputString) {

        if (inputString == null || inputString.length() < 2) {

            return false;
        }

        String modifiedInput = inputString.toUpperCase().replaceAll("[^\\p{L}]", "");
        char[] cleanCharacters = modifiedInput.toCharArray();

//        Первая версия кода:
//        String outputString = "";
//
//        for (int i = cleanCharacters.length - 1; i >= 0; i--) {
//            outputString += cleanCharacters[i];
//        }

        StringBuilder outputString = new StringBuilder();

        for (int i = cleanCharacters.length - 1; i >= 0; i--) {
            outputString.append(cleanCharacters[i]);
        }

        return outputString.toString().equals(modifiedInput);
    }
}
