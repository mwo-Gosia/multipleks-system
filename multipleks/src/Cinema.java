import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private String address;
    private List<Room> rooms;           // Lista sal w tym kinie
    private List<Screening> screenings; // Lista seansów (repertuar)

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;
        this.rooms = new ArrayList<>();
        this.screenings = new ArrayList<>();
    }

    // Metoda do dodawania sal do kina
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Metoda do dodawania seansów do repertuaru
    public void addScreening(Screening screening) {
        screenings.add(screening);
    }

    // Wyświetla listę wszystkich seansów
    public void printProgramme() {
        System.out.println("--- REPERTUAR KINA: " + name + " ---");
        for (Screening s : screenings) {
            // Pobieramy tytuł filmu z obiektu Movie, który jest w seansie
            System.out.println("Film: " + s.getMovie().getTitle() + " | Godzina: " + s.getStartTime());
        }
    }

    // Szuka filmu po fragmencie tytułu (użyte w Twoim Main)
    public Movie findMovie(String titlePart) {
        for (Screening s : screenings) {
            // Sprawdzamy czy tytuł filmu zawiera szukany tekst (ignorując wielkość liter)
            if (s.getMovie().getTitle().toLowerCase().contains(titlePart.toLowerCase())) {
                return s.getMovie();
            }
        }
        System.out.println("Nie znaleziono filmu zawierającego: " + titlePart);
        return null;
    }

    // Gettery potrzebne dla klasy Main
    public List<Screening> getScreenings() {
        return screenings;
    }

    public String getName() {
        return name;
    }
}