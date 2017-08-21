import java.util.Scanner;

public class Transport_Price {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String dayOrNight = input.nextLine();

        double taxiTax = 0.70;
        double dayTaxi = 0.79;
        double nightTaxi = 0.90;

        double busTax = 0.09;
        double trainTax = 0.06;

        double totalCharge = 0;

        switch (dayOrNight) {
            case "day": {
                if (n >= 100) {
                    totalCharge += n * trainTax;
                    break;
                } else if(n >= 20 && n < 100) {
                    totalCharge += n * busTax;
                    break;
                }else {
                    totalCharge+=taxiTax + (n * dayTaxi);
                    break;
                }
            }
            case "night": {
                if (n >= 100) {
                    totalCharge += n * trainTax;
                    break;
                } else if(n >= 20 && n < 100) {
                    totalCharge += n * busTax;
                    break;
                }else {
                    totalCharge+=taxiTax + (n * nightTaxi);
                    break;
                }
            }
        }
        System.out.printf("%.2f", totalCharge);
    }
}
