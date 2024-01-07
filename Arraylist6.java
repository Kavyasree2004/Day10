//set() method

import java.util.ArrayList;
class Arraylist6{
public static void main(String args[]){
ArrayList<String> languages=new ArrayList<>();
languages.add("Java");
languages.add("Kotlin");
languages.add("C++");
languages.add("Python");
System.out.println("ArrayList: "+languages);
languages.set(2,"Java Script");
languages.add(1,"C");
System.out.println("Modified ArrayList: "+languages);
}
}