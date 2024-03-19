import java.util.ArrayList;

public class Artist {
    // Attributes
    private String name;
    private boolean isGroup;

    ArrayList<Album> albumList = new ArrayList<Album>();

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setisGroup(boolean isGroup) {
        this.isGroup = isGroup;
    }
    
    // Getters
    public String getName() {
        return this.name;
    }
    public boolean getisGroup() {
        return this.isGroup;
    }
}
