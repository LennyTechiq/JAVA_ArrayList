package Methods;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create an empty ArrayList of any type
        ArrayList al = new ArrayList();
        // Declare an Object variable to store the cloned list
        Object cloneList;
        // Add three String elements to the ArrayList
        al.add("Edureka");
        al.add("Java");
        al.add("Arrays");

        // Print the size of the ArrayList
        System.out.println("Size of ArrayList: "+al.size());
        // Print the contents of the ArrayList
        System.out.println("Contents of the al: "+ al +"\n");

        // Remove the element "Java" from the ArrayList
        al.remove("Java");

        // Print the size of the ArrayList after deletion
        System.out.println("Size of ArrayList after deletion: "+al.size());
        // Print the contents of the ArrayList after deletion
        System.out.println("Contents of the al: "+ al +"\n");

        // Clone the ArrayList and assign it to the Object variable
        cloneList = al.clone();
        // Print the elements in the cloned list
        System.out.println("Elements in the cloned list are: "+ cloneList +"\n");

        // Convert the ArrayList to an array of Objects
        Object[] objArray = al.toArray();
        // Print the elements in the array
        System.out.println("Elements in the array list are: ");
        // Loop through the array and print each element
        for (int i=0; i< objArray.length; i++)
            System.out.println(objArray[i]);

        // Clear the ArrayList
        al.clear();
        // Print the ArrayList after clearing
        System.out.println("\nArrayList after clear: "+ al);
    }
}
