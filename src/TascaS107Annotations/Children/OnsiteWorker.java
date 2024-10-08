package TascaS107Annotations.Children;

class OnsiteWorker extends Worker {
    private static double benzina = 50.0;

    public OnsiteWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * pricePerHour) + benzina;
    }

    @Deprecated
    public static double calculateOldFuelCost() {
        return benzina * 0.8;
    }

}
