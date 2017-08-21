import java.util.Scanner;

public class Inches_To_Centimeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = Double.parseDouble(input.nextLine());
        double result = number * 2.54;
        System.out.println(result);
    }
}
