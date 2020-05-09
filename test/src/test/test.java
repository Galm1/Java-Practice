package test;
import java.util.*;

public class test {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		/** System.out.println("Please enter a base number");
		int baseNumber = scan.nextInt();
		
		System.out.println("Now please enter the power you wish to raise to base number to");
		int power = scan.nextInt();
		
		int answer = (int) Math.pow(baseNumber, power);
		System.out.println("You have entered " + baseNumber + " raised to the power of " + power + 
				"\nThe answer is: " + answer);
		
		System.out.println("\nNow please enter a humber that you wish to find the square root of");
		double numToSquare = scan.nextDouble();
		
		double squareRootAnswer = Math.sqrt(numToSquare);
		System.out.println("The square root of " + numToSquare + " is " + squareRootAnswer); **/
		
		/** System.out.println("Enter any statement and end the statement with any punctuation mark");
		String userStatement = scan.nextLine();
		
		int statementLength = userStatement.length();
		
		String statementMinusOne = userStatement.substring(0, statementLength - 1);
		
		String newStatement = statementMinusOne + "?";
		
		System.out.println(newStatement); **/
		
		
		
		/**System.out.println("Please enter your first name");
		String firstName = scan.nextLine();
		
		System.out.println("Now please enter your lastname");
		String lastName = scan.nextLine();
		
		int randomNum = generator.nextInt(90) + 10;
		
		String firstNameLetter = firstName.substring(0, 1);
		String lastNameLetters = lastName.substring(0, 3);
		
		System.out.println("Your new username is: " + firstNameLetter + lastNameLetters + randomNum); **/
		
		
		
		/**int count = 1;
		
		while (count <= 10) {
			
			System.out.println("I am a super human being");
			count++;
		}
		
		System.out.println("Now it is true"); **/
		
		
		
		
		
		
		
		/**int count = 0;
		
		System.out.println("How many times do you wish to repeat the phrase?");
		int inputNumber = scan.nextInt();
		
		
		while (count < inputNumber) {
			
			if (inputNumber == 0) {
				System.out.println("Thank you for visiting.");
			//	can use 'break' if not using 'else'. However using break is usually bad practice. 	
			//	break; 
			} else 
						
			System.out.println("I am a super human being");
			count++;
		} **/
		
		
		
		
		
		
		
		/** String userInput;
		
		System.out.println("Please enter any word that starts with the letter P");
		userInput = scan.nextLine();
		
		while (userInput.charAt(0) != 'P' && userInput.charAt(0) != 'p') {
			
			System.out.println("Your word did not start with the letter P, please enter a word" +
								" that starts with the letter P.");
			userInput = scan.nextLine();
			
		}
		
		System.out.println("The word you entered was: " + userInput);		**/
		
		
		
		
		
		
		
		
		/**final int LINES = 10;
		int currentLine = 1;
		int numStars = 1;
		
		while (currentLine <= LINES) {
			
			numStars = 1;
			
			if (currentLine == 5) {
				System.out.println();
				currentLine++;
			}
			
			while (numStars <= currentLine) { 
				
				System.out.print("*");
				numStars++;
				
			}
			
			System.out.println();
			
			currentLine++;
			
		} **/
		
		
		
		
		
		
		
		/** int input, count202=0, count301=0, count403=0, count404=0, count=0;
		
		while (count < 1) {
		
			System.out.println("Please enter a number code and then enter 0 when you wish to quit. " +
								"Enter 1 if you want count report.");
			input = scan.nextInt();
		
			if (input == 0) {
				break;
			}
		
			switch (input)
			{
			case 1:
				System.out.println("Report: " + "202 entered: " + count202 + ", 301 entered: " + 
									count301 + ", 403 entered: " + count403 + ", 404 entered: " +
									count404);
				break;
			case 202:
				System.out.println("Request accepted");
				count202++;
				break;
			case 301:
				System.out.println("Site Moved Permanently");
				count301++;
				break;
			case 403:
				System.out.println("Forbidden");
				count403++;
				break;
			case 404:
				System.out.println("Not Found");
				count404++;
				break;
			case 410:
				System.out.println("Server Busy");
				break;
			case 500:
				System.out.println("Internal Service Error");
				break;
			case 502:
			case 503:
			case 504:
				System.out.println("Bad Gateway or Service Unavailable or Gateway Timeout");
				break;
			default:
				System.out.println("No Comment");
			}
			
		System.out.println();
		
		} **/
	
		
		
		
		
		
		/** int num1 = 10, num2 = 22, num3;
		
		
		num3 = (num1 < num2) ? num1 + num2 : num1 - num2;
		
		System.out.println(num1 + "\n" + num2 + "\n" + num3); **/
		
		
		
		
		
		
		
		
		/** int count=0, input1, input2, checker;
		
		while (count < 1) {
			

			System.out.println("(while loop) Please enter a number and i'll tell you if it is even or odd. Enter 0 to stop.");
			input1 = scan.nextInt();
			
			if (input1 == 0) {
				break;
			} 
			
			checker = input1 % 2;
			
			System.out.println("The number you entered was: " + input1 + ". This number is " + ((checker == 0) ? "" : "not") + " even. \n");

		}
		
		do {
			
			System.out.println("(do-while loop) Please enter a number and i'll tell you if it is even or odd. Enter 0 to stop.");
			input1 = scan.nextInt();
			
			checker = input1 % 2;
			
			if (input1 == 0) {
				break;
			}
			System.out.println("The number you entered was: " + input1 + ". This number is " + ((checker == 0) ? "" : "not") + " even. \n");
			
		} while (count < 1); **/
 		
		
		
		
		
		
		/**final int PER_LINE = 5;
		
		System.out.println("Print the number 1 through 20:");
		
		for (int n = 1, count = 0; n <= 20 ;n++) {
			System.out.print(n + ", ");
			
			//this makes a new line every 5 times the loop executes.
			count++;
			if (count % PER_LINE == 0)
				System.out.println();
		}
	
		//this system.out is just for making the output look neat.
		System.out.println("\n");
		
		System.out.println("Print out the odd numbers between 1 and 100:");
		
		for (int n = 1, count = 0; n <= 100; n += 2) {
			System.out.print(n + ", ");
			
			count++;
			if (count % PER_LINE == 0)
				System.out.println();
		} **/
		
		
		
		
		
		/** int num = 1, total = 0;
		
		System.out.println("Please enter Ten numbers and i will calculate the total. Enter 0 to end.");
		for (int i = 0; i <=10 && num != 0; i++) {
			System.out.println("Number " + (i+1) + "\n");
			num = scan.nextInt();

			
			total = total + num;
		} 
		
		System.out.println("Total is: " + total); **/
		
		
		
		
		
		
		
		
		
		/**int begining, ending, temp, traker = 0;
		double total = 0, average;
		
		System.out.println("please enter two numbers. Small number first, Large number second");
		begining = scan.nextInt();
		ending = scan.nextInt();
		
		// flip variables in case user enters larger first.
		if (begining > ending) {
			temp = begining;
			begining = ending;
			ending = temp;
		}
		
		for (int i = begining; i <= ending; i++, traker++) {
			total += i;
			System.out.println("\nRunning total: " + total);
		}
		
		average = (total/traker);
		System.out.println("The total is: " + total + ". The average is: " + average); **/
		
		
		
		
		
		
		
		
		
		/**char[] alphabet = new char[26];
		alphabet[0]='A';
		alphabet[25]='Z';
		alphabet[2]='C';
		
		System.out.println("Alphabet array at index 0, 25, and 2:\t" + alphabet[0] + " " + alphabet[25] + " " + alphabet[2]);

		
		double[] taxRate = new double[3];
		taxRate[0]=0.25;
		taxRate[1]=0.15;
		taxRate[2]=0.10;
		
		System.out.print("Taxrate array at index 0, 1, and 2:\t");
		
		for (double value : taxRate)
			System.out.print(value + " "); **/
		
		
		
		
		
		
		/**final int LIMIT = 10;
		int[] age = new int[LIMIT];
		
		for(int i=0; i<LIMIT; i++)
			age[i]=8;
		
		age[9]=10;
		age[1]=5;
		
		for(int value : age)
			System.out.print(value + " ");**/
		
		
		
		/**final int LIMIT = 10;
		int totalAge=0;
		double average;
		int[] age = new int[LIMIT];
		
		for (int i=0,input; i<LIMIT; i++) {
			System.out.print("Enter an age for child " + (i+1) + ".\n");
			input = scan.nextInt();
			
			age[i]=input;
		}
		
		age[9]=10;
		age[1]=5;
		
		for (int i: age)
			totalAge += i;
		
		average = ((double)totalAge)/age.length;
		
		System.out.print("The ages entered are: ");
		for(int value : age)
			System.out.print(value + " ");
		
		System.out.println("The average is: " + average);
		
		System.out.print("\nThe ages reversed are: ");
		for (int i= age.length - 1; i >= 0; i--)
			System.out.print(" " + age[i]);**/
		
		
		
		
		
		
		
		/**char[] vowels = {'A', 'E', 'I', 'O', 'U'};
		//char[] consonants = new consonants[];
		
		System.out.print("Vowels: ");
		for (char i : vowels)
			System.out.print(i + " ");**/
		
		
		
		
		
		
		
		
		/**String[] fruit = {"Apple", "Grapefruit", "Strawberry", "Blueberry", "Pear"};
		double[] price = new double[fruit.length];
		double[] quantity = new double[fruit.length];
		double[] costOfCategory = new double[fruit.length];
		double totalCost = 0;
		
		
		System.out.println("Please enter the unit price for each fruit: ");
		
		for (int i=0 ; i < fruit.length; i++) {
			System.out.print(fruit[i] + ": ");
			price[i] = scan.nextDouble();
		}
		
		System.out.println("\nPlease enter the quantity for each fruit: ");
		
		for (int i=0 ; i < fruit.length; i++) {
			System.out.print(fruit[i] + ": ");
			quantity[i] = scan.nextDouble();
		}
		
		for (int i=0 ; i < fruit.length; i++) 
			costOfCategory[i] = price[i] * quantity[i];
		
		for (double i : costOfCategory)
			totalCost += i;
		
		System.out.println("\nTotal Cost: " + totalCost);**/
		
		
		
		
		
		



		
		
		
		
		
		

		
		
		/**String[][] card = new String[4][13];
		
		card [0][0] = "ace of clubs";
		card[3][0] = "ace of spades";
		card[3][3] = "4 of spades";
		card[1][12] = "king of diamonds";
		card[2][8] = "9 of hearts";
		
		for (int row = 0; row < card.length; row++) {
			for (int col = 0; col < card[row].length; col++) {
				System.out.print(card[row][col] + "\t");
			}
			System.out.println();
			
		}**/
		
		


	
		
		
		
		
		
		/**int[][] february = new int[4][7];
		int day = 1;
		
		
		for (int row = 0; row < february.length; row++) {
			for (int col = 0; col < february[row].length; col++) {
				february[row][col] = day;
				day++;
			}
		}
		
		System.out.println("\t\tFake February\n");
		
		for (int row = 0;row < february.length; row++) {
			for (int col = 0; col < february[row].length; col++) {
				System.out.print(february[row][col] + "\t");
			}
			System.out.println();
		}**/
		
		
		
		
		
		
		/**int[][] february = new int[5][7];
		String[] weekDays = {"sun", "mon", "tues", "wed", "thurs", "fri", "sat"};
		int day = 1;
		
		for (int row = 0; row < february.length; row++) {
			for (int col = 0; col < february[row].length; col++) {
				february[row][col] = day - 6;
				day++;
				if (february[row][col] < 0)
					february[row][col] = 0;
			}
		}
		
		
		System.out.println("\t\tFebruary 2020");
		
		for (String i : weekDays)
			System.out.print(i + "\t");
		
		System.out.println("\n");
		
		
		for (int row = 0;row < february.length; row++) {
			for (int col = 0; col < february[row].length; col++) {
				if (february[row][col] == 0) {
					System.out.print("\t");
				} else
				System.out.print(february[row][col] + "\t");
			}
			System.out.println();
		}**/
		
		
		
		
		
		
		
		int[][] scores = new int [5][4];
		int total = 0;
		double average = 0;
		
		
		for (int row = 0; row < scores.length; row++) {
			for (int col = 0; col < scores[row].length; col++) {
				scores[row][col] = 100;
				//to ask user to enter scores scores[row][col] = scan.nextInt();
			}
		}
		
		for (int row = 0; row < scores.length; row++) {
			System.out.print("Student " + (row+1) + ": \t");
			for (int col = 0; col < scores[row].length; col++) {
				System.out.print(scores[row][col] + "\t");
			}
			System.out.println();
		}
		
		
		scores [2][1] = 50;
		scores [3][0] = 98;
		scores [4][3] = 87;
		
		System.out.println("\n");
		for (int row = 0; row < scores.length; row++) {
			System.out.print("Student " + (row+1) + ": \t");
			for (int col = 0; col < scores[row].length; col++) {
				System.out.print(scores[row][col] + "\t");
			}
			System.out.println();
		}
		
		
		
		for (int row = 0; row < scores.length; row++) {
			for (int col = 0; col < scores[row].length; col++) {
				total = scores[row][col] + total;
				average = (double)total/20;
			}
		}
		
		System.out.println("\nTotal points: " + total);		
		System.out.println("\nAverage points: " + average);
		
		
		
		
		
		
		
		
		
		
	}
}
