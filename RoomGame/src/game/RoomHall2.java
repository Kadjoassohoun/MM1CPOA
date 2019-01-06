package game;

import java.io.IOException;

public class RoomHall2 implements Room {
	private static RoomHall2 instance = new RoomHall2();
	private RoomHall2() {}
	public static RoomHall2 instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[dans le hall d'entrée] PV : "+g.health);
		System.out.println("La porte refuse de s'ouvrir. Vous êtes enfermé dans le château.\n	Vous voyez une porte à droite, une porte à gauche, et un grand escalier qui monte au premier étage.");
		// present actions
		System.out.println("actions:");
		System.out.println("[droite] aller à droite");
		System.out.println("[gauche] aller à gauche");
		System.out.println("[monter] monter l'escalier");
		// read input
		System.out.print("> ");
		String input = g.userinput.readLine();
		// change state
		switch(input) {
			case "droite":
				g.room = RoomCuisine.instance();
				break;
			case "gauche":
				g.room = RoomHautescaliercave.instance();
				break;
			case "monter":
				g.room = RoomGallerie.instance();
				break;
			default:
				System.out.println("commande inconnue");
		}	
	}
}
