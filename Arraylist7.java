import java.util.ArrayList;
class Arraylist7{
public static void main(String args[]){
ArrayList<Integer> nums=new ArrayList<>();
nums.add(12);
nums.add(24);
nums.add(36);
nums.add(48);
System.out.println("ArrayList: "+nums);
nums.set(2,52);
System.out.println("Modified ArrayList: "+nums);
}
}