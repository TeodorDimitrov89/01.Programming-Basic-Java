import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("a = ");
        int a = Integer.parseInt(number.nextLine());
        int area = (int)Math.pow(a, 2);
        System.out.print("Square = " + area);
    }
}
