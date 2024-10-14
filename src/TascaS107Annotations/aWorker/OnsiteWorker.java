package TascaS107Annotations.aWorker;


class OnsiteWorker extends Worker {
    private static double benzina = 50.0;

    public OnsiteWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * pricePerHour) + benzina;
    }
}
