public class Screening3D extends Screening {
    private double glassesPrice;

    public Screening3D(Movie movie, Room room, String startTime, String endTime, double glassesPrice) {
        super(movie, room, startTime, endTime);
        this.glassesPrice = glassesPrice;
    }

    public double getGlassesPrice() {
        return glassesPrice;
    }
}