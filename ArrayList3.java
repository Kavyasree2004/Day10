import java.util.List;
import java.util.ArrayList;
class Arraylist3{
public static void main(String args[]){
ArrayList<Integer> num = new ArrayList<>();
num.add(10);
num.add(20);
num.add(30);
num.add(40);
num.add(50);
System.out.println("ArrayList1: "+num);
int number=num.get(2);
System.out.println("Accessed Element: "+number);
int removedNumber=num.remove(1);
System.out.println("Removed Element: "+removedNumber);
System.out.println("List: "+num);
}
}