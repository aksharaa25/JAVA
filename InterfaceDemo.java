interface Vehicle
{
    String NAME="i10";
    void msg();
}
class Car implements Vehicle
{
    
    int cno=6789;
    public void msg()
    {
        System.out.println("VECHILE NAME: "+NAME);
        System.out.println("VEHICLE NO: "+cno);
    }
}
class InterfaceDemo
{
    public static void main(String args[])
    {
        Car ob=new Car();
        ob.msg();
    }
}