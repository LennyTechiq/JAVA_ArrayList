package Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create an empty ArrayList of String type
        ArrayList<String> a = new ArrayList<String>();
        // Declare and initialize a counter variable
        int counter = 0;
        // Loop through the ArrayList and increment the counter
        for(String s:a) {
            counter++;
        }
        // Print the counter value
        System.out.println("No arguments:(Can't obtain) "+ counter);

        // Create an ArrayList of String type with a specified capacity of 30
        ArrayList<String> b = new ArrayList<String>(30);
        // Reset the counter to zero
        counter = 0;
        // Loop through the ArrayList and increment the counter
        for(String s:b) {
            counter++;
        }
        // Print the counter value
        System.out.println("No arguments with capacity:(Can't obtain) "+ counter +"\n");

        // Create an array of String type and initialize it with some values
        String[] sArray = {"Hadoop", "BigData", "Java", "Python"};
        // Convert the array to a List
        List<String> list = Arrays.asList(sArray);
        // Create an ArrayList of String type and initialize it with the List
        ArrayList<String> c = new ArrayList<String>(list);
        // Add another element to the ArrayList
        c.add("J2EE");

        // Loop through the ArrayList and print each element
        for(String s:c) {
            System.out.println("ArrayList c element "+ s);
        }

        // Print the ArrayList
        System.out.println(c);
    }
}
