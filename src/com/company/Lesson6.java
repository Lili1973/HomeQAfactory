package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Lilia.Sokolova on 05.08.2015.
 */
public class Lesson6 {
    public static void main (String[] less6) {

       /*     String a = "asdadsad";
            System.out.println(a.length());
            int [] b = {1,2,3,4,65,76};
            System.out.println(b.length);

       ArrayList<Integer> c = new ArrayList<Integer>();
       System.out.println(c.size());     //quantity of the parameters in the list
       c.add(10);
       System.out.println(c.size());
       System.out.println("------------");
       c.add(1);
       c.add(5);
       System.out.println(c.size());
       System.out.println("------------");
       System.out.println(c.get(1));
       System.out.println(c.get(2));
       c.remove(0);                      //removing of the first (1,2,3) value in the list
       System.out.println(c.size());
       System.out.println("------------");
       Integer[] c1 = {1,2,10,20};
       c.addAll(Arrays.asList(c1));     //mass creation of some values for the current list "c"
       System.out.println(c.size());*/
//////////////////////
        ArrayList<String> s = new ArrayList<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        print(s);
////////////////////
        ArrayList<String> f = new ArrayList<>();
        f.add("a"); f.add("b");
        f.add("c");
        f.add("d");
        System.out.println(isListsEqual(s, f));
/////////////////////
        f.add("d");
        System.out.println(isListsEqual(s, f));
//////////////////
        s.add("b");
        System.out.println(isListsEqual(s, f));
///////////////////
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        System.out.println(isListsEqual(s1, s2));
////////////////////
        String[] a = {"a", "b", "c", "d", "b"};
        print(a);
//////////////////////////
        System.out.println();
        System.out.println(isEqual(a, s));
    }

    public static void print(ArrayList s){
        for (int i=0;i<=3;i++) {
            System.out.println(s.get(i));
        }
    }
    public static boolean isListsEqual(ArrayList s, ArrayList f){
        return s.equals(f);
    }
    public static void print(String[] a) {
        for (int i = 0; i <= 4; i++) {
            System.out.print(a[i]);
        }
    }
    public static boolean isEqual(String [] a, ArrayList s){
        s.toArray();
        for (int i = 0; i <= 4; i++) {

        }
        return a.equals(s);
    }
}
