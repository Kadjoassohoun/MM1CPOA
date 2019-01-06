package game;

import java.io.IOException;

public class RoomCuisine implements Room {
	private static RoomCuisine instance = new RoomCuisine();
	private RoomCuisine() {}
	public static RoomCuisine instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[dans la cuisine] PV : "+g.health);
		System.out.println("La pièce est une cuisine.\n	Dans la pénombre, vous appercevez une grande table est au centre sur laquelle vous voyez des restes de repas.\n	Au fond de la pièce vous voyez une petite porte en bois sous laquelle il y a de la lumière.");
		// present actions
		System.out.println("actions:");
		System.out.println("[hall] retourner dans le hall");
		System.out.println("[ouvrir] ouvrir la porte en bois");
		// read input
		System.out.print("> ");
		String input = g.userinput.readLine();
		// change state
		switch(input) {
			case "hall":
				g.room = RoomHall.instance();
				break;
			case "ouvrir":
				g.room = RoomReserve.instance();
				break;
			default:
				System.out.println("commande inconnue");
		}	
	}
}
