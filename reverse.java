import java.util.*;
class reverse
{
public static void main(String args[])
{
int a,r=0,n;
Scanner s=new Scanner(System.in);System.out.println("Enter the Number");
n=s.nextInt();
while(n!=0)
{
a=n%10;
r=r*10+a;
n=n/10;
}
System.out.println("Reverse of number "+r);
}
}