import java.util.Scanner;

public class Rectangle_Area_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = Double.parseDouble(input.nextLine());
        double y1 = Double.parseDouble(input.nextLine());

        double x2 = Double.parseDouble(input.nextLine());
        double y2 = Double.parseDouble(input.nextLine());
        double area = Math.abs((x1 - x2) * (y1 - y2));
        double perimeter = (Math.abs((x1 - x2)) + Math.abs((y1 - y2))) * 2;
        System.out.printf("%.0f%n", area);
        System.out.printf("%.0f%n", perimeter);
    }
}
