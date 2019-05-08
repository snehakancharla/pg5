/*2. Write a program to find the number of counts in the following String. Store the output in
        Map<String,Integer> as key value pair.
        Input : String str = “one one -one___two,,three,one @three*one?two”;
        Output : {"one":5 , "two":2, "three" :2}*/



package com.stackroute.pg5;

import java.util.*;

public class CountOfWordsInString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string ");
        String givenString = scan.nextLine();
        List<String> onlyWords = new ArrayList<>();
        onlyWords=Arrays.asList(givenString.split("[^a-zA-Z]+"));
        System.out.println(onlyWords);

        Map<String,Integer>  countWordsInArray= new HashMap<>();

        for (String word: onlyWords){

            if(countWordsInArray.containsKey(word)) {
                countWordsInArray.replace(word,countWordsInArray.get(word)+1);
            }
            else {
                countWordsInArray.put(word,1);
            }

        }
        System.out.println(countWordsInArray);
    }
}
