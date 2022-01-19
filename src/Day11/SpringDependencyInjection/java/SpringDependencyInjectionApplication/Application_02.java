package Day11.SpringDependencyInjection.java.SpringDependencyInjectionApplication;

import beans.Developer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application_02 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Developer developer = context.getBean(Developer.class);
        System.out.println(developer.getComputer().getSemiConductor());
        

    }
}
