import java.util.Scanner;

public class Judgement3 {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        double a,b;
        System.out.print("Enter a point's x- and y-coordinates:  ");
        a= inp.nextDouble();
        b= inp.nextDouble();
        if(a<0 || b<0 || 2*b+a>200){
            System.out.print("The point is not in the triangle");
        }
        else{
            System.out.print("The point is in the triangle");
        }
    }
}
