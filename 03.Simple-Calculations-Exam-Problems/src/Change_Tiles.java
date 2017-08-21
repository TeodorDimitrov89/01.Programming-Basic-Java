import java.util.Scanner;

public class Change_Tiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        double tilesWidth = Double.parseDouble(input.nextLine());
        double tilesLength = Double.parseDouble(input.nextLine());
        int benchWidth = Integer.parseInt(input.nextLine());
        int benchLength = Integer.parseInt(input.nextLine());

        double areaLanding = Math.pow(n,2);
        double areaBench = benchWidth * benchLength;

        double neededArea = areaLanding - areaBench;
        double areaTiles = tilesWidth* tilesLength;

        double totalTiles = neededArea / areaTiles;
        double timeNeeded = totalTiles * 0.2;
        System.out.printf("%.2f%n", totalTiles);
        System.out.printf("%.2f", timeNeeded);
    }
}
