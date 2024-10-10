package TascaS102Exceptions.Cine;

import java.util.Scanner;

public class Cinema {
    private int numRows;
    private int numSeats;
    private SeatManagement seatManagement;
    private CinemaManagement cinemaManagement;

    public Cinema() {
        this.seatManagement = new SeatManagement();
        this.cinemaManagement = new CinemaManagement(this);
        initializeCinema();
    }

    public void start() {
        int option;
        do {
            option = cinemaManagement.menu();
            switch (option) {
                case 1:
                    cinemaManagement.showSeats();
                    break;
                case 2:
                    cinemaManagement.showSeatsByPerson();
                    break;
                case 3:
                    cinemaManagement.reserveSeat();
                    break;
                case 4:
                    cinemaManagement.cancelSeatReservation();
                    break;
                case 5:
                    cinemaManagement.cancelReservationsByPerson();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        } while (option != 0);
    }

    private void initializeCinema() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        this.numRows = scanner.nextInt();
        System.out.println("Enter number of seats per row: ");
        this.numSeats = scanner.nextInt();
    }

    public SeatManagement getSeatManagement() {
        return seatManagement;
    }
}

