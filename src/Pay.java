public class Pay {
    public static void main(String[] args){
        int p=10000,sum=0,q;
        for(int i = 1;i <= 10;i ++){
            p*=1.05;
        }
        q=p;
        for(int i = 1;i<=4;i++){
            sum+=p*1.05;
            p*=1.05;
        }
        System.out.print(q+" "+sum);
    }
}
