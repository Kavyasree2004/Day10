//no return value ,with argument

import java.util.*;
class Demo{
public void displayMenu(){
System.out.println("+ : Addition");
System.out.println("- : Substraction");
System.out.println("* : Multiplication");
System.out.println("/ : Division");
}
public void add(int a,int b)
{
int res=a+b;
System.out.println(a+"+"+b+"="+res);
}
}
class Test1{
public static void main(String args[]){
Demo ob=new Demo();
ob.displayMenu();
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
ob.add(n1,n2);
}
}