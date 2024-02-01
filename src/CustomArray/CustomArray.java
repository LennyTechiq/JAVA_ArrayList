package CustomArray;

import java.util.ArrayList;

public class CustomArray {
    int i, n=4;

    // Declare the list variable as an ArrayList of StudData objects
    ArrayList<StudData> list = new ArrayList<>();

    class StudData{
        int roll;
        String name;
        int marks;
        long phone;

        StudData(int roll, String name, int marks, long phone) {
            this.roll=roll;
            this.name=name;
            this.marks=marks;
            this.phone=phone;
        }
    }

    public static void main(String[] args) {
        int[] roll = {1,2,3,4};
        String[] name = {"Kriss", "Frankie", "John", "Avin"};
        // Add a fourth element to the marks array to match the phone array length
        int[] marks = {983, 103, 488, 765};
        long[] phone = {7053839309L, 857690393L, 8294282982L, 2942040022L};

        CustomArray ca = new CustomArray();
        ca.addValues(roll, name, marks, phone);
    }

    public void addValues(int[] roll, String[] name, int[] marks, long[] phone) {
        for (i=0; i<n; i++) {
            list.add(new StudData(roll[i], name[i], marks[i], phone[i]));
        }

        printValues(list);
    }

    public void printValues(ArrayList<StudData> list) {
        for (i=0; i<n; i++) {
            // Cast the list element to StudData type before accessing its fields
            StudData data = (StudData) list.get(i);
            System.out.println(data.roll+" "+data.name+" "+data.marks+" "+data.phone);
        }

        // Use a valid index to remove an element from the list
        list.remove(n-1);
        System.out.println("\nSize of the list: "+ list.size());

        // Avoid recursive call to printValues inside the loop
        for (StudData value : list) {
            System.out.println("Value = "+ value.name);
        }
    }
}
