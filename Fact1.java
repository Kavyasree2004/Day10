//Factorial without using recursion

import java.util.*;
class Demo{
public long calculateFact(int n){
long res=1;
if(n==0)
return 1;
else{
for(int i=1;i<=n;i++)
res=res*i;
return res;
}
}
}
class Fact1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
Demo d=new Demo();
System.out.println(d.calculateFact(p));
}
}