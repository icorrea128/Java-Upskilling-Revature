package Day_3.Employee;

public class Supervisor extends Employee {
    private String experience;

    public Supervisor(String experience) {
        this.experience = experience;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
