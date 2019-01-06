package game;

import java.io.IOException;

public class RoomFenetrechambre implements Room {
	private static RoomFenetrechambre instance = new RoomFenetrechambre();
	private RoomFenetrechambre() {}
	public static RoomFenetrechambre instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[à travers la fenêtre] PV : "+g.health);
		System.out.println("Vous sautez à travers la fenêtre, vous atterrissez dans un buisson qui vous épargne des dégâts de la chute.\n	Vous êtes hors du château, dans la forêt.\n	Vous partez probablement le plus loin possible en courant.\n	Mais vous voyez aussi un soupirail au niveau du sol.");
		// check win
		g.status=Status.WON;
		// present actions
		System.out.println("actions:");
		System.out.println("[revenir] revenir dans le château (sérieusement ?)");
		System.out.println("[terminer] terminer le jeu (gagné)");
		// read input
		System.out.print("> ");
		String input = g.userinput.readLine();
		// change state
		switch(input) {
			case "revenir":
				g.room = RoomFondcave.instance();
				break;
			case "terminer":
				break;
			default:
				System.out.println("commande inconnue");
		}	
	}
}
