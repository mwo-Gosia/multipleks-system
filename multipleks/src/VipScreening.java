public class VipScreening extends Screening {
    private double premiumFee;
    private boolean snacksIncluded;

    // Konstruktor
    public VipScreening(Movie movie, Room room, String startTime, String endTime, double premiumFee) {
        // super wywołuje konstruktor klasy nadrzędnej (Screening)
        super(movie, room, startTime, endTime);
        this.premiumFee = premiumFee;
        this.snacksIncluded = true; // W wersji VIP przekąski są w cenie
    }

    // Możemy dodać getter dla dodatkowej opłaty
    public double getPremiumFee() {
        return premiumFee;
    }
}