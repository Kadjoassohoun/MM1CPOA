package game;

import java.io.IOException;

public class RoomCouloirdroite implements Room {
	private static RoomCouloirdroite instance = new RoomCouloirdroite();
	private RoomCouloirdroite() {}
	public static RoomCouloirdroite instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[dans le couloir de droite] PV : "+g.health);
		System.out.println("Vous êtes dans le couloir de droite. Au fond il y a une porte. Aucune lumière ne semble en sortir.");
		// present actions
		System.out.println("actions:");
		System.out.println("[entrer] ouvrir la porte et entrer");
		System.out.println("[revenir] revenir sur vos pas");
		// read input
		System.out.print("> ");
		String input = g.userinput.readLine();
		// change state
		switch(input) {
			case "entrer":
				g.room = RoomChambre.instance();
				break;
			case "revenir":
				g.room = RoomGallerie.instance();
				break;
			default:
				System.out.println("commande inconnue");
		}	
	}
}
