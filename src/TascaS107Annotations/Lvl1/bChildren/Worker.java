package TascaS107Annotations.Lvl1.bChildren;


class Worker {
    protected String name;
    protected String surname;
    protected double pricePerHour;

    public Worker(String name, String surname, double pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public double calculateSalary(int hoursWorked) {
        return hoursWorked * pricePerHour;
    }
}



