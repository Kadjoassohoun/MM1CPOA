package game;

import java.io.IOException;

public class RoomCave implements Room {
	private static RoomCave instance = new RoomCave();
	private RoomCave() {}
	public static RoomCave instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[dans la cave] PV : "+g.health);
		System.out.println("Vous êtes dans une cave. Les murs sont couverts de boîtes de conserves.\n	Sur ces dernières, des noms (Alice, Bob, ...) remplacent les légumes que vous vous attendez à trouver.");
		// check monster
		System.out.println("Une horde de rats affamés vous attaque avec leurs morsures");
		System.out.println("Vous perdez 3 points de vie");
		g.health -= 3;
		System.out.println("[dans la cave] PV : "+g.health);
		if (g.health <= 0) {
			g.status=Status.LOST;
			return;
		}
		// present actions
		System.out.println("actions:");
		System.out.println("[courir] courir vers un renfoncement dans le fond de la cave");
		System.out.println("[enfuir] s'enfuir vers les escaliers sombres");
		// read input
		System.out.print("> ");
		String input = g.userinput.readLine();
		// change state
		switch(input) {
			case "courir":
				g.room = RoomFondcave.instance();
				break;
			case "enfuir":
				g.room = RoomBasescaliercave.instance();
				break;
			default:
				System.out.println("commande inconnue");
		}	
	}
}
