package TascaS107Annotations.Worker;

public class Principal {
    public static void main(String[] args) {
        Worker presencialWorker = new OnsiteWorker("Wa", "Li", 20);
        Worker onlineWorker = new OnlineWorker("Gha", "Di", 15);

        int hoursWorked = 160;

        System.out.println("Onsite worker salary: " + presencialWorker.calculateSalary(hoursWorked));
        System.out.println("Online worker salary: " + onlineWorker.calculateSalary(hoursWorked));
    }
}