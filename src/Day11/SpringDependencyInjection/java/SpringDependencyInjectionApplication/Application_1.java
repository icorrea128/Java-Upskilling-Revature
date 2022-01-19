package Day11.SpringDependencyInjection.java.SpringDependencyInjectionApplication;


import beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application_1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Employee employee = context.getBean(Employee.class);
        System.out.println(employee.getEmployee_id());
        System.out.println(employee.getFirst_name());
        System.out.println(employee.getLast_name());
        System.out.println(employee.getSalary());

    }
}
