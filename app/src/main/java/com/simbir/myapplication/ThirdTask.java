package com.simbir.myapplication;

public class ThirdTask {

    /*
    Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"

    Your task is to process a string with "#" symbols.
    */

    public static String cleanString(String s) {
        String deleteSymbol = "#";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(deleteSymbol.equals(String.valueOf(s.charAt(i)))){
                count++;
            }
        }

        while (count != 0){
            for(int i = 0; i < stringBuilder.length(); i++){
                if(deleteSymbol.equals(String.valueOf(stringBuilder.charAt(i)))){
                    if(i == 0){
                        stringBuilder.deleteCharAt(i);
                    }else{
                        stringBuilder.deleteCharAt(i);
                        stringBuilder.deleteCharAt(i - 1);
                    }
                    count--;
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }
}
