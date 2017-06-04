import java.util.*;

public class Tester {
	
	public static void main(String[] croneEducation) {
		
		
		Human h = new Human(); // reference variable
		Human h1 = new Human("Tyler", 25);
		h1.setName("Charlie");
		
		System.out.println(h1.getName());
		
		Athlete a1 = new Athlete("Spike", 35, "Bowler");
		
		System.out.print(a1);
		
		Human h11 = new Athlete("Spike", 35, "Bowler");
		// ((Athlete)h11) NOW GET ATHLETE PROPERTIES
		
		
		Person p = new Athlete();
		
		Athlete z2 = new Athlete("Spike", 35, "Bowler");
		Athlete a2 = new Athlete("Spike", 35, "Bowler");
		Athlete q2 = new Athlete("Spike", 35, "Bowler");
		
		System.out.println(Athlete.getCount());
		System.out.println(Athlete.var);
		
		// Athlete is a reference type
		
		Athlete[] arry = new Athlete[10];
		
		arry[0] = new Athlete();
		// NO POINTER EXCEPTIO  is when u try to get stuff from somethign that you havent setup yet    try sending a message to somethign that aint connected to an object
		// Array index out of bounds exception is when u try accesing array element that doesnt exsit. arry[11]
		
		// Arithmetic expection is doing something NOT accpeetd in the math world
		// arry[1].
		
		
	}
}