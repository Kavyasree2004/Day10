import java.util.ArrayList;
class Arraylist8{
public static void main(String args[]){
ArrayList<String> animals=new ArrayList<>();
animals.add("cow");
animals.add("cat");
animals.add("rat");
animals.add("dog");
animals.add("horse");
System.out.println("Arraylist: "+animals);
System.out.println("Accessing individual elements:");
for(String temp: animals){
System.out.print(temp);
System.out.print(",");
}
}
}