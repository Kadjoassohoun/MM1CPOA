package game;

import java.io.IOException;

public class RoomChambre implements Room {
	private static RoomChambre instance = new RoomChambre();
	private RoomChambre() {}
	public static RoomChambre instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[dans la chambre du maître du château] PV : "+g.health);
		System.out.println("Vous êtes dans une chambre sombre, \n	vous y voyez à peine grâce à la pleine lune qui est visible à travers une fenêtre ouverte au fond de la pièce.\n	Au centre, il y a un cercueil, ouvert, dans lequel semble dormir un homme en cape rouge.");
		// check monster
		System.out.println("Le maître du château vous attaque avec une épée");
		System.out.println("Vous perdez 10 points de vie");
		g.health -= 10;
		System.out.println("[dans la chambre du maître du château] PV : "+g.health);
		if (g.health <= 0) {
			g.status=Status.LOST;
			return;
		}
		// present actions
		System.out.println("actions:");
		System.out.println("[sortir] s'enfuir par la porte d'entrée en refermant la porte derrière vous");
		System.out.println("[sauter] tenter le tout pour le tout et sauter par la fenêtre ouverte");
		// read input
		System.out.print("> ");
		String input = g.userinput.readLine();
		// change state
		switch(input) {
			case "sortir":
				g.room = RoomCouloirdroite.instance();
				break;
			case "sauter":
				g.room = RoomFenetrechambre.instance();
				break;
			default:
				System.out.println("commande inconnue");
		}	
	}
}
