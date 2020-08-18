package com.simbir.myapplication;

public class FifthTask {

    /*
    Write a simple regex to validate a username. Allowed characters are:

    lowercase letters,
    numbers,
    underscore

    Length should be between 4 and 16 characters (both included).
    */

    public static boolean validateUsr(String s) {
        if(s.length() >=4 && s.length() <= 16) {
            for (Character character : s.toCharArray()) {
                if (!Character.isDigit(character) && !Character.isLowerCase(character) && !String.
                        valueOf(character).equals("_")) {
                    return false;
                }
            }

            return true;
        }
        return false;
    }
}
