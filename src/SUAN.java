import java.util.Scanner;

public class SUAN {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double b,c,d,e,f,g,h,i,j,k;
        b=a.nextDouble();
        c=a.nextDouble();
        d=a.nextDouble();
        e=a.nextDouble();
        f=a.nextDouble();
        g=a.nextDouble();
        h=a.nextDouble();
        i=a.nextDouble();
        j=a.nextDouble();
        k=a.nextDouble();
        double sum;
        double ad,ad1;
        sum=b+c+d+e+f+g+h+j+k+i;
        ad=sum/10;
        System.out.println("The mean is "+String.format("%.2f",ad));
        ad1=Math.sqrt(((b*b+c*c+d*d+e*e+f*f+g*g+h*h+i*i+j*j+k*k)-sum*sum/10)/9);
        System.out.println("The standard deviation is "+ad1);
    }
}
