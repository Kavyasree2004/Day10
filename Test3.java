//with return value ,no argument

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
public int sub(int a,int b){
int res=a-b;
return res;
}
public int input(){
Scanner sc=new Scanner(System.in);
int temp=sc.nextInt();
return temp;
}
}
class Test3{
public static void main(String args[]){
Demo ob=new Demo();
ob.displayMenu();
Scanner sc=new Scanner(System.in);
int n1=ob.input();
int n2=ob.input();
ob.add(n1,n2);
int r=ob.sub(n1,n2);
System.out.println(n1+"-"+n2+"="+r);
}
}