package car.example.setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationSetterInjection.xml");
        System.out.println("Setter Injection Way");
        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
    }
}
