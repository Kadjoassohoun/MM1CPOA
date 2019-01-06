package game;

import java.io.IOException;

public class RoomDevant implements Room {
	private static RoomDevant instance = new RoomDevant();
	private RoomDevant() {}
	public static RoomDevant instance() { return instance; }
	public void play(Game g) throws IOException {
		// print information
		System.out.println("[devant le chateau] PV : "+g.health);
		System.out.println("Votre voiture est tombée en panne dans la forêt. Votre portable n'a plus de batterie.\n	Vous voyez une lumière au fond des bois.\n	Vous décidez de vous en approcher dans l'espoir de pouvoir prévenir un dépanneur.\n	C'est un château à moitié en ruine. La lumière semble venir des étages supérieurs.\n	Vous êtes devant la porte du chateau. Il pleut. \n	Vous frappez à la porte mais personne ne répond. Pourtant la porte ne semble pas fermée à clé.\n	Vous décidez d'entrer.");
		// present actions
		System.out.println("actions:");
		System.out.println("[entrer] ouvrir la porte et entrer");
		// read input
		System.out.print("> ");
		String input = g.userinput.readLine();
		// change state
		switch(input) {
			case "entrer":
				g.room = RoomHall.instance();
				break;
			default:
				System.out.println("commande inconnue");
		}	
	}
}
