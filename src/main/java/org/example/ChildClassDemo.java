package org.example;

public class ChildClassDemo extends ParentClassDemo{
    public void engine(){
        System.out.println("New Engine");
    }
    public void colour(){
        System.out.println(colour);
    }
    public static void main(String[] args) {
        ChildClassDemo childClassDemo = new ChildClassDemo();
        childClassDemo.engine();
        childClassDemo.colour();

        //methods from parent class
        childClassDemo.gear();
        childClassDemo.audioSystem();
        childClassDemo.brakes();
    }





}
