import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args) 
    {
        int n,s=0,r;
        Scanner myinput=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=myinput.nextInt();
        while(n>0)
        {
            r=n%10;    
            s=(s*10)+r;    
            n=n/10;
              
        }
        System.out.println("Reverse number is: "+s);
    }

}