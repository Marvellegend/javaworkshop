public class Prime
{
    public static void main(String[] args) 
    {
        int i,j;
        for(i=2;i<100;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                    break;
                else if(i==j+1)
                    System.out.println(i);
            }
        }   
    }
}