public class Movie {
    private String title;
    private int duration; // czas w minutach
    private String type;

    public Movie(String title, int duration, String type) {
        this.title = title;
        this.duration = duration;
        this.type = type;
    }

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