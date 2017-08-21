import java.util.Scanner;

public class Sleepy_Tom_Cat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int holidays = Integer.parseInt(input.nextLine());
        int days = 30000;
        int workingDays = (365 - holidays) * 63;

        int gamePlay = ((workingDays) + (holidays * 127));
        int difference;
        int minutes;

        if(days > gamePlay) {
            difference = days - gamePlay;
            int hours = difference / 60;
            minutes = hours % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }
        else {
            difference =  Math.abs(days - gamePlay);
            int hours = difference / 60;
            minutes = difference % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }
    }

}
