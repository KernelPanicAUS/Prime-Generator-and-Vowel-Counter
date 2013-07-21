import java.util.Scanner;


public class Assignment_1 {
	 

	public static void main(String[] args) {

		boolean sysIndicator=true;
        
        while (sysIndicator = true) {
        	
        	mainMenu();
    		Scanner reader=new Scanner(System.in);

			System.out.println("Please select one of the above options:");
			String input = reader.nextLine();
			char choice = input.charAt(0);
			
			switch (choice) {
 
			case 'A':
				primeValue(reader);		
				break;
			
			case 'B':
				vowelCounter(reader);
				break;
				
			case 'X':	
				sysIndicator = false ;
				System.out.println("Exiting the program - goodbye...");
				
				return;
				

			default:
				System.out.println("Error! "+input+" is not a valid menu option!");
				
				break;
			
			}	
        }
	}

	private static void vowelCounter(Scanner reader) {
		
		System.out.println("Enter a line of text:");
		String textLine = reader.nextLine();
		
		char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
		int arraySize = vowels.length;
		int length = textLine.length();
		int counter=0;
		
		
		
		for (int i = 0; i < length; i++) {
			char currentChar = textLine.charAt(i);
			for (int j = 0; j < arraySize; j++) {
				if (currentChar == vowels[j]) {
					counter=counter+1 ;
					
				}
				
			}
			
		}
		System.out.println("Number of vowels found in line is: "+counter);
	}

	private static void primeValue(Scanner reader) {
		
		System.out.println("Enter an integer value:");
		int mainNum = reader.nextInt();
		double sqrt =Math.sqrt(mainNum);
		
		if (mainNum == 2) {
			System.out.println(mainNum+" is a prime number !");

			}else {
				for (int i = 2; i< sqrt; i++) {
					
					if (mainNum % sqrt == 0) {
						System.out.println(mainNum+" The number isn't a prime !");
						return;
					}
					
					else if (mainNum % sqrt != 0) {
						System.out.println(mainNum+" The number is a prime !");
						return;
					}
					

				}
			}
	}

	private static void mainMenu() {
		System.out.println();
		System.out.println("*************** Assignment 1 Menu ***************");
		System.out.println();
		System.out.println("        A. Check to see if a number is prime.");
		System.out.println("        B. Count the number of vowels in a line.");
		System.out.println("        X. Exit the program.");
		System.out.println();
		System.out.println("*************************************************");
	}
}