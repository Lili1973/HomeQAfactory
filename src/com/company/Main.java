package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("QA Factory");
        int a = 10;
        int b = 20;
        if (a < b) {
            System.out.println("a less then b");
        }
        if (a > b) {
            System.out.println("a more then b");
        } else if (a == b) {
            System.out.println("a equals b");
        } else {
            System.out.println("conditions not met");
        }
        //////////////////////////////////
        System.out.println("**************************");
        int a1 = 20;
        int b1 = a1 + 5;
        String s = "Test String";
        if ("20" != s) {
            System.out.println("a not equal s");
        }
        if (s == "20") {
            System.out.println("equals"); }
        else {
            System.out.println("not equals");
        }
        if (a > a) {
            System.out.println("a greater a");
        } else if (a < a) {
            System.out.println("a less a");
        } else {
            System.out.println("other");
        }
        if (true) {
            System.out.println("hi there");
        }
        while (a1 > 0) {
            System.out.println("Recycle " + b1);
            a1 = a1 - 10;
        }
        for (int h = 5; h < 8; h+=2) {
            System.out.print("With power comes responsibility.");
        }
        System.out.println();
        for (int u = 2000; u > 918; u = 918) {
            System.out.println("continue");
        }
        //************************************
        System.out.println("---------------------------------");
        String a2 = "Hello Example";
        String t = "Hello Class,";
        String ts = " and Student!";
        String u[] = {"0","1","Under key one but three","3","4","Under key five"};
        System.out.println(a2);
        System.out.println(t);
        System.out.println(t + ts);
        System.out.println(u[5]);
        System.out.println(u[3-1]);
        //************************************
        System.out.println("+++++++++++++++++++++++++++");

        for (int x=8; x < 11; x++) {
            System.out.println(x);
        }
        String s1[]={"How","are","you" };
        for (int i = 0; i < 3; i++) {
            System.out.println(s1[i]);
        }
        int m2[] = {10, 20, 25, 30};
        int b2=20;
        int i = 0;
        while (i < 4) {
            if (m2[i] == b2) {
                System.out.println("break "+m2[i]);
                break;
            }
            System.out.println(" not breake "+m2[i]);
            i++;
        }

        int[] n = {10, 20, 25, 30};
        int d=10;
        int j = 0;
        while (j < 4) {
            if (n[j] == d) {
                j++;
                continue;
            }
            System.out.println(n[j]);
            j++;
        }

// Under key one but three

	// write your code here
    }
}
