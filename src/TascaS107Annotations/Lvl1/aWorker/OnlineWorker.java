package TascaS107Annotations.Lvl1.aWorker;

class OnlineWorker extends Worker {
    private static final double INTERNET_FLAT_RATE = 30.0;

    public OnlineWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * pricePerHour) + INTERNET_FLAT_RATE;
    }
}
