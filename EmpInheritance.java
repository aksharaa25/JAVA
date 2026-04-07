import java.util.Scanner;
class Employee1
{
    int empid;
    String name,address;
    double Salary;
    Employee1(int no,String na, double sal,String addr)
    {
        empid=no;
        name=na;
        Salary=sal;
        address=addr;
    }
}
class Teacher extends Employee1
{
    String dept,subject;
    Teacher(int no,String na,double sal,String addr,String dep,String sub)
    {
        super(no,na,sal,addr);
        dept=dep;
        subject=sub;
    }
    void display()
    {
        System.out.println("Employee id: "+empid);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+Salary);
        System.out.println("address: "+address);
        System.out.println("Department: "+dept);
        System.out.println("Subject: "+subject);
    }
}
public class EmpInheritance 
{
    public static void main(String[] args) {
        System.out.println("\n enter the no.of employees");
        Scanner s =new Scanner(System.in);
        int num =s.nextInt();
        Teacher arr[]=new Teacher[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("\n enter employye-"+(i+1)+"details:id,employeename,salary,address,department,subject");
            int emid=s.nextInt();
            String name=s.next();
            double salary=s.nextDouble();
            s.nextLine(); // clear buffer
            String address = s.nextLine();
            String dept=s.next();
            String subject=s.next();
            arr[i]=new Teacher(emid, name, salary, address, dept, subject);

        }
        System.out.println("\n**infromation of all the employee's**");
        for(int i=0;i<num;i++)
        {
            System.out.println("\nEmployee -"+(i+1)+"details");
            System.out.println("-------------");
            arr[i].display();
        }
        s.close();

    }
    
}
