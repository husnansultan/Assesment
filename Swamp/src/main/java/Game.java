import java.util.Scanner;

public class Game {

	public static void intro() {

		System.out.println("Grey foggy clouds float oppressively close to you, reflected in the murky grey water which reaches up your shins. \n");
		System.out.println("Try \"north\",\"south\",\"east\",or \"west\" \n");
		System.out.println("You notice a small watch-like device in your left hand. \n");
		System.out.println("It has hands like a watch, but the hands don't seem to tell time. \n");
	}
	
	public static void playerpos() {

		int TX = (int) ((Math.random() * ((10) + 1)) + 0);
		int TY = (int) ((Math.random() * ((10) + 1)) + 0);
		
		int PX = (int) ((Math.random() * ((10) + 1)) + 0);
		int PY = (int) ((Math.random() * ((10) + 1)) + 0);
		
		@SuppressWarnings("unused")
		Swamp T1 = new Swamp(TX, TY);
		@SuppressWarnings("unused")
		Player P1 = new Player(PX, PY);
		
		System.out.println("The Coordinates for the first treasure are: " + "x:" +TX + " y:" + TY + "\n");
		
		System.out.println("The Coordinates for your position are: " + "x:" + PX + " y:" + PY);
		
		inputMovement(PX, PY, TX, TY);
	}

	public static void inputMovement(int PX, int PY, int TX, int TY) {

		Scanner sc;

		do {
			sc = new Scanner(System.in);
			String input = sc.next();

			if (input.equals("w") || input.equals("west")) {
				System.out.println("You walked west");
				PX = PX - 1;
				int dis;
				
				if(PX > TX) {
					dis = PX - TX;
				}else {
					dis = TX - PX;
				}
				if(PX == TX) {
					System.out.println("Your position is : "+ "x:" + PX +" and the Treasure is: " + dis + " Meters Away on the x axis. You are on the right tracks try moving north or south");
				}else {
					System.out.println("Your position is : "+ "x:" + PX +" and the Treasure is: " + dis + " Meters Away on the x axis.");
				}
				
			} else if (input.equals("e") || input.equals("east")) {
				System.out.println("You walked east");
				PX = PX + 1;
				int dis;
				if(PX > TX) {
					dis = PX - TX;
				}else {
					dis = TX - PX;
				}
				if(PX == TX) {
					System.out.println("Your position is : "+ "x:" + PX +" and the Treasure is: " + dis + " Meters Away on the x axis. You are on the right tracks try moving North or South");
				}else {
					System.out.println("Your position is : "+ "x:" + PX +" and the Treasure is: " + dis + " Meters Away on the x axis.");
				}
			} else if (input.equals("n") || input.equals("north")) {
				System.out.println("You walked north");
				PY = PY + 1;
				int dis;
				if(PY > TY) {
					dis = PY - TY;
				}else {
					dis = TY - PY;
				}
				if(PY == TY) {
					System.out.println("Your position is : " + "y:" + PY + " and the Treasure is: " + dis + " Meters Away on the y axis. You are on the right tracks try moving East or West");
				}else {
					System.out.println("Your position is : " + "y:" + PY + " and the Treasure is: " + dis + " Meters Away on the y axis.");
				}
			} else if (input.equals("s") || input.equals("south")) {
				System.out.println("You walked south");
				PY = PY - 1;
				int dis;
				if(PY > TY) {
					dis = PY - TY;
				}else {
					dis = TY - PY;
				}
				if(PY == TY) {
					System.out.println("Your position is : " + "y:" + PY + " and the Treasure is: " + dis + " Meters Away on the y axis. You are on the right tracks try moving East or West");
				}else {
					System.out.println("Your position is : " + "y:" + PY + " and the Treasure is: " + dis + " Meters Away on the y axis.");
				}
			}
		} while (!(PX == TX && PY == TY));

		sc.close();
		outro();
	}

	public static void outro() {

		System.out.println("You find a small box in Plains.");
		System.out.println("Its filled with treasure!  You win!  The end");
		System.out.println("The End!");
	}
}
