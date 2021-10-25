import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        for(int n=1;n<a+1;n++){
            int t = n;
            for(int i =1;i<=a*2-1;i++){
                if(i<(a-n)){
                    System.out.printf("%5c",' ');
                }
                else if(i<=a && i>=a-n+1){
                    System.out.printf("%5d",t);
                    t-=1;
                }
                else if(i>a && i<=a+n-1){
                    t=i-a+1;
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
