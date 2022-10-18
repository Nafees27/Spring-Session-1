/*
    (2) Write a program to demonstrate Loosely Coupled code.
 */

package SpringSession1;

/*
    Class Ques2 contains main function. car class and  Bike class implements Vehicle
    interface so that it can be used by other class which implements it
    and further modification will be possible, Hence it is loose coupled.

 */

public class Ques2
{
    public static void main(String[] args)
    {
        Vehicle v = new car();
        v.start();

        Vehicle b = new Bike();
        b.start();
    }
}

// Interface
interface Vehicle
{
    void start();
}

class car implements Vehicle
{
    @Override
    public void start()
    {
        System.out.println("Travel by Car");
    }
}

class Bike implements Vehicle
{
    @Override
    public void start()
    {
        System.out.println("Travel by Bike");
    }
}

