package game;

import java.io.IOException;

public class RoomSoupirailcave implements Room {
	private static RoomSoupirailcave instance = new RoomSoupirailcave();
	private RoomSoupirailcave() {}
	public static RoomSoupirailcave instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[passé le soupirail] PV : "+g.health);
		System.out.println("Avec un peu de difficulté vous vous extrayez du soupirail.\n	Vous êtes revenu à l'extérieur du château, dans la forêt.\n	Vous partez probablement le plus loins possible en courant.");
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
