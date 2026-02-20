public class Seat {
    private int rowNumber;
    private int seatNumber;
    private boolean occupied;
    private String type; // np. "Standard", "VIP"

    public Seat(int rowNumber, int seatNumber, String type) {
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        this.type = type;
        this.occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public String getSeatCode() {
        char rowLetter = (char) ('A' + rowNumber - 1);
        return "" + rowLetter + seatNumber;
    }
}