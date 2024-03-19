import java.util.ArrayList;

public class Album {
    // Attributes
    private String name;
    private int year;
    
    ArrayList<Song> songList = new ArrayList<Song>();

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    // Getters
    public String getName() {
        return this.name;
    }
    public int getYear() {
        return this.year;
    }
}