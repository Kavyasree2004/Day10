import java.util.Scanner;
public class Fibonacci 
{
public static void main(String[] args) 
{
int n, a = 0, b = 1, c = 0;        
Scanner s = new Scanner(System.in);
System.out.print("Enter value of n:");
n = s.nextInt();
System.out.print("Fibonacci Series:");
while(c<=n)
{
System.out.print(c+" ");
a=b;
b=c;
c=a+b;
}
}
}
