/*6. Write a program to implement set interface which sorts the given randomly ordered names in

        ascending order. Convert the sorted set in to an array list
        Input : Harry Olive Alice Bluto Eugene
        Output :
        Sorted Set : Alice Bluto Eugene Harry Olive
        Array list from Set : Alice Bluto Eugene Harry Olive*/




package com.stackroute.pg5;
import java.util.*;
import java.util.*;
public class SortTheGivenNames {
    public static void main(String[] args)
    {
        System.out.println("Enter the input");
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[] array=text.split(" ");
        List<String> al=new ArrayList(Arrays.asList(array));
        Collections.sort(al);
        System.out.println(al);

    }
}
