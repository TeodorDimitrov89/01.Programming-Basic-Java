import java.util.Scanner;

public class Training_Lab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = Double.parseDouble(input.nextLine()) * 100;
        double height = Double.parseDouble(input.nextLine()) * 100;

        double rows = (Math.floor(width / 120));
        height = Math.floor((height - 100) / 70);
        double total = rows * height - 3;
        System.out.println(total);
    }
}
