package SpringSession1.Q3;

import org.springframework.stereotype.Component;

@Component
public class Employee implements Organisation
{
    @Override
    public void department()
    {
        System.out.println("Software Engineering");
    }
}
