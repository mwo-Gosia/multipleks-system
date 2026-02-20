public class Movie {
    private String title;
    private int duration; // czas w minutach
    private String type; // np. Akcja, Dramat

    public Movie(String title, int duration, String type) {
        this.title = title;
        this.duration = duration;
        this.type = type;
    }

    // Gettery są potrzebne, by inne klasy mogły odczytać dane filmu
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getType() {
        return type;
    }
}