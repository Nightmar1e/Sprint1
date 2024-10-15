package TascaS102Exceptions.Exercise3;

public class Seat {
    private int rowNumber;
    private int seatNumber;
    private String personName;

    public Seat(int rowNumber, int seatNumber, String personName) {
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        this.personName = personName;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getPersonName() {
        return personName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Seat seat = (Seat) obj;
        return rowNumber == seat.rowNumber && seatNumber == seat.seatNumber;
    }

    @Override
    public String toString() {
        return "Row: " + rowNumber + ", Seat: " + seatNumber + ", Reserved by: " + personName;
    }
}


