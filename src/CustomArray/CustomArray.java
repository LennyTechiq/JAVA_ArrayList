package CustomArray;

import java.util.ArrayList;

public class CustomArray {
    int i, n=4; // Declare two integer variables: i for loop index and n for array size

    // Declare the list variable as an ArrayList of StudData objects
    ArrayList<StudData> list = new ArrayList<>();

    // Define an inner class to store the student data
    class StudData{
        int roll; // Roll number of the student
        String name; // Name of the student
        int marks; // Marks of the student
        long phone; // Phone number of the student

        // Constructor to initialize the fields of the StudData object
        StudData(int roll, String name, int marks, long phone) {
            this.roll=roll;
            this.name=name;
            this.marks=marks;
            this.phone=phone;
        }
    }

    // Main method to test the CustomArray class
    public static void main(String[] args) {
        // Declare and initialize four arrays to store the student data
        int[] roll = {1,2,3,4};
        String[] name = {"Kriss", "Frankie", "John", "Avin"};
        int[] marks = {983, 103, 488, 765};
        long[] phone = {7053839309L, 857690393L, 8294282982L, 2942040022L};

        // Create an instance of the CustomArray class
        CustomArray ca = new CustomArray();
        // Call the addValues method to add the student data to the list
        ca.addValues(roll, name, marks, phone);
    }

    // Method to add the student data to the list
    public void addValues(int[] roll, String[] name, int[] marks, long[] phone) {
        // Loop through the arrays and create a StudData object for each student
        for (i=0; i<n; i++) {
            list.add(new StudData(roll[i], name[i], marks[i], phone[i]));
        }

        // Call the printValues method to print the student data
        printValues(list);
    }

    // Method to print the student data
    public void printValues(ArrayList<StudData> list) {
        // Loop through the list and print the fields of each StudData object
        for (i=0; i<n; i++) {
            // Cast the list element to StudData type before accessing its fields
            StudData data = (StudData) list.get(i);
            System.out.println(data.roll+" "+data.name+" "+data.marks+" "+data.phone);
        }

        // Remove the last element from the list
        list.remove(n-1);
        // Print the size of the list
        System.out.println("\nSize of the list: "+ list.size());

        // Loop through the list and print the name of each StudData object
        for (StudData value : list) {
            System.out.println("Value = "+ value.name);
        }
    }
}
