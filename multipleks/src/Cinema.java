import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private String address;
    private List<Room> rooms;
    private List<Screening> screenings;

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;
        this.rooms = new ArrayList<>();
        this.screenings = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addScreening(Screening screening) {
        screenings.add(screening);
    }

    public void printProgramme() {
        System.out.println("--- REPERTUAR KINA: " + name + " ---");
        for (Screening s : screenings) {

            System.out.println("Data: " + s.getDate() + " | Film: " + s.getMovie().getTitle() + " | Godzina: " + s.getStartTime());
        }
    }

    public Movie findMovie(String titlePart) {
        for (Screening s : screenings) {

            if (s.getMovie().getTitle().toLowerCase().contains(titlePart.toLowerCase())) {
                return s.getMovie();
            }
        }
        System.out.println("Nie znaleziono filmu zawierającego: " + titlePart);
        return null;
    }

    public List<Screening> getScreenings() {
        return screenings;
    }

    public String getName() {
        return name;
    }
}