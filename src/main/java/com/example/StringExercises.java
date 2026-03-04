package com.example;

public class StringExercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
        exercise11();
    }

    // Exercise 1 – Length of a String
    public static void exercise1() {
        String str = "Java";
        System.out.println("Exercise 1: " + str.length());
    }

    // Exercise 2 – Character at Index
    public static void exercise2() {
        String str = "Long example sentence";
        System.out.println("Exercise 2: " + str.charAt(6));
    }

    // Exercise 3 – Index Position of 'o'
    public static void exercise3() {
        String str = "Even longer example sentence";
        System.out.println("Exercise 3: " + str.indexOf('o'));
    }

    // Exercise 4 – Substring
    public static void exercise4() {
        String str = "Ok this is not as long!";
        String subStr = str.substring(11, str.length() - 1); // exclude '!'
        System.out.println("Exercise 4: " + subStr);
    }

    // Exercise 5 – Lowercase and Uppercase
    public static void exercise5() {
        String str = "CAPS EQUALS SCREAMING";
        String lower = str.toLowerCase();
        String upper = lower.toUpperCase();
        System.out.println("Exercise 5 (lowercase): " + lower);
        System.out.println("Exercise 5 (uppercase): " + upper);
    }

    // Exercise 6 – Trim String
    public static void exercise6() {
        String str = "\tJ\ta\tv\ta\t";
        System.out.println("Exercise 6: '" + str.trim() + "'");
    }

    // Exercise 7 – Parse to String
    public static void exercise7() {
        int num = 20;
        String parsed = Integer.toString(num) + "20";
        System.out.println("Exercise 7: " + parsed);
    }

    // Exercise 8 – Split String (Oil and Water)
    public static void exercise8() {
        String str = "Oil and Water";
        String[] parts = str.split(" ");
        System.out.println("Exercise 8: " + parts[0] + ", " + parts[2]);
    }

    // Exercise 9 – Split String (Names)
    public static void exercise9() {
        String str = "Carl,Susie,Fredrick,Bob,Erik";
        String[] names = str.split(",");
        System.out.println("Exercise 9:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    // Exercise 10 – Convert to Char Array
    public static void exercise10() {
        String str = "ThisShouldBeConverted";
        char[] chars = str.toCharArray();
        System.out.println("Exercise 10:");
        for (char c : chars) {
            System.out.println(c);
        }
    }

    // Exercise 11 – Convert Char Array to String
    public static void exercise11() {
        char[] charArray = {'J','a','v','a'};
        String str = new String(charArray);
        System.out.println("Exercise 11: " + str);
    }
}