abstract class Media implements Playable, Comparable{
    //Attributes
    private String filename;
    private int length;

    // Logic
    public int compareTo(Media other) {
        return Integer.compare(this.length, other.length);
    }

    public abstract void play();
}
