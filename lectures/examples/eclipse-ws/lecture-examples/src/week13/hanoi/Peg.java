package week13.hanoi;

import java.util.ArrayList;

class Peg {
    private ArrayList<Disk> disks;
    
    /** Skapar en tom pinne */
    public Peg() {
        disks = new ArrayList<Disk>();
    }
    
    /** Tar reda på numret på den översta brickan, Integer.MAX_VALUE om pinnen är tom */
    public int getTopDiskSize() {
        return (!disks.isEmpty()) ?
                disks.get(disks.size() - 1).getSize() :
                Integer.MAX_VALUE;
    }
    
    /** Lägger brickan d överst på pinnen */
    public void putDisk(Disk d) {
        disks.add(d);
    }
    
    /** Hämtar och tar bort den översta brickan */
    public Disk getDisk() {
        Disk d = disks.remove(disks.size() - 1);
        return d;
    }
}
