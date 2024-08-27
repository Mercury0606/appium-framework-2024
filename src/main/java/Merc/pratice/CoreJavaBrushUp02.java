package Merc.pratice;

import java.util.ArrayList;

public class CoreJavaBrushUp02 {
    public static void main(String[] args) {
        int [] arr2 = {1,2,3,4,5,23,34,56,85,92};
        for (int i:
             arr2) {
            if (i % 2 == 0){
                System.out.println(i);
            }else {
                System.out.println(i + " is not multiple of 2 ");
            }
        }

        ArrayList<String> arrayList = new ArrayList<String>();
        //Create an object of a class
        arrayList.add("Merc");
        arrayList.add("Millet");
        arrayList.add("Selenium");
        arrayList.add("Appium");


    }
}
