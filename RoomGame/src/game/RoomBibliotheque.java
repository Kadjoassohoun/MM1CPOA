package game;

import java.io.IOException;

public class RoomBibliotheque implements Room {
	private static RoomBibliotheque instance = new RoomBibliotheque();
	private RoomBibliotheque() {}
	public static RoomBibliotheque instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[dans la bibliothèque] PV : "+g.health);
		System.out.println("Vous êtes dans une grande bibliothèque aux murs couverts de livres.\n	Sur une table, au centre, une bougie et un plan du château.\n	Des ronds verts sont dessinées sur trois pièces: \n	une pièce du rez de chaussée au fond à droite, \n	une pièce en bas du château accessible par des escaliers, \n	et une pièce au premier étage au bout du couloir de droite.\n	Il y a aussi des grandes croix rouges et un symbole de danger sur la pièce en bas des escaliers \n	et sur la pièce au bout du couloir de droite.");
		// present actions
		System.out.println("actions:");
		System.out.println("[sortir] sortir de la bibliothèque");
		// read input
		System.out.print("> ");
		String input = g.userinput.readLine();
		// change state
		switch(input) {
			case "sortir":
				g.room = RoomCouloirgauche.instance();
				break;
			default:
				System.out.println("commande inconnue");
		}	
	}
}
