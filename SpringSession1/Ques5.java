/*
    (5) Demonstrate how you will resolve ambiguity while autowiring bean (Hint : @Primary)
 */

package SpringSession1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
public class Ques5 {}


interface Subject
{
    void attend();
}

@Component
@Primary
class History implements Subject{
    private String content = "history chapter";
    @Override
    @Autowired
    public void attend()
    {
        System.out.print("Reading :" + content);
    }
}

@Component
class Literature implements Subject
{
    private String content = "literature chapter";
    @Override
    @Autowired
    public void attend()
    {
        System.out.print("Reading :" + content);
    }
}