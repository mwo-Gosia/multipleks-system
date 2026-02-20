public class Main {
    public static void main(String[] args) {
        Cinema cinema1 = new Cinema("Super Tarasy", "ul. Akademicka 5");

        //... configuration and test data should be inserted here...
        // 1. Tworzymy film
        Movie movie1 = new Movie("James Bond", 120, "Akcja");

        // 2. Tworzymy salę (np. 10 rzędów po 10 miejsc)
        Room room1 = new Room(1, 10, 50);

        // 3. Tworzymy seans i dodajemy do kina
        Screening screening1 = new Screening(movie1, room1, "18:00", "20:00");
        cinema1.addScreening(screening1);

        // 4. Tworzymy klienta i przykładowe obiekty miejsc (dla testu metody nr 2)
        Customer customer = new Customer("Jan Kowalski");
        Seat seat1 = room1.getSeats().get(0); // pobieramy pierwsze wolne miejsce
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