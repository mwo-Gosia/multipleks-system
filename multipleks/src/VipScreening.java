public class VipScreening extends Screening {
    private double premiumFee;
    private boolean snacksIncluded;


    public VipScreening(Movie movie, Room room, String date, String startTime, String endTime, double premiumFee) {
        super(movie, room, date, startTime, endTime);
        this.premiumFee = premiumFee;
        this.snacksIncluded = true;
    }

    public double getPremiumFee() {
        return premiumFee;
    }
}