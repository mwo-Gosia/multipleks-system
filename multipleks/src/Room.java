import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomNumber;
    private List<Seat> seats; // Nasza relacja kompozycji z diagramu

    public Room(int roomNumber, int rows, int seatsInRow) {
        this.roomNumber = roomNumber;
        this.seats = new ArrayList<>();

        // Automatycznie tworzymy miejsca dla tej sali
        // Używamy prostych pętli, aby wypełnić salę
        for (int r = 1; r <= rows; r++) {
            for (int s = 1; s <= seatsInRow; s++) {
                // Tworzymy nowe miejsce (np. Rząd 1, Miejsce 5)
                seats.add(new Seat(r, s, "Standard"));
            }
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}