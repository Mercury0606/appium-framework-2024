package Merc.pratice;

import java.sql.Array;
import java.util.ArrayList;

public class CoreJavaBrushUp01 {
    public static void main(String[] args) {
        int myNum = 5;
        String website = "Baidu";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard = true;
        System.out.println(myNum + " is the stored in myNum variable");
        System.out.println(website);

        //Arrays -
        int [] arr = new int[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 1;
        arr[3] = 15;
        arr[4] = 6;

        int [] arr2 = {1,2,3,4,5};
        System.out.println(arr2[2]);

        // for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println( );

        String[] name = {"Merc", "Millet", "Appium"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        for (String s: name){
            System.out.println(s + " is super cool");
        }
    }
}
