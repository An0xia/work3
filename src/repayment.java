import java.util.Scanner;

public class repayment {
    public static void main(String[] args){

        Scanner a=new Scanner(System.in);
        int year;
        double amount,rate;
        System.out.print("Loan Amount: ");
        amount=a.nextInt();
        System.out.print("Number of Years: ");
        year=a.nextInt();
        System.out.print("Annual Interest Rate: ");
        rate=a.nextDouble();
        System.out.print("\n");
        double monthlyPayment = (amount * rate / 1200) / (1 - 1 / Math.pow(1 + rate / 1200, year * 12));
        double totalPayment = monthlyPayment * year * 12;
        System.out.println("Monthly Payment: " +String.format("%.2f", monthlyPayment));
        System.out.println("Total Payment: " + String.format("%.2f",totalPayment));

        System.out.println("Payment# Interest\t\tPrincipal\t\tBalance");
        // for循环
        double interest, principal;
        for(int i = 1;i <= year * 12;i++){
            interest = rate / 1200 * amount;
            principal = monthlyPayment - interest;
            amount -= principal;
            if(i == year * 12)
                principal += amount;
            System.out.print(i + "\t\t ");
            System.out.printf("%5.2f\t\t%6.2f\t\t%7.2f\n", interest, principal, amount);
        }

    }
}
