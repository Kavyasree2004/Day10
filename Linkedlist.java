import java.util.List;
import java.util.LinkedList;
class Linkedlist{
public static void main(String args[]){
List<Integer> numbers=new LinkedList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
System.out.println("List: "+numbers);
int num=numbers.get(2);
System.out.println("Accessed element: "+num);
int index = numbers.indexOf(20);
System.out.println("Position of 20 is "+index);
}
}