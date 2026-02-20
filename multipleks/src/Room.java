import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomNumber;
    private List<Seat> seats;

    public Room(int roomNumber, int rows, int seatsInRow) {
        this.roomNumber = roomNumber;
        this.seats = new ArrayList<>();


        for (int r = 1; r <= rows; r++) {
            for (int s = 1; s <= seatsInRow; s++) {
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