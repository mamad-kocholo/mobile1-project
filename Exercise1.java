
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter internet volume (GB): ");
        String volumeText = input.nextLine();

        System.out.print("Enter wallet balance (Toman): ");
        String balanceText = input.nextLine();

        double volume = Double.parseDouble(volumeText);
        double balance = Double.parseDouble(balanceText);

        if (volume <= 0 || balance < 0) {
            System.out.println("Invalid volume or balance");
        } else {

            double price = volume * 5000;

            if (volume > 10) {
                price = price - (price * 0.15);
            }

            if (balance >= price) {
                double remaining = balance - price;

                System.out.println("Purchase successful!");
                System.out.println("Remaining balance: " + remaining);
            } else {
                double shortage = price - balance;

                System.out.println("Not enough balance!");
                System.out.println("Shortage: " + shortage);
            }
        }

        input.close();
    }
}
