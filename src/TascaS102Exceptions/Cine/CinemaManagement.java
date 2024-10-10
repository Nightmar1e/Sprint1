package TascaS102Exceptions.Cine;

import java.util.Scanner;

public class CinemaManagement {
    private Cinema cinema;
    private Scanner scanner;

    public CinemaManagement(Cinema cinema) {
        this.cinema = cinema;
        this.scanner = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("1.- Show all reserved seats.");
        System.out.println("2.- Show reserved seats by a person.");
        System.out.println("3.- Reserve a seat.");
        System.out.println("4.- Cancel a seat reservation.");
        System.out.println("5.- Cancel all reservations of a person.");
        System.out.println("0.- Exit.");
        return scanner.nextInt();
    }

    public void showSeats() {
        if (cinema.getSeatManagement().getSeats().isEmpty()) {
            System.out.println("No seats reserved.");
        } else {
            for (Seat seat : cinema.getSeatManagement().getSeats()) {
                System.out.println(seat);
            }
        }
    }

    public void showSeatsByPerson() {
        String person = inputPerson();
        boolean found = false;

        for (Seat seat : cinema.getSeatManagement().getSeats()) {
            if (seat.getPersonName().equals(person)) {
                System.out.println(seat);
                found = true;
            }
        }

        if (!found) {
            System.out.println(person + " has no reservations.");
        }
    }

    public void reserveSeat() {
        int row = inputRow();
        int seatNumber = inputSeat();
        String person = inputPerson();

        try {
            cinema.getSeatManagement().addSeat(new Seat(row, seatNumber, person));
            System.out.println("Seat reserved successfully.");
        } catch (SeatOccupiedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void cancelSeatReservation() {
        int row = inputRow();
        int seatNumber = inputSeat();

        try {
            cinema.getSeatManagement().removeSeat(row, seatNumber);
            System.out.println("Reservation cancelled.");
        } catch (SeatFreeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void cancelReservationsByPerson() {
        String person = inputPerson();
        cinema.getSeatManagement().getSeats().removeIf(seat -> seat.getPersonName().equals(person));
        System.out.println("All reservations for " + person + " have been cancelled.");
    }

    public String inputPerson() {
        System.out.println("Enter the person's name: ");
        return scanner.next();
    }

    public int inputRow() {
        System.out.println("Enter row number: ");
        return scanner.nextInt();
    }

    public int inputSeat() {
        System.out.println("Enter seat number: ");
        return scanner.nextInt();
    }
}

