import java.util.Scanner;

public class rate {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int LA,year;
        double rate,payment,monthlypayment,totalpayment;
        System.out.print("Loan Amount: ");
        LA=a.nextInt();
        System.out.print("Number of Years: ");
        year=a.nextInt();
        System.out.println("Interest Rate     Monthly Payment    Totally Payment");
        for(rate=0.05;rate<=0.081;rate+=0.00125){
            monthlypayment=(LA*rate/12)/(1-1/(Math.pow(1+rate/12,year*12)));
            totalpayment=monthlypayment*year*12;
            System.out.println(String.format("%.3f", rate*100)+"%             "+String.format("%.2f", monthlypayment)+"              "+String.format("%.2f", totalpayment));
        }

    }
}
