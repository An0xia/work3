import java.util.Scanner;

public class Judgement {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        int a,b;
        a= inp.nextInt();
        b= inp.nextInt();
        if((a*a+b*b)>100){
            System.out.print("Point "+"("+(double)a+" , "+ (double)b+")"+" is not in the circle");
        }
        else{
            System.out.print("Point "+"("+(double)a+" , "+ (double)b+")"+" is in the circle");
        }
    }
}
