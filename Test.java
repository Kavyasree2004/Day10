//no return value no argument

class Demo{
public void displayMenu(){
System.out.println("+ : Addition");
System.out.println("- : Substraction");
System.out.println("* : Multiplication");
System.out.println("/ : Division");
}
}
class Test{
public static void main(String args[]){
Demo ob=new Demo();
ob.displayMenu();
}
}