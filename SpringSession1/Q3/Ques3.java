/*
    (3) Use @Compenent and @Autowired annotations to in Loosely Coupled code for dependency management
 */

package SpringSession1.Q3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class Ques3
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Ques3.class);
        Test test = (Test)context.getBean(Test.class);
        test.print();
    }

}
