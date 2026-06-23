import java.util.*;
class q46
{
    public static int armstrong(int a)
    {
        int i,r,sum=0;
        for(i=a;i!=0;i=i/10)
        {
            r=i%10;
            sum=sum+r*r*r;
        }
        if(sum==a) return 1;
        else return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int check=armstrong(n);
        if(check==1) System.out.println("ARMSTRONG NUMBER");
        else System.out.println("NOT AN ARMSTRONG NUMBER");
    }
}