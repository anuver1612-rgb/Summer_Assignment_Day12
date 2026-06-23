import java.util.*;
class q47
{
    public static void fibonacci(int n)
    {
        int a=0,b=1,c,i;
        if(n==1) System.out.print("0");
        if(n==2) System.out.print("0,1");
        else
        {
            System.out.print("0,1");
            for(i=1;i<=n-2;i++)
            {
                c=a+b;
                System.out.print(","+c);
                a=b;
                b=c;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int x=sc.nextInt();
        fibonacci(x);
    }
}