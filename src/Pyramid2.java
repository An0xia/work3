import java.util.Scanner;

public class Pyramid2 {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        for(int n=1;n<a+1;n++){
            int t = 1;
            for(int i =1;i<=a*2-1;i++){
                if(i<(a-n)){
                    System.out.printf("%5c",' ');
                }
                else if(i<=a && i>=a-n+1){
                    System.out.printf("%5d",t);
                    t*=2;
                }
                else if(i>a && i<=a+n-1){
                    t= (int) ((int) Math.pow(2,n-1)/(Math.pow(2,i-a)));
                    System.out.printf("%5d",t);

                }
                else{
                    System.out.printf("%5c",' ');
                }

            }
            System.out.println();
        }
    }
}
