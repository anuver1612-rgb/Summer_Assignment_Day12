import java.util.*;
class q45
{
    public static int palindrome(int x)
    {
        int i,r,rev=0;
        for(i=x;i!=0;i=i/10)
        {
            r=i%10;
            rev=rev*10+r;
        }
        if(rev==x) return 1;
        else return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int check=palindrome(n);
        if(check==1) System.out.println("PALINDROME NUMBER");
        else System.out.println("NOT A PALINDROME NUMBER");
    }
}