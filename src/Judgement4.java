import java.util.Scanner;

public class Judgement4 {
    public static void main(String[] args){
        Scanner point=new Scanner(System.in);
        double x1,y1,x2,y2,w1,w2,h1,h2,a,b,c,d,a1,b1,c1,d1;
        System.out.print("Enter r1's x- , y- coordinates,width and height: ");
        x1=point.nextDouble();
        y1=point.nextDouble();
        w1=point.nextDouble();
        h1=point.nextDouble();
        System.out.print("Enter r2's x- , y- coordinates,width and height: ");
        x2=point.nextDouble();
        y2=point.nextDouble();
        w2=point.nextDouble();
        h2=point.nextDouble();
        a=x1-w1/2;
        b=x1+w1/2;
        c=y1-h1/2;
        d=y1+h1/2;
        a1=x2-w2/2;
        b1=x2+w2/2;
        c1=y2-h2/2;
        d1=y2+h2/2;

        if(a1>=a && b1<=b && c1>=c && d1<=d){
            System.out.println("r2 is inside r1");
        }
        else {
            boolean b2 = (d1 >= c && d1 <= d) || (c1 <= d && c1 >= c);
            boolean b3 = (b1 >= a && b1 <= b) || (a1 <= b && a1 >= a);
            if((a1>=a && a1<=b1 && b2 && b1>b) ||(a1<a && b1>=a && b2 && b1<=b) || (c1>=c && c1<=d && b3 && d1>d) || (c1<c && ((b1>=a && b1<=b) || (a1<=b && a1>=a)) && d1>=c && d1<=d)){
                System.out.println("r2 overlaps r1");
            }
            else{
                System.out.println("r2 does not overlap r1");
            }
        }

    }
}
