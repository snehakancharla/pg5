/*3. Write a program where an array of strings is input and output is a Map<String,boolean> where
        each different string is a key and its value is true if that string appears 2 or more times in the array
        Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
        Output - {“a” : true,”b” :false ,”c” :true,”d” : false}*/



package com.stackroute.pg5;


import java.util.*;

public class ArrayOfStrings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string ");
        String givenString = scan.nextLine();
        List<String> onlyWords = new ArrayList<>();
        onlyWords= Arrays.asList(givenString.split(""));
        System.out.println(onlyWords);

        Map<String,Boolean> countWordsInArray= new HashMap<>();

        for (String word: onlyWords){

            if(countWordsInArray.containsKey(word)) {
                countWordsInArray.replace(word,true);
            }
            else {
                countWordsInArray.put(word,false);
            }

        }
        System.out.println(countWordsInArray);
    }
}
