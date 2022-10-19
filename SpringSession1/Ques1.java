/*
    (1) Write a program to demonstrate Tightly Coupled code.
 */

package SpringSession1;


// Class Ques1 is dependent on Car class. That's why it is tightly coupled
public class Ques1
{
    Car carObj = new Car();
    public void startJourney()
    {
        carObj.travel();
    }
}

class Car
{
    public void travel()
    {
        System.out.println("Travel by car");
    }
}
