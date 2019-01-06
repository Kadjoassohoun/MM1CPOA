package game;

import java.io.IOException;

public class RoomBasescaliercave implements Room {
	private static RoomBasescaliercave instance = new RoomBasescaliercave();
	private RoomBasescaliercave() {}
	public static RoomBasescaliercave instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[en bas de l'escalier sombre] PV : "+g.health);
		System.out.println("Vous êtes en bas de l'escalier sombre. Il y a quelque chose devant vous. Une grille en fer.");
		// present actions
		System.out.println("actions:");
		System.out.println("[avancer] ouvrir la grille");
		System.out.println("[monter] remonter l'escalier");
		// read input
		System.out.print("> ");
		String input = g.userinput.readLine();
		// change state
		switch(input) {
			case "avancer":
				g.room = RoomCave.instance();
				break;
			case "monter":
				g.room = RoomHautescaliercave.instance();
				break;
			default:
				System.out.println("commande inconnue");
		}	
	}
}
