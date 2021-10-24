import java.util.Scanner;

public class Judgement2 {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int a,b;
        System.out.print("Enter a point with two coordinates: ");
        a= inp.nextInt();
        b= inp.nextInt();
        if(Math.abs(a)>5 || Math.abs(b)>2.5){
            System.out.print("Point "+"("+(double)a+" , "+ (double)b+")"+" is not in the rectangle");
        }
        else{
            System.out.print("Point "+"("+(double)a+" , "+ (double)b+")"+" is in the rectangle");
        }
    }
}
