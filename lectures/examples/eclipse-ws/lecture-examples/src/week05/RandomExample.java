package week05;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int iRand = 1 + rand.nextInt(6);
            System.out.print(iRand + " ");
        }
        System.out.print("\n\n");
        for (int i = 0; i < 10; i++) {
            double dRand = 5 + 10 * rand.nextDouble();
            System.out.println(dRand);
        }
    }
}
