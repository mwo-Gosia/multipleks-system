public class Main {
    public static void main(String[] args) {
        MultiplexSystem system = new MultiplexSystem("Sieć Kin Mulipleks");

        Cinema cinema1 = new Cinema("Super Tarasy", "ul. Akademicka 5");
        system.addCinema(cinema1);

        //... configuration and test data should be inserted here...
        Movie movie1 = new Movie("James Bond", 120, "Akcja");
        Room room1 = new Room(1, 10, 50);

        Screening screening1 = new Screening(movie1, room1, "2026-02-20", "18:00", "20:00");
        cinema1.addScreening(screening1);

        Cinema cinema2 = new Cinema("Kino Galeria", "ul. Krakowska 10");
        system.addCinema(cinema2);

        Room room2 = new Room(2, 5, 5); // Mniejsza sala: 5 rzędów, 5 miejsc
        cinema2.addRoom(room2);

        Movie movie2 = new Movie("Avatar", 160, "Sci-Fi");
        Screening screening2 = new Screening(movie2, room2, "2026-02-21", "20:00", "22:40");
        cinema2.addScreening(screening2);

        Customer customer = new Customer("Jan Kowalski");
        Seat seat1 = room1.getSeats().get(0);
        Seat seat2 = room1.getSeats().get(1);
        Seat seat3 = room1.getSeats().get(2);

        // below you will find sample function executions
//        cinema1.printProgramme();
//        Screening screening = cinema1.getScreenings().get(0);
//        screening.reservePlaces("H34", "H35", "H36"); // seats number given
//        screening.reservePlaces(seat1, seat2, seat3); // other option
//        screening.reservePlaces(customer, "H34", "H35", "H36"); // reservation for registered customer
//        movie1 = cinema1.findMovie("James Bon");
//        if (movie1 != null) {
//            System.out.println("Znaleziono film: " + movie1.getTitle());
//        }
        System.out.println("\n=== LISTA WSZYSTKICH KIN W SYSTEMIE ===");
        for (Cinema c : system.getCinemas()) {
            c.printProgramme();
        }

        // Wyświetlenie repertuaru
        System.out.println("\n[TEST 1] Repertuar pierwszego kina:");
        cinema1.printProgramme();

        // Rezerwacja VIP (z dopłatą)
        System.out.println("\n[TEST 2] Rezerwacja seansu VIP:");
        VipScreening vipShow = new VipScreening(movie1, room1, "2026-02-24", "21:00", "23:00", 15.0);
        cinema1.addScreening(vipShow);
        Reservation resVip = vipShow.reservePlaces(customer, "H32", "H35");
        if (resVip != null) resVip.printReservationDetails();

        // Rezerwacja 3D (z okularami)
        System.out.println("\n[TEST 3] Rezerwacja seansu 3D:");
        Screening3D show3D = new Screening3D(movie2, room2, "2026-02-23", "14:00", "16:30", 5.0);
        cinema2.addScreening(show3D);
        Reservation res3D = show3D.reservePlaces(customer, "A1", "A2");
        if (res3D != null) res3D.printReservationDetails();

        // Wyszukiwanie filmu
        System.out.println("\n[TEST 4] Wyszukiwanie filmu:");
        Movie foundMovie = cinema1.findMovie("James Bond");
        if (foundMovie != null) {
            System.out.println("Znaleziono: " + foundMovie.getTitle() + " (gatunek filmowy: " + foundMovie.getType() + ")");
        } else {
            System.out.println("Nie znaleziono filmu.");
        }
    }
}