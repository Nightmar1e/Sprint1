package TascaS107Annotations.Lvl1.bChildren;

public class Principal {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Worker presencialWorker = new TascaS107Annotations.Lvl1.bChildren.OnsiteWorker("Wa", "Li", 20);
        Worker onlineWorker = new TascaS107Annotations.Lvl1.bChildren.OnlineWorker("Gha", "Di", 15);

        int hoursWorked = 160;

        System.out.println("Onsite worker salary: " + presencialWorker.calculateSalary(hoursWorked));
        System.out.println("Online worker salary: " + onlineWorker.calculateSalary(hoursWorked));

        double oldFuelCost = OnsiteWorker.calculateOldFuelCost();
        double oldInternetCost = OnlineWorker.calculateOldInternetCost();

        System.out.println("Deprecated old fuel cost for presencial worker: " + oldFuelCost);
        System.out.println("Deprecated old internet cost for online worker: " + oldInternetCost);
    }
}
