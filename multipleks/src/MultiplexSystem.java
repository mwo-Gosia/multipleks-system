import java.util.ArrayList;
import java.util.List;

public class MultiplexSystem {

    private String name;
    private List<Cinema> cinemas;

    public MultiplexSystem(String name) {
        this.name = name;
        this.cinemas = new ArrayList<>();
    }

    public void addCinema(Cinema cinema) {
        cinemas.add(cinema);
    }

    public String getName() {
        return name;
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }
}