import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bitCoinCount = Integer.parseInt(input.nextLine());
        double chineseYuan = Double.parseDouble(input.nextLine());
        double commission = Double.parseDouble(input.nextLine());

        // 1 биткойн = 1168 лева.
        // 1 китайски юан = 0.15 долара.
        // 1 долар = 1.76 лева.
        // 1 евро = 1.95 лева.

        double bitCoinInLevs = (double)bitCoinCount * 1168;
        double chineseYuanInLevs = chineseYuan * 0.15 * 1.76;

        double totalEuros = (bitCoinInLevs + chineseYuanInLevs) / 1.95;
        double totalCommission = (commission * totalEuros) / 100;
        double result = totalEuros - totalCommission;
        System.out.printf("%.2f", result);
    }
}
