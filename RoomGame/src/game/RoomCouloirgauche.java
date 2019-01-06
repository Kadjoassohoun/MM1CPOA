package game;

import java.io.IOException;

public class RoomCouloirgauche implements Room {
	private static RoomCouloirgauche instance = new RoomCouloirgauche();
	private RoomCouloirgauche() {}
	public static RoomCouloirgauche instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[dans le couloir de gauche] PV : "+g.health);
		System.out.println("Vous êtes dans le couloir de gauche. Au fond il y a une porte sous laquelle il y a de la lumière.");
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
				g.room = RoomBibliotheque.instance();
				break;
			case "revenir":
				g.room = RoomGallerie.instance();
				break;
			default:
				System.out.println("commande inconnue");
		}	
	}
}
