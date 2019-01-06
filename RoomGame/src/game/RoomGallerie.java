package game;

import java.io.IOException;

public class RoomGallerie implements Room {
	private static RoomGallerie instance = new RoomGallerie();
	private RoomGallerie() {}
	public static RoomGallerie instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[dans la gallerie du hall] PV : "+g.health);
		System.out.println("Vous êtes dans la grande gallerie en haut du hall.\n	Elle fait le tour de la pièce et les murs sont couverts de portraits de personnes à l'air inquiétant.\n	Deux couloirs s'ouvrent au départ de la gallerie.\n	A droite un couloir éclairé avec une lumière rouge sombre.\n	A gauche un couloir éclairé avec une lumière rouge sombre aussi.");
		// present actions
		System.out.println("actions:");
		System.out.println("[droite] prendre le couloir de droite");
		System.out.println("[gauche] prendre le couloir de gauche");
		// read input
		System.out.print("> ");
		String input = g.userinput.readLine();
		// change state
		switch(input) {
			case "droite":
				g.room = RoomCouloirdroite.instance();
				break;
			case "gauche":
				g.room = RoomCouloirgauche.instance();
				break;
			default:
				System.out.println("commande inconnue");
		}	
	}
}
