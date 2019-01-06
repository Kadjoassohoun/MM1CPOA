package game;

import java.io.IOException;

public class RoomHautescaliercave implements Room {
	private static RoomHautescaliercave instance = new RoomHautescaliercave();
	private RoomHautescaliercave() {}
	public static RoomHautescaliercave instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[en haut de l'escalier sombre] PV : "+g.health);
		System.out.println("Il s'agit d'un escalier sombre qui s'enfonce dans le sol. Vous voyez à peine les marches en bois.");
		// present actions
		System.out.println("actions:");
		System.out.println("[descendre] descendre l'escalier");
		System.out.println("[hall] retourner dans le hall");
		// read input
		System.out.print("> ");
		String input = g.userinput.readLine();
		// change state
		switch(input) {
			case "descendre":
				g.room = RoomBasescaliercave.instance();
				break;
			case "hall":
				g.room = RoomHall.instance();
				break;
			default:
				System.out.println("commande inconnue");
		}	
	}
}
