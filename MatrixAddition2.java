import java.util.Scanner;
class MatrixAddition2{
    Scanner s= new Scanner(System.in);
    int r,c;
    int[][] mat1,mat2,res;

    MatrixAddition2(int r1,int c1)
    {
        r=r1;
        c=c1;
    }

    void getData()
    {
        mat1=new int [r][c];
        mat2=new int[r][c];
        res=new int[r][c];
        System.out.println("enter elements of first matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat1[i][j]=s.nextInt();
            }
        }
        System.out.println("enter elements of second matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat2[i][j]=s.nextInt();
            }
        }
    }

    void addMatrix()
    {
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                res[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
    }

    void display()
    {
        System.out.println(("resultant matrix:"));
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(res[i][j]+"\t"); // fixed
            }
            System.out.println();
        }
    }

    public static void main(String[]args)
    {
        Scanner s= new Scanner(System.in);
        int r1,r2,c1,c2;

        System.out.print("Enter row and columns of first matrix:");
        r1=s.nextInt();
        c1=s.nextInt();

        System.out.println("Enter row and columns of second matrix:");
        r2=s.nextInt();
        c2=s.nextInt();

        if(r1==r2&&c1==c2)
        {
            MatrixAddition2 obj=new MatrixAddition2(r1,c1);
            obj.getData();
            obj.addMatrix();
            obj.display();

        }
        else
        {
            System.out.println("matrix addition not possible");
        }

    } 
    
}