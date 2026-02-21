public class VipScreening extends Screening {
    private double premiumFee;
    private boolean snacksIncluded;


    public VipScreening(Movie movie, Room room, String date, String startTime, String endTime, double basePrice, double premiumFee) {
        super(movie, room, date, startTime, endTime, basePrice);
        this.premiumFee = premiumFee;
        this.snacksIncluded = true;
    }

    public double getPremiumFee() {
        return premiumFee;
    }
    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + premiumFee;
    }
}