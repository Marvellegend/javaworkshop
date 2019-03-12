interface Parent1
{
    default void Car()
    {
        System.out.println("Audi car");
    }
}
interface Parent2
{
    default void Car()
    {
        System.out.println("Benz car");
    }
}
public class MultipleInheritance implements Parent1,Parent2
{
    public void Car()
    {
        Parent1.super.Car();
    } 
    public static void main(String[] args) 
    {
        MultipleInheritance ob=new MultipleInheritance();
        ob.Car();
    }
}
