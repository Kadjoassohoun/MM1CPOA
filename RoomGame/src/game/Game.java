package game;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Game {
	
	int health;
	Status status;
	Room room;
	BufferedReader userinput = new BufferedReader(new InputStreamReader(System.in));
	
	public Game() {
		health = 12;
		status = Status.WAITING;
		room = RoomDevant.instance();				
	}
	
	public void run() throws IOException {
		status = Status.RUNNING;
		while(status == Status.RUNNING) {
			room.play(this);
		}
		if(status == Status.LOST) {
			System.out.println("Game over. You lost.");
		}
		else {
			System.out.println("Game over. You won.");
		}
		
	}
	
	public static void main(String args[]) throws IOException {
		Game g = new Game();
		g.run();
	}
}
