public class Main {
    public static void main(String[] args) {
        Cinema cinema1 = new Cinema("Super Tarasy", "ul. Akademicka 5");

        //... configuration and test data should be inserted here...
        Movie movie1 = new Movie("James Bond", 120, "Akcja");

        Room room1 = new Room(1, 10, 50);

        Screening screening1 = new Screening(movie1, room1, "2026-02-20", "18:00", "20:00");
        cinema1.addScreening(screening1);

        Customer customer = new Customer("Jan Kowalski");
        Seat seat1 = room1.getSeats().get(0); 
        Seat seat2 = room1.getSeats().get(1);
        Seat seat3 = room1.getSeats().get(2);

        // below you will find sample function executions
        cinema1.printProgramme();
        Screening screening = cinema1.getScreenings().get(0);
        screening.reservePlaces("H34", "H35", "H36"); // seats number given
        screening.reservePlaces(seat1, seat2, seat3); // other option
        screening.reservePlaces(customer, "H34", "H35", "H36"); // reservation for registered customer
        movie1 = cinema1.findMovie("James Bon");
        if (movie1 != null) {
            System.out.println("Znaleziono film: " + movie1.getTitle());
        }
    }
}