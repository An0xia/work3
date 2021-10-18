import java.util.Scanner;

public class TriangleSideLength {
    public static void main(String[] args){
        System.out.print("Input three numbers : ");
        Scanner side=new Scanner(System.in);
        int a= side.nextInt();
        int b= side.nextInt();
        int c= side.nextInt();
        final int max = Math.max(Math.max(a, b), c);

        if((a+b+c- max)> max){
            System.out.print("Legal");
        }
        else{
            System.out.print("Illegal");
        }
    }
}
