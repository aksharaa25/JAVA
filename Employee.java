import java.util.Scanner;

public class Employee 
{
    int empid,TA,DA,HRA,Tax,basic,netsalary;
    String empname;
    void getData()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\nEmployeename,id,TA,DA,HRA,Tax,basic:");

        empname=scan.nextLine();
        empid=scan.nextInt();
        TA=scan.nextInt();
        DA=scan.nextInt();
        HRA=scan.nextInt();
        Tax=scan.nextInt();
        basic=scan.nextInt();
        scan.close();


    } 
    void calc()
    {
        netsalary=(basic+TA+DA+HRA)-Tax;
        System.out.println(("net salary:"+netsalary));
    }
    public static void main(String[] args) 
    {
        Employee e=new Employee();
        e.getData();
        System.out.println("\n\nEmployee details\n");
        System.out.println("Employee name:"+e.empname);
        System.out.println("Employee id:"+e.empid);
        System.out.println("TA:"+e.TA);
        System.out.println("DA:"+e.DA);
        System.out.println("HRA:"+e.HRA);
        System.out.println("Tax:"+e.Tax);
        System.out.println("Basic:"+e.basic);
        e.calc();


    }
    
}
