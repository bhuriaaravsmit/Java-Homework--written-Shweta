/*
 * Creating a child class
 */

package programme_23_methodoverriding;

public class Bike extends Vehicle{
    //defining the same method as in the parent class
    public void run(){

        System.out.println("Bike is running safely");
    }

    public void arun(){

        System.out.println("Vehicle is running safely");
    }


    public static void main(String[] args) {
        Bike obj=new Bike();//creating object
        Bike obj1 =new Bike();
        obj.run();
        obj1.arun();
    }


}
