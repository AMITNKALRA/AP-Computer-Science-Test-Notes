import java.util.*;

public class Athlete implements Person {
	
	
	Human bd = new Human("Billy", 17);
	
	private String sport;
	private String name; // Global instance variables
	private int age;
	private static int count = 0; 
	public final static int var = 500; // cannot change this
	
	public Athlete() {
		
		super(); // MUST BE IN THE FIRST LINE!!
		sport = "";
		count++;
	}
	
	// OVERLOADING is creating a diff method that can accept diff parametrs under the same name
	
	public void printSomething(int times) {
		
		// @param is a paramter, usually used for HTML
		
	}
	
	/**
	 * DESCRIBE HERE what things do
	 * 
	 * @param times
	 * @param times2
	 */
	
	
	/** 
	 * 
	 * @return  This returns a sport
	 */
	
	public void printSomething(int times, int times2) {
		
		
	}
	
	public static int getCount() {
		
		return count;
	}
	
	public int ageInDogYears() {
		
		// return super.getAge() * 7;
	}
	
	public Athlete(String nm, int ag, String s) {
		
		int i; // Local variable created inside a method
		
		// super(nm, ag);
		sport = s;
		
		for(int j = 0...) {
			
			
		}
		
	}
	
	public String getSport() {
		
		return sport;
	
	}
	
	public void setSport(String s) {
		
		sport = s;
		
	}
	
	public String toString() {
		
		return "Athlete: " + name + ", " + sport;
	}
	
}