import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		// ask for user first name
		// ask for user last name
		// ask for user age
		// ask for user birth month as int
		// ask for user favorite color from ROYGBIV; if they do not know offer help
		// ask for user number of siblings
		// give fortune

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Mystical Mickey's Fortune Telling! \nBefore we get "
				+ "started I need to ask a few questions about you \nso my crystal ball "
				+ "can give you the best fortune of your life.\n");

		System.out.println("Tell me young padawan.... What is your first name?");
		String userNameFirst = input.next();

		System.out.println("What is your last name?");
		String userNameLast = input.next();

		System.out.println(userNameFirst.toUpperCase() + " " + userNameLast.toUpperCase() + 
				". What a nice name. A few more questions if you don't mind....\n");

		System.out.println("How old are you " + userNameFirst.toUpperCase() + " " 
		+ userNameLast.toUpperCase() + "?");
		int userAge = input.nextInt();
		 
		int userRetire = 65;
		
		if (userAge % 2 == 1) {
			 userRetire = 30;
		}
		else if (userAge % 2 == 0) {
		  userRetire = 5;
	 }
			
		System.out.println("You are so young! I wish I was as young as you.\n"
				+ "\nWhen is your birth month? Please use a numerical value 1 - 12!");
		int birthMonth = input.nextInt();

		String userMoney = "1 dollar";
		
		if (birthMonth  <= 4 && birthMonth > 0) {
			 userMoney = ("1,000 dollars");
		}
		else if (birthMonth <= 8 && birthMonth >4) {
		userMoney = ("100,000 dollars");
		}
		else if (birthMonth <= 12 && birthMonth > 8) {
			userMoney = ("1,000,000 dollars");
		}
		else  {
			 userMoney = ("no money");
		}
		
		System.out.println("A very merry unbirthday to you! What about colors? "
				+ "What is your favorite color\n using the ROY G BIV model?" + 
				" Not sure what that is? Type 'help'.");
		String userColor = input.next();
		
		if (userColor.toLowerCase().equals("help")) {
			System.out.println("The ROY G BIV model is as follows: R=Red, O=Orange, "
					+ "Y=Yellow, G=Green, B=Blue,\n I=Indigo, and V=Violet.");
			System.out.println("\nNow that you know the colors... Please pick your favorite!");
			userColor = input.next();		
		}
		
		String userTransportation = "Transporation";
				
		if (userColor.toLowerCase().equals("red")) {
			userTransportation = "in a private jet";
			System.out.println(userColor.toUpperCase() + "... I had a feeling you liked this color....\n");
		}
		else if (userColor.toLowerCase().equals("orange")) {
			userTransportation = "on a Unicorn";
			System.out.println(userColor.toUpperCase() + "... I had a feeling you liked this color....\n");
		}
		else if (userColor.toLowerCase().equals("yellow")) {
			userTransportation = "in a private jet";
			System.out.println(userColor.toUpperCase() + "... I had a feeling you liked this color....\n");
		}
		else if (userColor.toLowerCase().equals("green")) {
			userTransportation = "on a Scooter";
			System.out.println(userColor.toUpperCase() + "... I had a feeling you liked this color....\n");
		}
		else if (userColor.toLowerCase().equals("blue")) {
			userTransportation = "in a Audi R8";
			System.out.println(userColor.toUpperCase() + "... I had a feeling you liked this color....\n");
		}
		else if (userColor.toLowerCase().equals("indigo")) {
			userTransportation = "in a row boat";
			System.out.println(userColor.toUpperCase() + "... I had a feeling you liked this color....\n");
		}
		else if (userColor.toLowerCase().equals("violet")) {
			userTransportation = "on a yaht";
			System.out.println(userColor.toUpperCase() + "... I had a feeling you liked this color....\n");
		}
	System.out.println("One more question before I amaze you with my fortune telling abilities."
		+ "\n... How many siblings do you have?");
		int userSiblings = input.nextInt();
		
		String userPlace = "Earth";
		
		if (userSiblings==0) {
			userPlace = "Rome, Italy";
		System.out.println("Great! Now type in 'Fortune' and hit enter to be amazed!\n");
		}
		else if (userSiblings==1) {
		 userPlace = "Miami, FL";
		System.out.println("Great! Now type in 'Fortune' and hit enter to be amazed!\n");
		}
		else if (userSiblings==2) {
			userPlace = "Los Angeles, CA";
		System.out.println("Great! Now type in 'Fortune' and hit enter to be amazed!\n");
		}
		else if (userSiblings==3) {
			userPlace = "Paris, France";
		System.out.println("Great! Now type in 'Fortune' and hit enter to be amazed!\n");
		}
		else if (userSiblings>=4) {
			userPlace = "Dublin, Ireland";
		System.out.println("Great! Now type in 'Fortune' and hit enter to be amazed!\n");
		}

		else {
			userPlace = "a van down by the river";
			System.out.println("Great! Now type in 'Fortune' and hit enter to be amazed!");
		}
		String userEnter = input.next();
			userEnter = userEnter.toLowerCase();

		System.out.println("\nYour FORTUNE is as follows...\n"
				+ userNameFirst.toUpperCase() + " " + userNameLast.toUpperCase() + " will retire in " + userRetire
				+ " years with " + userMoney + " in the bank, \n a vacation home in " + userPlace 
				+ " traveling " + userTransportation + ".");
	
		System.out.print("\nThanks for playing Mystical Mickey's Fortune Telling!");
		input.close();
	}
 
	}

