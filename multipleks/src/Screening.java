import java.util.ArrayList;
import java.util.List;

public class Screening {
    private String date;
    private String startTime;
    private String endTime;
    private Room room;
    private Movie movie;
    private double basePrice;

    public Screening(Movie movie, Room room, String date, String startTime, String endTime, double basePrice) {
        this.movie = movie;
        this.room = room;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.basePrice = basePrice;
    }

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

    public void reservePlaces(Seat... seats) {
        for (Seat s : seats) {
            s.setOccupied(true);
            System.out.println("Miejsce " + s.getSeatCode() + " zostało zarezerwowane.");
        }
    }

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
        return new Reservation(customer, this, chosenSeats);
    }

    public Movie getMovie() { return movie; }
    public String getStartTime() { return startTime; }
    public Room getRoom() { return room; }
    public String getDate() { return date; }
    public double getFinalPrice() { return basePrice;
    }
}