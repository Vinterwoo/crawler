import java.util.Scanner; // Imports in scanner utility which takes in user input
import java.util.Random; // For generating random numbers

public class Crawler {

	public static void main(String[] args) {
		Scanner newInputV = new Scanner(System.in); //Creating a new variable called "newInputV" that is a Scan (Scans take input)
		//String input=newInputV.nextLine(); // Let java know that input is going to be a string
		//Guess I don't need the above, but what is best practice to declare a string?
		int i=0;// for loop control
		
		System.out.println("Welcome to the Dungeon. Do you wish to enter?");
		String input = newInputV.nextLine();
		
		if (input.equals("Y") || input.equals("Yes") || input.equals("y") ||input.equals("yes")){
			
			System.out.println("You see a sign that reads 'Abandon All Hope Ye Who Enter'");	
			
			while (i < 10) {
				//Ask user for input
				System.out.println("Turn Right (R) or Left (L)");
				
				String input2 = newInputV.nextLine();
				char[] charArrayV = input2.toCharArray();// Can't swith on a string, so need to switch on a char
				char inputy = charArrayV[0];// Take 1st variable in character array
				switch (inputy) {
				case 'R': // Single quote for char variables
					break;
				case 'r':
					break;
				case 'L':
					break;
				case 'l':
					break;
				default:
					System.out.println("That is not an allowed command");
					break;
				}
			
				//read input from user
				//input=newInputV.nextLine(); 
			
				//print user input
				//System.out.print("You Chose '");
				//System.out.print(input);
				//System.out.println("'");
			
				Random luck = new Random();// What is this and does it belong here
				int randNum = luck.nextInt(10)+1;// Rolls a random number between 1 and 10 (the beast!)
				
				int numOfBeast = 6;
			
				//System.out.println(beast);
				
				if (randNum == numOfBeast) {
					System.out.println("The Beast Found You");
					System.out.println("You Died!");
					break;
				}
			
				i++;// increments
			//i=i+1; // Add 1
			
			//System.out.println(i);
			
				if (input.equals("q")){// Why not input = "q"
					break;
				}
			} // End of While Loop
			
			int safe = 10;
			if (i==safe){
				System.out.println("You Survived!");// If made it without Beast finding you
			}
		} // End of If statement
		
		
		else {
			System.out.println("You are the worst");
			}	

		}// End of Main
	

} // End of Class

