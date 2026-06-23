import java.util.*;
class q48
{
    public static int perfect(int x)
    {
        int i,sum=0;
        for(i=1;i<x;i++)
        {
            if(x%i==0)
            {
                sum=sum+i;
            }    
        }
        if(sum==x) return 1;
        else return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int check=perfect(n);
        if(check==1) System.out.println("PERFECT NUMBER");
        else System.out.println("NOT A PERFECT NUMBER");
    }
}