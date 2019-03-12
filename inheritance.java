class A
{
    public void Car()
    {
        System.out.println("Audi car");
    }
}
class B extends A
{
    public void bike()
    {
        System.out.println("Duke bike");
    } 
}
public class inheritance
{
    public static void main(String[] args) 
    {
        B ob=new B();
        ob.Car();
        ob.bike();    
    }
}
