/*
4. Create a Student class that represents the following information of a student: id, name, and age
        all the member variables should be private .
        a. Implement `getter and setter` .
        b. Create a `StudentSorter` class that implements `Comparator interface` .
        c. Write a class `Maintest` create Student class object(minimum 5)
        d. Add these student object into a List of type Student .
        e. Sort the list based on their age in decreasing order, for student having
        same age, sort based on their name.
        f. For students having same name and age, sort them according to their ID.


*/



package com.stackroute.pg5;

import java.awt.*;
import java.util.ArrayList;
import java.util.*;


public class Student {
        private int  id;
        private String name;
        private int ageAnInt;

    public Student(int id, String name, int ageAnInt){
            this.id = id;
            this.name = name;
            this.ageAnInt = ageAnInt;
        }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAgeAnInt() {
        return ageAnInt;
    }

    @Override
    public String toString() {
        String s = "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ageAnInt=" + ageAnInt +
                '}';
       // final String s1 = s;
        return s;
    }
}


//Comparator interface is used to order the objects of user-defined classes

class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student stud1, Student stud2) {

        // for comparison
        int nameCompare = stud1.getName().compareTo(stud2.getName());
        int ageCompare;
        int idCompare;

        if (stud1.getAgeAnInt() > stud2.getAgeAnInt()) {
            ageCompare = -1;
        } else if (stud1.getAgeAnInt() < stud2.getAgeAnInt()) {
            ageCompare = 1;
        } else {

            if (nameCompare != 0) {
                return nameCompare;
            }

            if (stud1.getId() > stud2.getId()) {
                idCompare = 1;
            } else {
                idCompare = -1;
            }

            return idCompare;

        }
        return ageCompare;

    }
}


class Maintest {
    public static void main(String[] args) {
        Student stuObject1 = new Student(1, "sneha", 25);
        Student stuObject2 = new Student(2, "monisha", 23);
       Student stuObject3 = new Student(3, "sneha", 25);
       /* Student stuObject4 = new Student(4, "rincy", 20);
        Student stuObject5 = new Student(5, "cha", 20);
*/
        ArrayList<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(stuObject1);
        listOfStudents.add(stuObject2);
        listOfStudents.add(stuObject3);
       /* listOfStudents.add(stuObject4);
        listOfStudents.add(stuObject5);
*/
        System.out.println(listOfStudents);


        //Collections.sort(listOfStudents,new StudentSorter());

        System.out.println("Printing using Iterator");
        System.out.println("Before sorting.......");

        Iterator studIterator = listOfStudents.iterator();

        while (studIterator.hasNext()) {
            System.out.println(studIterator.next());
        }
        studIterator=null;

        Collections.sort(listOfStudents,new StudentSorter());

        System.out.println("After sorting.......");
        Iterator studIterator1 = listOfStudents.iterator();
        while (studIterator1.hasNext()) {
            System.out.println(studIterator1.next());
        }


    }
}
