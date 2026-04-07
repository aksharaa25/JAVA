import java.util.Scanner;
class Sports
{
    String sports;
    int rating;
    Sports(String sp,int rt)
    {
        sports=sp;
        rating=rt;
    }
}
class Student extends Sports
{
    String grade;
    double overall_per;
    Student(String sp,int rt,String gd,double per)
    {
        super(sp,rt);
        grade=gd;
        overall_per=per;
    }
}
class Result extends Student{
    Result(String sp,int rt,String gd,double per)
    {

        super(sp,rt,gd,per);
    }
    void display()
    {
        System.out.println("\nsports details of student");
        System.out.println("---------------------------");
        System.out.println("sports:"+sports);
        System.out.println("rating:"+rating);
        System.out.println("\n Academic details of student");
        System.out.println("------------------------------");
        System.out.println("academic grade:"+grade);
        System.out.println("overall percentage:"+overall_per);
    }
}
public class School
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sport details of student");
        System.out.println("Sport:");
        String s=sc.next();
        System.out.println("Sport rating out of 10:");
        int r=sc.nextInt();
        System.out.println("enter the academic details of student");
        System.out.println("academic grade(A-D");
        String g=sc.next();
        System.out.println("overall percentage:");
        double p=sc.nextDouble();
        sc.close();
        Result obj=new Result(s,r,g,p);
        obj.display();
        }
    
}
