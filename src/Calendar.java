import java.util.Scanner;

public class Calendar {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int year, day,i,j,b;

        year = a.nextInt();
        day = a.nextInt();
        System.out.println("\t\t\tJanuary"+year);
        System.out.println("____________________________________________");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(j=0;j<day;j++) {
            System.out.print("\t");
        }
        for(i=1;i<=31;i++){
            if(j<7) {
                System.out.print(i + "\t");
                j++;
            }
            else{
                j=1;
                System.out.print("\n");
                System.out.print(i+"\t");
            }
        }
        System.out.print("\n");
        day = (day + 31) % 7;
        System.out.println("\t\t\tFebruary"+year);
        System.out.println("____________________________________________");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(j=0;j<day;j++) {
            System.out.print("\t");
        }
        final boolean b1 = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (b1)
            b =29;
        else
            b = 28;
        for(i=1;i<=b;i++){
            if(j<7) {
                System.out.print(i + "\t");
                j++;
            }
            else{
                j=1;
                System.out.print("\n");
                System.out.print(i+"\t");
            }
        }
        System.out.print("\n");
        if (b1)
            day = (day + 29) % 7;
        else
            day = (day + 28) % 7;
        System.out.println("\t\t\tMarch"+year);
        System.out.println("____________________________________________");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(j=0;j<day;j++) {
            System.out.print("\t");
        }
        for(i=1;i<=31;i++){
            if(j<7) {
                System.out.print(i + "\t");
                j++;
            }
            else{
                j=1;
                System.out.print("\n");
                System.out.print(i+"\t");
            }
        }
        System.out.print("\n");
        day = (day + 31) % 7;
        System.out.println("\t\t\tApril"+year);
        System.out.println("____________________________________________");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(j=0;j<day;j++) {
            System.out.print("\t");
        }
        for(i=1;i<=30;i++){
            if(j<7) {
                System.out.print(i + "\t");
                j++;
            }
            else{
                j=1;
                System.out.print("\n");
                System.out.print(i+"\t");
            }
        }
        System.out.print("\n");
        day = (day + 30) % 7;
        System.out.println("\t\t\tMay"+year);
        System.out.println("____________________________________________");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(j=0;j<day;j++) {
            System.out.print("\t");
        }
        for(i=1;i<=31;i++){
            if(j<7) {
                System.out.print(i + "\t");
                j++;
            }
            else{
                j=1;
                System.out.print("\n");
                System.out.print(i+"\t");
            }
        }
        System.out.print("\n");
        day = (day + 31) % 7;
        System.out.println("\t\t\tJune"+year);
        System.out.println("____________________________________________");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(j=0;j<day;j++) {
            System.out.print("\t");
        }
        for(i=1;i<=30;i++){
            if(j<7) {
                System.out.print(i + "\t");
                j++;
            }
            else{
                j=1;
                System.out.print("\n");
                System.out.print(i+"\t");
            }
        }
        System.out.print("\n");
        day = (day + 30) % 7;
        System.out.println("\t\t\tJuly"+year);
        System.out.println("____________________________________________");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(j=0;j<day;j++) {
            System.out.print("\t");
        }
        for(i=1;i<=31;i++){
            if(j<7) {
                System.out.print(i + "\t");
                j++;
            }
            else{
                j=1;
                System.out.print("\n");
                System.out.print(i+"\t");
            }
        }
        System.out.print("\n");
        day = (day + 31) % 7;
        System.out.println("\t\t\tAugust"+year);
        System.out.println("____________________________________________");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(j=0;j<day;j++) {
            System.out.print("\t");
        }
        for(i=1;i<=31;i++){
            if(j<7) {
                System.out.print(i + "\t");
                j++;
            }
            else{
                j=1;
                System.out.print("\n");
                System.out.print(i+"\t");
            }
        }
        System.out.print("\n");
        day = (day + 31) % 7;
        System.out.println("\t\t\tSeptember"+year);
        System.out.println("____________________________________________");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(j=0;j<day;j++) {
            System.out.print("\t");
        }
        for(i=1;i<=30;i++){
            if(j<7) {
                System.out.print(i + "\t");
                j++;
            }
            else{
                j=1;
                System.out.print("\n");
                System.out.print(i+"\t");
            }
        }
        System.out.print("\n");
        day = (day + 30) % 7;
        System.out.println("\t\t\tOctober"+year);
        System.out.println("____________________________________________");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(j=0;j<day;j++) {
            System.out.print("\t");
        }
        for(i=1;i<=31;i++){
            if(j<7) {
                System.out.print(i + "\t");
                j++;
            }
            else{
                j=1;
                System.out.print("\n");
                System.out.print(i+"\t");
            }
        }
        System.out.print("\n");
        day = (day + 31) % 7;
        System.out.println("\t\t\tNovember"+year);
        System.out.println("____________________________________________");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(j=0;j<day;j++) {
            System.out.print("\t");
        }
        for(i=1;i<=30;i++){
            if(j<7) {
                System.out.print(i + "\t");
                j++;
            }
            else{
                j=1;
                System.out.print("\n");
                System.out.print(i+"\t");
            }
        }
        System.out.print("\n");
        day = (day + 30) % 7;
        System.out.println("\t\t\tDecember"+year);
        System.out.println("____________________________________________");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for(j=0;j<day;j++) {
            System.out.print("\t");
        }
        for(i=1;i<=30;i++){
            if(j<7) {
                System.out.print(i + "\t");
                j++;
            }
            else{
                j=1;
                System.out.print("\n");
                System.out.print(i+"\t");
            }
        }

    }
}
