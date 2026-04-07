package graphics;
import java.util.Scanner;
public class Rectangle implements Area_cal
{
 
 int l,b;
 public void area()
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("input length:");
     l=sc.nextInt();
     System.out.println("input breadth:");
     b=sc.nextInt();
     System.out.println("area of rectangle:"+(l*b));
 }   
}
