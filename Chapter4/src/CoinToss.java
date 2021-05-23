import java.util.Random;

public class CoinToss {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int count = 0; count < 10; count++) {
            if (rand.nextInt(2) == 0) {
                System.out.println("Tails");
            } else {
                System.out.println("Heads");
            }
        }
    }

}
