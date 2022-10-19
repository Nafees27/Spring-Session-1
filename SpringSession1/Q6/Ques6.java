/*
    6) Perform Constructor Injection in a Spring Bean
 */
package SpringSession1.Q6;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Ques6
{
    @Autowired
    Item obj;

    public Ques6(Item obj)
    {
        this.obj = obj;
    }

    public void display()
    {
        obj.itemInfo();
    }
}
