import java.util.Scanner;

public class Match_Tickets {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double budget = Double.parseDouble(input.nextLine());
        String category = input.nextLine();

        int people = Integer.parseInt(input.nextLine());
        double vip = 499.99;
        double normal = 249.99;
        double moneyLeft = 0;
        double ticketPrice;
        if(people >= 1 && people <= 4) {
            moneyLeft = budget - (0.75 * budget);
        } else if (people >= 5 && people <= 9) {
            moneyLeft = budget - (0.60 * budget);
        } else if (people >= 10 && people <= 24) {
            moneyLeft = budget - (0.50 * budget);
        } else if (people >= 25 && people <= 49) {
            moneyLeft = budget - (0.40 * budget);
        } else if (people >= 50) {
            moneyLeft = budget - (0.25 * budget);
        }
        switch(category) {
            case "VIP": {
                ticketPrice = vip * people;
                if (ticketPrice < moneyLeft) {
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft - ticketPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", ticketPrice - moneyLeft);
                }
                break;
            }
            case "Normal": {
                ticketPrice = normal * people;
                if (ticketPrice < moneyLeft) {
                    System.out.printf("Yes! You have %.2f leva left.", moneyLeft - ticketPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", ticketPrice - moneyLeft);
                }
                break;
            }
        }

    }
}
