package SpringSession1.Q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test
{
    @Autowired
    Employee emp;

    public Test(Employee emp)
    {
        this.emp = emp;
    }

    public void print()
    {
        emp.department();
    }
}
