class Const
{
    int x;
    Const()
    {
        System.out.println("Constructor called");
        x=100;
    }
    public static void main(String[] args) 
    {
        Const c=new Const();
        System.out.println(c.x);
        
    }
}