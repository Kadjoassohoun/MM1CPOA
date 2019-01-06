package game;

import java.io.IOException;

public class RoomHall implements Room {
	private static RoomHall instance = new RoomHall();
	private RoomHall() {}
	public static RoomHall instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[dans le hall d'entrée] PV : "+g.health);
		System.out.println("Vous êtes dans le hall du château. Il s'agit d'une grande pièce sombre à peine éclairée par des bougies.\n	Il n'y a personne dans la pièce, mais pas de téléphone non plus.\n	Vous voyez une porte à droite, une porte à gauche, et un grand escalier qui monte au premier étage.\n	Derrière vous se trouve la porte d'entrée.");
		// present actions
		System.out.println("actions:");
		System.out.println("[droite] aller à droite");
		System.out.println("[gauche] aller à gauche");
		System.out.println("[monter] monter l'escalier");
		System.out.println("[sortir] sortir du chateau");
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
			case "sortir":
				g.room = RoomHall2.instance();
				break;
			default:
				System.out.println("commande inconnue");
		}	
	}
}
