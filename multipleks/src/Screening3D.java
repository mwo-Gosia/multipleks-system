public class Screening3D extends Screening {
    private double glassesPrice;

    public Screening3D(Movie movie, Room room, String date, String startTime, String endTime, double basePrice, double glassesPrice) {
        super(movie, room, date, startTime, endTime, basePrice);
        this.glassesPrice = glassesPrice;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + glassesPrice;
    }

    public double getGlassesPrice() {
        return glassesPrice;
    }
}