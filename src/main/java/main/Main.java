package main;

import gui.Window;
import network.Server;

public class Main {

	public static final int PORT = 25566;
	public static String login = "Anonymous";
	
	public static Server server;
	
	public static void main(String[] args) {

		//Lunch local Server
		server = new Server(PORT);
		Thread t = new Thread(server);
		t.start();
		
		//Open GUI		
		Window frame = new Window();

	}

}
