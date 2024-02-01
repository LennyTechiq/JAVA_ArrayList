package Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        int counter = 0;
        for(String s:a) {
            counter++;
        }
        System.out.println("No arguments:(Can't obtain) "+ counter);

        ArrayList<String> b = new ArrayList<String>(30);
        counter = 0;
        for(String s:b) {
            counter++;
        }
        System.out.println("No arguments with capacity:(Can't obtain) "+ counter +"\n");

        String[] sArray = {"Hadoop", "BigData", "Java", "Python"};
        List<String> list = Arrays.asList(sArray);
        ArrayList<String> c = new ArrayList<String>(list);
        c.add("J2EE");

        for(String s:c) {
            System.out.println("ArrayList c element "+ s);
        }

        System.out.println(c);
    }
}