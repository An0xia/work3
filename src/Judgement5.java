import java.util.Scanner;

public class Judgement5 {
    public static void main(String[] args){
        Scanner point=new Scanner(System.in);
        double x1,y1,x2,y2,r1,r2,d;
        System.out.print("Enter circle1's center x- , y-coordinates , and radius: ");
        x1=point.nextDouble();
        y1=point.nextDouble();
        r1=point.nextDouble();
        System.out.print("Enter circle2's center x- , y-coordinates , and radius: ");
        x2=point.nextDouble();
        y2=point.nextDouble();
        r2=point.nextDouble();
        d=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        if(d<=Math.abs(r1-r2)){
            System.out.println("circle2 is inside circle1");
        }
        else if(d>=Math.abs(r1+r2)){
            System.out.println("circle2 does not overlap circle1");
        }
        else{
            System.out.println("circle2 overlaps circle1");
        }
    }
}
