import java.util.Scanner;

public class ISBN2 {
    public static void main(String[] args){
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        Scanner a=new Scanner(System.in);
        int input=a.nextInt();
        int sum=0;
        int n=9;
        int m=input;
        while (input>0){
            sum+=(input%10)*n;
            input=input / 10;
            n--;
        }
        System.out.print("The ISBN-10 number is 0");
        System.out.print(m);
        if((sum % 11)!=10)System.out.print(sum%11);
        else System.out.print('X');
    }
}
