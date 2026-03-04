package com.example;

public class StringExercises {
    public static void main(String[] args) {

        // Exercise 1 – Length of a String
        String str1 = "Java";
        System.out.println("Exercise 1: " + str1.length());

        // Exercise 2 – Character at Index
        String str2 = "Long example sentence";
        System.out.println("Exercise 2: " + str2.charAt(6));

        // Exercise 3 – Index Position of 'o'
        String str3 = "Even longer example sentence";
        System.out.println("Exercise 3: " + str3.indexOf('o'));

        // Exercise 4 – Substring
        String str4 = "Ok this is not as long!";
        String subStr4 = str4.substring(11, str4.length() - 1); // exclude '!'
        System.out.println("Exercise 4: " + subStr4);

        // Exercise 5 – Lowercase and Uppercase
        String str5 = "CAPS EQUALS SCREAMING";
        String lower = str5.toLowerCase();
        String upper = lower.toUpperCase();
        System.out.println("Exercise 5 (lowercase): " + lower);
        System.out.println("Exercise 5 (uppercase): " + upper);

        // Exercise 6 – Trim String
        String str6 = "\tJ\ta\tv\ta\t";
        System.out.println("Exercise 6: '" + str6.trim() + "'");

        // Exercise 7 – Parse to String
        int num = 20;
        String parsed = Integer.toString(num) + "20";
        System.out.println("Exercise 7: " + parsed);

        // Exercise 8 – Split String (Oil and Water)
        String str8 = "Oil and Water";
        String[] parts8 = str8.split(" ");
        System.out.println("Exercise 8: " + parts8[0] + ", " + parts8[2]);

        // Exercise 9 – Split String (Names)
        String str9 = "Carl,Susie,Fredrick,Bob,Erik";
        String[] names = str9.split(",");
        System.out.println("Exercise 9:");
        for (String name : names) {
            System.out.println(name);
        }

        // Exercise 10 – Convert to Char Array
        String str10 = "ThisShouldBeConverted";
        char[] chars = str10.toCharArray();
        System.out.println("Exercise 10:");
        for (char c : chars) {
            System.out.println(c);
        }

        // Exercise 11 – Convert Char Array to String
        char[] charArray = {'J','a','v','a'};
        String str11 = new String(charArray);
        System.out.println("Exercise 11: " + str11);
    }
}