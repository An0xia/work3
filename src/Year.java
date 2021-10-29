public class Year {
    public static void main(String[] args){
        int i,sum=0,a=0;
        for(i=101;i<=2100;i++){
            if(i%4==0 && i%100!=0 || i%400==0) {
                sum++;
                System.out.print(i + " ");
                if (sum == 10) {
                    System.out.println('\n');
                    sum=0;
                }
                a++;
            }
        }
        System.out.println(a);
    }
}
