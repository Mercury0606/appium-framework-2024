package org.example;

public class CoreJavaBrushUp03 {
    public static void main(String[] args) {
         //String is an object
        String s = "Greatest of All Time";
        String s1 = "Greatest of All Time";
        String s2 = new String("Welcome");
        String[] splitedString = s.split(" ");
        System.out.println(splitedString[1]);
        for (int i = 1; i <= s.length(); i++) {
            System.out.print(s.charAt(s.length()  - i));
        }

    }
}
