import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double budget = Double.parseDouble(input.nextLine());
        String seasons = input.nextLine();
        double amountSpent;
        switch (seasons) {
            case "summer": {
                if(budget > 1000) {
                    amountSpent = 0.9* budget;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f",amountSpent);
                    break;
                }else if(budget > 100 && budget <= 1000) {
                    amountSpent = 0.4* budget;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Camp - %.2f", amountSpent);
                    break;
                }else {
                    amountSpent = 0.3* budget;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Camp - %.2f", amountSpent);
                    break;
                }
            }
            case "winter": {
                if(budget > 1000) {
                    amountSpent = 0.9* budget;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f",amountSpent);
                }else if(budget > 100 && budget <= 1000) {
                    amountSpent = 0.8* budget;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Hotel - %.2f",amountSpent);
                }else {
                    amountSpent = 0.7* budget;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel - %.2f",amountSpent);
                }
            }
        }
    }
}
