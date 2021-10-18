import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        int password=(int)(Math.random()*900+100);
        int sum=0;
        int password1=password%10,password2=(password/10)%10,password3=password/100;
        System.out.println(password);
        Scanner input=new Scanner(System.in);
        System.out.print("Input your password : ");
        int a=input.nextInt();
        int a1=a%10,a2=(a/10)%10,a3=a/100;
        //System.out.println(a1+""+a2+""+a3+""+password1+""+password2+""+password3);
        if(a==password)
            System.out.print("Your bonus is $10000");
        else if((password1==a1&&password2==a2&&password3==a3)||(password1==a1&&password2==a3&&password3==a1)||(password1==a2&&password2==a1&&password3==a3)||(password1==a2&&password2==a3&&password3==a1)||(password1==a3&&password2==a2&&password3==a1)||(password1==a3&&password2==a1&&password3==a2))
            System.out.print("Your bonus is $3000");
        else if(password1==a1||password1==a2||password1==a3||password2==a1||password2==a2||password2==a3||password3==a1||password3==a2||password3==a3)
            System.out.print("Your bonus is $1000");

    }
}
