import java.util.ArrayList;
import java.util.List;

public class Screening {
    private String startTime;
    private String endTime;
    private Room room;
    private Movie movie;

    public Screening(Movie movie, Room room, String startTime, String endTime) {
        this.movie = movie;
        this.room = room;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // 1. Rezerwacja przez kody tekstowe (np. "H34") - zwraca listę zajętych miejsc
    public void reservePlaces(String... seatCodes) {
        for (String code : seatCodes) {
            boolean found = false;
            for (Seat seat : room.getSeats()) {
                if (seat.getSeatCode().equals(code)) {
                    seat.setOccupied(true);
                    System.out.println("Miejsce " + code + " zostało zarezerwowane.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Nie znaleziono miejsca o kodzie: " + code);
            }
        }
    }

    // 2. Rezerwacja przez gotowe obiekty Seat
    public void reservePlaces(Seat... seats) {
        for (Seat s : seats) {
            s.setOccupied(true);
            System.out.println("Miejsce " + s.getSeatCode() + " zostało zarezerwowane.");
        }
    }

    // 3. Rezerwacja imienna - ZWRACA obiekt Reservation (zgodnie z diagramem!)
    public Reservation reservePlaces(Customer customer, String... seatCodes) {
        List<Seat> chosenSeats = new ArrayList<>();
        System.out.println("Rezerwacja dla klienta: " + customer.getName());

        for (String code : seatCodes) {
            for (Seat seat : room.getSeats()) {
                if (seat.getSeatCode().equals(code)) {
                    seat.setOccupied(true);
                    chosenSeats.add(seat);
                    System.out.println("Miejsce " + code + " dodane do rezerwacji.");
                }
            }
        }
        // Tworzymy i zwracamy nowy obiekt rezerwacji
        return new Reservation(customer, this, chosenSeats);
    }

    // Gettery
    public Movie getMovie() { return movie; }
    public String getStartTime() { return startTime; }
    public Room getRoom() { return room; }
}