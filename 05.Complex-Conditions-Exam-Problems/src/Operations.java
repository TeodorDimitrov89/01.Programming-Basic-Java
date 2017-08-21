import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = Integer.parseInt(input.nextLine());
        int n2 = Integer.parseInt(input.nextLine());
        String operation = input.nextLine();
        int result;
        if(n2 == 0) {
            System.out.printf("Cannot divide %d by zero", n1);
            return;
        }

        if ( operation.equals("/")) {
            System.out.printf("%d / %d = %.2f", n1, n2, (double)n1 / n2);
        }
        if ( operation.equals("%")) {
            System.out.printf("%d %% %d = %d", n1, n2,n1%n2);
        }

        if (operation.equals("+") || operation.equals("-") || operation.equals("*")){
           switch (operation) {
               case "+": {
                   result = n1 + n2;
                   System.out.printf("%d %s %d = %d - %s", n1, operation, n2, result,result % 2 == 0 ? "even": "odd" );
                    break;
               }
               case "-": {
                   result = n1 - n2;
                   System.out.printf("%d %s %d = %d - %s", n1, operation, n2, result, result % 2 == 0 ? "even": "odd" );
                    break;
               }
               default: {
                   result = n1 * n2;
                   System.out.printf("%d %s %d = %d - %s", n1, operation, n2, result, result % 2 == 0 ? "even": "odd" );
                   break;
               }
           }
        }
    }
}
