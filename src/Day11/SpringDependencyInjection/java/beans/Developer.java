package Day11.SpringDependencyInjection.java.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {

    @Autowired
    Computer computer;
    String language;
    //List<Project> projectList;\

    public Developer(Computer computer, String language) {
        this.computer = computer;
        this.language = language;
    }

    public Developer() {
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
