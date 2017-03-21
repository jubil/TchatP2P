package main;

import gui.Window;
import network.Server;

public class Main {

	public static final int PORT = 25566;
	
	public static void main(String[] args) {

		//Lunch local Server
		Thread server = new Thread(new Server(PORT));
		server.start();
		
		//Open GUI		
		Window frame = new Window();

	}

}
