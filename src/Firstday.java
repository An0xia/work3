import java.util.Scanner;

public class Firstday {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int year, day;
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        year = a.nextInt();
        day = a.nextInt();
        System.out.println("January 1, " + year + " is " + week[day]);
        day = (day + 31) % 7;
        System.out.println("February 1, " + year + " is " + week[day]);
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            day = (day + 29) % 7;
        else
            day = (day + 28) % 7;
        System.out.println("March 1, " + year + " is " + week[day]);
        day = (day + 31) % 7;
        System.out.println("April 1, " + year + " is " + week[day]);
        day = (day + 30) % 7;
        System.out.println("May 1, " + year + " is " + week[day]);
        day = (day + 31) % 7;
        System.out.println("June 1, " + year + " is " + week[day]);
        day = (day + 30) % 7;
        System.out.println("July 1, " + year + " is " + week[day]);
        day = (day + 31) % 7;
        System.out.println("August 1, " + year + " is " + week[day]);
        day = (day + 31) % 7;
        System.out.println("September 1, " + year + " is " + week[day]);
        day = (day + 30) % 7;
        System.out.println("October 1, " + year + " is " + week[day]);
        day = (day + 31) % 7;
        System.out.println("November 1, " + year + " is " + week[day]);
        day = (day + 30) % 7;
        System.out.println("December 1, " + year + " is " + week[day]);
    }
}
