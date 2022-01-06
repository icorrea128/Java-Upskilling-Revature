package Day_3.Employee;

public class Manager extends Employee{
    private String qualifications;

    public Manager(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
}
