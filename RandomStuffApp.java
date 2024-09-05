//Brian Lee

import java.util.Scanner;

public class RandomStuffApp {
	private static void print(String s) {
			System.out.println(s);
}

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Hello user");
			
	print("Would you like to");
	print("1.Play a game, or");
	print("2.Figure out what to eat");
	
	int options = Integer.parseInt(in.nextLine());
	if(options <= 0 || options >= 3) {
		System.out.println("invalid input");
		  System.exit(1);
	}

	if(options == 1 ) {
			print("Okay, let the game begin!");
			print("Choose your weapon:");
			print("1.Rock");
			print("2.Paper");
			print("3.Scissors");
			
			int choice = Integer.parseInt(in.nextLine());
			if(choice <= 0 || choice >= 4) {
				System.out.println("invalid input");
				  System.exit(1);
			}
			System.out.println("My choice was " + choice);
			
			int roll = (int)(Math.random()*3+1);
			System.out.println("AI choice was " + roll);
				int rock = 1;
				int paper = 2;
				int scissors = 3;
				
				 // 1. Rock
				// 2. Paper
				// 3. Scissors
				
				if(choice == roll) {
				    System.out.println("It's a draw.");
				}
				// rock win/lose
				else if(choice == 1) {
				    if(roll == 2) { System.out.println("AI: My paper beats your rock! You suck!"); }
				    else { System.out.println("AI: Your rock beats my scissors, you got lucky."); }    
				}
				// paper win/lose
				else if(choice == 2) {
				    if(roll == 3) { System.out.println("AI: My scissors beats your paper!Loser!"); }
				    else { System.out.println("AI: Oh no your paper beats my rock! You got lucky."); }    
				}
				// scissors win/lose
				else if(choice == 3) {
				    if(roll == 1) { System.out.println("AI: My rock beats your scissors nerd!"); }
				    else { System.out.println("AI: Your scissors beats my paper, dang it! :("); }    
				}
			
	} else if(options == 2) {
		print("Are you broke?");
		print("yes");
		print("no");
		
		Scanner answer = new Scanner(System.in);
		String ans = in.nextLine();
		if(ans.equals("no")) {
			
			print("Would like to order takeout?");
			print("yes");
			print("no");
			String ans1 = in.nextLine();
		
			if(ans1.equals("yes")) {
				print("Get up and put some clothes on before the delivery!");
			}
			if(ans1.equals("no")) {
					print("Well you should go grocery shopping.");
			}
		}
		 if(ans.equals("yes")) {
			 print("If you're broke then get up and chop some veggies!");}	
			} 
		
	}
	}	
	
