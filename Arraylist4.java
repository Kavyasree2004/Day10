import java.util.List;
import java.util.ArrayList;
class Arraylist4{
public static void main(String args[]){
ArrayList<String> birds = new ArrayList<>();
birds.add("Parrot");
birds.add("Sparrow");
birds.add("Peacock");
birds.add("Crow");
birds.add("Woodpecker");
System.out.println("ArrayList1: "+birds);
String bird=birds.get(2);
System.out.println("Accessed Element: "+bird);
String removedbird=birds.remove(1);
System.out.println("Removed Element: "+removedbird);
System.out.println("List: "+birds);
}
}