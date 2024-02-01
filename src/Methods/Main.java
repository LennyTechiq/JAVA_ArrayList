package Methods;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        Object cloneList;
        al.add("Edureka");
        al.add("Java");
        al.add("Arrays");

        System.out.println("Size of ArrayList: "+al.size());
        System.out.println("Contents of the al: "+ al +"\n");

        al.remove("Java");

        System.out.println("Size of ArrayList after deletion: "+al.size());
        System.out.println("Contents of the al: "+ al +"\n");

        cloneList = al.clone();
        System.out.println("Elements in the cloned list are: "+ cloneList +"\n");

        Object[] objArray = al.toArray();
        System.out.println("Elements in the array list are: ");
        for (int i=0; i< objArray.length; i++)
            System.out.println(objArray[i]);

        al.clear();
        System.out.println("\nArrayList after clear: "+ al);
    }
}
