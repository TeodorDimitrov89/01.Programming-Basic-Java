import java.util.Scanner;

public class Circle_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = Double.parseDouble(input.nextLine());
        double area = Math.PI * Math.pow(r, 2);
        double perimeter = 2 * Math.PI * r;
        System.out.printf("Area = %f%n", area);
        System.out.printf("Perimeter = %f", perimeter);
    }
}
