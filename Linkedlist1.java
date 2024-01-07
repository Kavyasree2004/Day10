//error
import java.util.List;
import java.util.LinkedList;
class Linkedlist1{
public static void main(String args[]){
List<String> birds=new LinkedList<>();
birds.add("Pegion");
birds.add("Sparrow");
birds.add("Eagle");
System.out.println("List: "+birds);
String bird=birds.get(2);
System.out.println("Accessed element: "+bird);
String index = birds.indexOf("Eagle");
System.out.println("Position of Eagle is "+index);
}
}