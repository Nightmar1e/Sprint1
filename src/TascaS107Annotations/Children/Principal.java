package TascaS107Annotations.Children;

public class Principal {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Worker presencialWorker = new TascaS107Annotations.Children.OnsiteWorker("Wa", "Li", 20);
        Worker onlineWorker = new TascaS107Annotations.Children.OnlineWorker("Gha", "Di", 15);

        int hoursWorked = 160;

        System.out.println("Onsite worker salary: " + presencialWorker.calculateSalary(hoursWorked));
        System.out.println("Online worker salary: " + onlineWorker.calculateSalary(hoursWorked));

        double oldFuelCost = OnsiteWorker.calculateOldFuelCost();
        double oldInternetCost = OnlineWorker.calculateOldInternetCost();

        System.out.println("Deprecated old fuel cost for presencial worker: " + oldFuelCost);
        System.out.println("Deprecated old internet cost for online worker: " + oldInternetCost);
    }
}
