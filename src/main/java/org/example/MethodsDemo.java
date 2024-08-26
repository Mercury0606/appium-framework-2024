package org.example;

import java.lang.invoke.MethodHandle;
public class MethodsDemo {
    public static void main(String[] args) {
        MethodsDemo methodsDemo = new MethodsDemo();
        System.out.println(methodsDemo.getData());

        MethodsDemo2 methodsDemo2 = new MethodsDemo2();
        System.out.println(methodsDemo2.getData());

        getDataStaticly();
    }
    public String  getData(){
        System.out.println("Hello world");
        return "Greatest of All Time ";
    }
    public static void getDataStaticly(){

        System.out.println("This is message from static method");
    }

}
