package game;

import java.io.IOException;

public class RoomReserve implements Room {
	private static RoomReserve instance = new RoomReserve();
	private RoomReserve() {}
	public static RoomReserve instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[dans la reserve] PV : "+g.health);
		System.out.println("Il s'agit d'une réserve. Vous vous avancez vers la lumière. Il s'agit d'une bougie sur une petite table.");
		// check monster
		System.out.println("Igor, le serviteur du château vous attaque avec une massue");
		System.out.println("Vous perdez 5 points de vie");
		g.health -= 5;
		System.out.println("[dans la reserve] PV : "+g.health);
		if (g.health <= 0) {
			g.status=Status.LOST;
			return;
		}
		// present actions
		System.out.println("actions:");
		System.out.println("[cuisine] retourner en courant dans la cuisine, en claquant la porte de la réserve derrière vous");
		// read input
		System.out.print("> ");
		String input = g.userinput.readLine();
		// change state
		switch(input) {
			case "cuisine":
				g.room = RoomCuisine.instance();
				break;
			default:
				System.out.println("commande inconnue");
		}	
	}
}
