import java.util.*;

public abstract class Human {
	
	private String name;
	private int age; // FORCE them to go thru methods. PUBLIC lets them change it
	
	public Human() { // has to be name of class — COnstuctor
		
		name = "";
		age = 0;
		System.out.println("CONSTRUCTOR HERE");
		
	}
	
	public Human(String nm, int ag) {// COnstuctor
		
		name = nm;
		age = ag;
		
	}
	
	public String getName() { // Accessor — gets value from one of our instances
		
		return name;
		
	}
	
	public int getAge() {
		
		return age;
		
	}
	
	public abstract int ageInDogYears();
	
	public void setName(String s) { //mutator, change state of an object
		
		name = s;
	}
	
	public void setAge(int a) {
		
		age = a;
	}
	
	public String toString() { //override 
		
		return "Human :" + name + "Age: " + age;
	}
	
}