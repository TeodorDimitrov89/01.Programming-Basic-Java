import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        System.out.println(new String(new char[n]).replace("\0", "*"));

        for (int i = 0; i < n-2; i++) {
            System.out.print("*");
            for (int j = 0; j < n-2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.println(new String(new char[n]).replace("\0", "*"));
    }
}
