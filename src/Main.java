import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner year = new Scanner(System.in);
        System.out.println("Please enter: ");
        int LeapYear = year.nextInt();

        if (LeapYear % 4 == 0 && LeapYear % 100 != 0 || LeapYear % 400 == 0) {
            System.out.println("It's a leap year");
        } else {
            System.out.println("It's not a Leap");

        }

        year.close();

    }
}