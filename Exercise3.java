
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter total cost: ");
            String costText = input.nextLine();

            System.out.print("Enter number of people: ");
            String peopleText = input.nextLine();

            double cost = Double.parseDouble(costText);
            int people = Integer.parseInt(peopleText);

            if (cost < 0) {
                System.out.println("Cost cannot be negative");
            } else if (people < 0) {
                System.out.println("Number of people cannot be negative");
            } else if (people == 0) {
                System.out.println("Number of people cannot be zero");
            } else {
                double share = cost / people;

                System.out.println("Share for each person: " + share);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }

        input.close();
    }
}
