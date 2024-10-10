package TascaS102Exceptions.Cine;

import java.util.ArrayList;

public class SeatManagement {
    private ArrayList<Seat> seats;

    public SeatManagement() {
        seats = new ArrayList<>();
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void addSeat(Seat seat) throws SeatOccupiedException {
        if (findSeat(seat.getRowNumber(), seat.getSeatNumber()) != -1) {
            throw new SeatOccupiedException("The seat is already reserved.");
        }
        seats.add(seat);
    }

    public void removeSeat(int row, int seatNumber) throws SeatFreeException {
        int index = findSeat(row, seatNumber);
        if (index == -1) {
            throw new SeatFreeException("The seat is not reserved.");
        }
        seats.remove(index);
    }

    public int findSeat(int row, int seatNumber) {
        for (int i = 0; i < seats.size(); i++) {
            Seat seat = seats.get(i);
            if (seat.getRowNumber() == row && seat.getSeatNumber() == seatNumber) {
                return i;
            }
        }
        return -1;
    }
}

