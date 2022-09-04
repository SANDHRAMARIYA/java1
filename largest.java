import java.util.Scanner;
public class largest
{
public static void main(String[] args)
{
int x,y,z,d;
Scanner s=new Scanner(System.in);
System.out.println("Enter three numbers");
x=s.nextInt();
y=s.nextInt();
z=s.nextInt();
d=z>(x>y?x:y)?z:((x>y)?x:y);
{
System.out.println(d + "is largest.");
}
}
}
