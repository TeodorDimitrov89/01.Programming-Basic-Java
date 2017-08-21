import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int xVineyard = Integer.parseInt(input.nextLine());
        double yVineyard = Double.parseDouble(input.nextLine());
        int zNeededWine = Integer.parseInt(input.nextLine());
        int workers = Integer.parseInt(input.nextLine());

        double totalGapes = xVineyard * yVineyard;
        double wine = (0.4 *totalGapes) / 2.5;


        if(wine >= zNeededWine) {
            double leftWine = Math.ceil(wine - zNeededWine);
            double litersForWorkers = Math.ceil(leftWine/workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", leftWine, litersForWorkers);
        } else {
            double needWine = Math.floor(zNeededWine - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", needWine);

        }
    }
}
