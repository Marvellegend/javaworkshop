import java.util.Scanner;
public class Addprm{
    public static void main(String[] args) {
        Scanner myinput=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first number :");
        a=myinput.nextInt();
        System.out.println("Enter the second number :");
        b=myinput.nextInt();
        a=a+b;
        System.out.println("sum is:"+a);
    }
}