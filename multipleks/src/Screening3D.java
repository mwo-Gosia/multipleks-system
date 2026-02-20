public class Screening3D extends Screening {
    private double glassesPrice;

    public Screening3D(Movie movie, Room room, String date, String startTime, String endTime, double glassesPrice) {
        super(movie, room, date, startTime, endTime);
        this.glassesPrice = glassesPrice;
    }

    public double getGlassesPrice() {
        return glassesPrice;
    }
}