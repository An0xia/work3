public class card {
    public static void main(String[] args){
        int a=(int)(Math.random()*13)+1;
        int b=(int)(Math.random()*4)+1;
        String[] list1 = {"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] list2 = {"Clubs","Diamonds","Hearts","Spades"};
        System.out.print("The card you picked is "+list2[b]+" of "+list1[a]);
    }
}
