import java.util.Scanner;

public class Vegetable_Market {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double euro = 1.94;
        double priceForVegetables = Double.parseDouble(input.nextLine());
        double priceForFruits = Double.parseDouble(input.nextLine());
        int totalKgVegetables = Integer.parseInt(input.nextLine());
        int totalKgFruits = Integer.parseInt(input.nextLine());
        double totalVegetablesPrice = priceForVegetables * totalKgVegetables;
        double totalFruitsPrice = priceForFruits * totalKgFruits;
        double total = (totalVegetablesPrice + totalFruitsPrice) / euro;
        System.out.printf("%.2f", total);
    }
}
