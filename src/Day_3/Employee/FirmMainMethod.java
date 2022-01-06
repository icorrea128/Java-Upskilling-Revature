package Day_3.Employee;

public class FirmMainMethod {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Supervisor supervisor = new Supervisor("React and Java");
        Manager manager = new Manager("Completed 10 Client side Projects");
        worker.setId(1000);
        worker.setName("Ismael");
        supervisor.setId(1001);
        supervisor.setName("Jason");
        manager.setId(1002);
        manager.setName("Thulasi");
        System.out.println("Workers id is " + worker.getId() + " Workers name is " + worker.getName());
        System.out.println("Supervisors id is " + supervisor.getId() + " Supervisors name is " + supervisor.getName() + " His experience is " + supervisor.getExperience());
        System.out.println("Managers id is " + manager.getId() + " Managers name is " + manager.getName() + " His qualifications are " + manager.getQualifications());


    }

}
