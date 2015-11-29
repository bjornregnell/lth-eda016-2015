package week13.hanoi;

public class Disk {
    private int size;

    /** Skapar en bricka med storleken size */
    public Disk(int size) {
        this.size = size;
    }

    /** Tar reda på brickans storlek */
    public int getSize() {
        return size;
    }
}