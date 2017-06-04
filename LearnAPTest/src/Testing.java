import java.util.*;

public class Testing {
	
	static int myAge = 17;
	static Scanner takingInput = new Scanner(System.in);
	static double myNewPI = 3.1459; //  CLASS VARIABLE
	static int randomNumber;
	
	public static void main(String[] args) {
		
		// void if u dont wanna return shit
		
		// accessModifier static returnType methodName()
		
		System.out.println(getRandomNum());
		
		int guessResult = 1;
		int randomGuess = 0;
		
		int[][] my2DArray = new int[3][4];
		my2DArray[0] = 7
				
				.length = row
				[0].length is column
		
		while (guessResult != -1) {
			
			System.out.println("Guess a number between 0 and 50");
			randomGuess = takingInput.nextInt();
			guessResult = checkGuess(randomGuess);
		}
		
		System.out.println("You got it right! The number is " + randomGuess);
		
		int k = 1;
		do {
			
			System.out.println(k);
			k++;
			
		} while (k < 10); // WILL DO THE CODE FIRST AND THEN CHECK IF ITS DONE
		
		// for in loops have to DECLARE iterator, CONDITIONAL statement, CHANGE iterator
		
		for (int l = 10; l>=1; l--) { // ONLY L EXISTS IN FOR STATEMENT
			
			System.out.println(l);
		}
		
		int m, n;
		
		for (m = 1, n = 2; m<=9; m+=2, n+=2) {
			
			System.out.println(m + "\n" + n);
		}
		
		String contYOrN = "Y";
		int h = 1;
		
		double myPi = 4.0;
		double dj = 3.0;
		
		while(dj < 13) {
			
			myPi = myPi - (4/dj) + (4/(dj + 2));
			dj += 4;
			System.out.println(myPi);
			
		}
		
		while (contYOrN.equalsIgnoreCase("y")) { // checks if the variable will be y
			
			System.out.println(h);
			System.out.println("Continue y or n?");
			contYOrN = takingInput.nextLine();
			h++;
		}
		
		System.out.println("Value of PI: " + Math.PI);
		
		
		System.out.println("Guess my friend's age");
		
		
		int friendsAge = (int) (Math.random() * 18);
				
		if(takingInput.hasNextInt()) {
			
			System.out.println("You are " + myAge + " years old");
			
		}
		
		int i = 12;
		
		while (i < 20) {
			
			System.out.println("My friend is " + friendsAge);
			
			if (takingInput.nextInt() == friendsAge) {
				
				System.out.println("u genius");
				
			} else {
				
				System.out.println("idiot");
			}
		}
	
		int[] myArray = new int[18];
		int[] myNewArray = {1,2,3,4,5,6,7,8,9};
		
		
		for (int g = 0; i < 3; i++) {
			
			// g is 0 and less than 3, so then g becomes 1.
			// g is 1 and is less than 3, so becomes 2.
			// g is 2 and less than 3 so becomes 3.
			// g is 3 and is not less than 3 so ends loop
			
			System.out.println("Should print like 3 times");
			
		}
		
		do {
			
			
		} while (i < 3); {
			
			
		}
		
		for (int a = 0; a < myNewArray.length; a++) {
			
			int lol = myNewArray[a];
			System.out.println("The number stops at this loop " + lol);
		}
		
	
		class Point {
			
			int x;
			int y;
			
			void printPoint() {
			
			System.out.println("(" + x + "," + y + ")");
			
			}
			
			Point() {
				
				this(0,0);
				
			}
		 
		Point(int x, int y) {
			
			this.x = x;
			this.y = y;
			
		}
	}
		
		Point p = new Point();
		
		p.x = 3;
		p.y = 0;
		
		
		
		int bb = 1;
		while (bb <= 20) {
			
			bb+=2;
			continue;
			
		}	
		
		System.out.println(bb);
		bb++;
		
		if ((bb%2) == 0) {
			
			bb++;
			
			if (bb > 10) {
				
				// break;
			}
			
		}
}

	
	void bubbleSort(int ar[]) {
		
		for (int i = (ar.length); i>=0; i--) {
			
			for (int j = 1; j < i; j++) {
				
				if (ar[j - 1] > ar[j]) {
					
					int temp = ar[j-1];
					ar[j-1] = ar[j];
					ar[j] = temp;
					
				}
				
			}
			
		}
		
		/*
		 * 
		  7, 5, 2, 4, 3, 9 -> 7, 5
		  5, 7, 2, 4, 3, 9 -> 7, 2
	      5, 2, 7, 4, 3, 9 -> 7, 4
		  5, 2, 4, 7, 3, 9 -> 7,3
		  5, 2, 4, 3, 7, 9 -> 7, 9
		  5, 2, 4, 3, 7, 9	 -> nothing
		 * 
		 */
		
	}
	
	void selectionSort(int[] ar) {
		
		for (int i = 0; i < ar.length - 1; i++) {
			
			int min = i;
			for (int j = i + 1; j < ar.length; j++)
				if (ar[j] < ar[min]) min = j;
			int temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;
			
		}
		
		/*
		 * 
		    29, 64, 73, 34, 20, -> 20 // 29 bold
			20, 64, 73, 34, 29, -> 29 // 64 bold
			20, 29, 73, 34, 64 -> 34 // 73 bold
			20, 29, 34, 73, 64 -> 64 // 73 bold
			20, 29, 34, 64, 73 -> nothing
		 * 
		 */
	}
	
	void insertionSort(int[] ar) {
		
		for (int b = 1; b < ar.length; b++) {
			
			int index = ar[b]; int j = b;
			while (j > 0 && ar[j - 1] > index) {
				
				ar[j] = ar[j - 1];
				b--;
			}
			
			ar[j] = index;
		}
		
		/*
		 * 
		    29, 20, 73, 34, 64 // NONE
			29, 20, 73, 34, 64 -> 29
			20, 29, 73, 34, 64 -> 20, 29
			20, 29, 73, 34, 64 -> 20, 29, 73
			20, 29, 34, 73, 64 -> 20, 29, 34, 73
			20, 29, 34, 64, 73 -> 20, 29, 34, 64, 73
		 * 
		 */
		
		System.out.println(addThem(1,2));
		
		int hola = 5;
		tryToChange(hola);
		System.out.println("main Hola " + hola);
	}
	
	public static void tryToChange(int hola) {
		
		hola = hola + 1;
		System.out.println("tryToChange Hola " + hola); // declaring a brand new  variable
		// HOLA IS IN SEPERATE METHODS SO WILL NOT CHANGE
		
	}
	
	public static int getRandomNum() {
		
		randomNumber = (int) (Math.random() * 51);
		return randomNumber;
		
	}
	
	public static int checkGuess(int guess) {
		
		if (guess == randomNumber) {
			
			return -1;
		} else {
			
			return guess;
		}
	}
	
	public static int addThem(int ok, int kk) {
		
		double smallPI = 3.140;
		
		double myOtherPI = ok + kk;
		
		int c = ok + kk;
				
		return c;
		
	}
	
	
}