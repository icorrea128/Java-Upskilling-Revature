package app;

import beans.ArduinoMicroController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ArduinoMicroControllerService;

import java.sql.SQLOutput;

public class App_01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ArduinoMicroController arduinoMicroControllerObject = new ArduinoMicroController(1,"Beyerdynamic",32,2);
        ArduinoMicroControllerService arduinoMicroControllerService = context.getBean(ArduinoMicroControllerService.class);
        System.out.println("Volatage from the Sun" + arduinoMicroControllerObject);
        ArduinoMicroController controllerOne = arduinoMicroControllerService.save(arduinoMicroControllerObject);
        System.out.println("Saved MicroController" + controllerOne);
        System.out.println("MicroController and Transducer Saved Successfully.");
    }


}
