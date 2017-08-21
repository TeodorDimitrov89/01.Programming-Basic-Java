import java.util.Scanner;

public class Greeting_By_Name {
    public static void main(String[] args) {
        Scanner stringName = new Scanner(System.in);
        String name = stringName.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
