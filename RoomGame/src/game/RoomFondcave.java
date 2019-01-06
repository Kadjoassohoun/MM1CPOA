package game;

import java.io.IOException;

public class RoomFondcave implements Room {
	private static RoomFondcave instance = new RoomFondcave();
	private RoomFondcave() {}
	public static RoomFondcave instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[dans le renfoncement au fond de la cave] PV : "+g.health);
		System.out.println("Vous êtes dans un renfoncement sombre (encore plus que la cave). Vous sentez de l'air frais venir d'en haut.\n	En regardant vous appercevez un soupirail. Il ne semble pas très solide, mais il n'est pas très large non plus.");
		// present actions
		System.out.println("actions:");
		System.out.println("[soupirail] forcer le soupirail et passer, au risque de rester coincé");
		System.out.println("[cave] ne pas prendre le risque et revenir en arrière");
		// read input
		System.out.print("> ");
		String input = g.userinput.readLine();
		// change state
		switch(input) {
			case "soupirail":
				g.room = RoomSoupirailcave.instance();
				break;
			case "cave":
				g.room = RoomCave.instance();
				break;
			default:
				System.out.println("commande inconnue");
		}	
	}
}
