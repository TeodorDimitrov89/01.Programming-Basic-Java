import java.util.Scanner;

public class Rectangle_Area_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = Double.parseDouble(input.nextLine());
        double y1 = Double.parseDouble(input.nextLine());

        double x2 = Double.parseDouble(input.nextLine());
        double y2 = Double.parseDouble(input.nextLine());

        double length = Math.abs(x1 - x2);
        double height = Math.abs(y1 - y2);

        double area = length * height;
        double perimeter = 2 * length + 2* height;

        System.out.println(area);
        System.out.println(perimeter);
    }
}
