import java.util.Scanner;

public class chumma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            int yearsLeft = yearsUntilNextLeapYear(year);
            System.out.println(year + " is not a leap year.");
            System.out.println("There are " + yearsLeft + " year(s) until the next leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int yearsUntilNextLeapYear(int year) {
        int yearsLeft = 4 - (year % 4);
        if (yearsLeft == 4) {
            yearsLeft = 0;
        }
        return yearsLeft;
    }
}
