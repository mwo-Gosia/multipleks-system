import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private Customer customer;
    private Screening screening;
    private List<Seat> reservedSeats;

    public Reservation(Customer customer, Screening screening, List<Seat> seats) {
        this.customer = customer;
        this.screening = screening;
        this.reservedSeats = seats;
    }

    public void printReservationDetails() {
        System.out.println("--- SZCZEGÓŁY REZERWACJI ---");
        System.out.println("Film: " + screening.getMovie().getTitle());
        System.out.println("Data: " + screening.getDate());
        System.out.println("Godzina: " + screening.getStartTime());
        System.out.println("Klient: " + (customer != null ? customer.getName() : "Anonimowy"));
        System.out.print("Miejsca: ");
        for (Seat s : reservedSeats) {
            System.out.print(s.getSeatCode() + " ");
        }
        System.out.println("\n---------------------------");
    }
}