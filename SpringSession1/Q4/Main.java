package SpringSession1.Q4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("config4.xml");
        Employee employee=(Employee) context.getBean("emp");
        System.out.println(employee);
    }
}
