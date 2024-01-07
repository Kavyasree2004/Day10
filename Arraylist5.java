import java.util.List;
import java.util.ArrayList;
class Arraylist5{
public static void main(String args[]){
ArrayList<Double> num = new ArrayList<>();
num.add(4.55);
num.add(10.9);
num.add(22.67);
num.add(13.2);
num.add(58.5);
System.out.println("ArrayList1: "+num);
double number=num.get(4);
System.out.println("Accessed Element: "+number);
double removedNumber=num.remove(2);
System.out.println("Removed Element: "+removedNumber);
System.out.println("List: "+num);
}
}