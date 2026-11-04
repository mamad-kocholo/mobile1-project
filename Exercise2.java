
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean notifications = true;

        System.out.println("1. Enable notifications");
        System.out.println("2. Disable notifications");
        System.out.println("3. Show notification status");
        System.out.println("4. Reset default settings");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {

            case 1:
                notifications = true;
                System.out.println("Notifications enabled");
                break;

            case 2:
                notifications = false;
                System.out.println("Notifications disabled");
                break;

            case 3:
                if (notifications == true) {
                    System.out.println("Notifications are enabled");
                } else {
                    System.out.println("Notifications are disabled");
                }
                break;

            case 4:
                notifications = true;
                System.out.println("Settings restored to default");
                break;

            default:
                System.out.println("Invalid option");
        }

        input.close();
    }
}

