
/*1. Write a Java program to update specific array element by given element and empty the array list.
        Input: [Apple, Grape, Melon, Berry]
        Output: [Kiwi, Grape, Mango, Berry]
        Array list after removing all elements []*/

package com.stackroute.pg5;

import java.util.ArrayList;
import java.util.List;

public class UpdateArrayElement {

    public static void main(String[] args){
        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("grape");
        fruitList.add("melon");
        fruitList.add("apple");
        System.out.println(" before replace:"+ fruitList);

        while (fruitList.indexOf("apple") >= 0) {
            fruitList.set(fruitList.indexOf("apple"), "kiwi");
        }
        System.out.println(" After replace:"+ fruitList);
        fruitList.clear();
        System.out.println("after removing all elements"+fruitList);
    }
}
