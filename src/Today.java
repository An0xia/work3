import java.util.Scanner;

public class Today {
    public static void main(String[] args){
        System.out.print("Enter year : (e.g.,2012):");
        Scanner a=new Scanner(System.in);
        int year = a.nextInt();
        System.out.print("Enter month: 1-12 : ");
        int month = a.nextInt();
        System.out.print("Enter the day of the month: 1-31 : ");
        int day = a.nextInt();
        if(month == 1 || month == 2){
            month+=12;
            year-=1;
        }
        System.out.print("Day of the week is ");
        String[] mylist = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        int h=(day+26*(month+1)/10+(year%100)*5/4+year/100/4+5*year/100)%7;
        System.out.print(mylist[h]);
    }
}
