import java.util.Scanner;

public class Daily_Earnings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int workingDays = Integer.parseInt(input.nextLine());
        double earnMoneyPerDay = Double.parseDouble(input.nextLine());
        double monetaryRate = Double.parseDouble(input.nextLine());


        double oneMonthSalary = workingDays * earnMoneyPerDay;
        double incomePerYear = (oneMonthSalary * 12) + (oneMonthSalary * 2.5);
        double taxRate = (25 * incomePerYear) / 100;

        double totalIncomePerYear = (incomePerYear - taxRate) * monetaryRate;
        double result = totalIncomePerYear / 365;
        System.out.printf("%.2f", result);
    }
}
