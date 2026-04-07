class Employee1
{
    int empno;
    String name;
    Employee1(int e,String n)
    {
        empno=e;
        name=n;
    }
    void display()
    {
        System.out.println("Employee Details:");
        System.out.println("---------------");
        System.out.println("Name:"+name);
        System.out.println(" Employee no:"+empno);
    }
}
public class ConstructorDe
{
    public static void main(String[] args)
     {
        Employee1 ob=new Employee1(12,"Anu");
        ob.display();
    } 
}
 