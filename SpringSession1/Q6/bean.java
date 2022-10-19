package SpringSession1.Q6;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class bean
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext  app = new AnnotationConfigApplicationContext(Ques6.class);
        Ques6 obj = app.getBean(Ques6.class);
        obj.display();

    }
}
