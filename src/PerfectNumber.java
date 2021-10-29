public class PerfectNumber {
    public static void main(String[] args){
        int i,j;
        int sum;
        for(i=6;i<10000;i++){
            sum=0;
            for(j=1;j<i;j++){
                if(i%j==0)
                    sum+=j;
            }
            if(sum==i)
                System.out.println(i);
        }
    }
}
