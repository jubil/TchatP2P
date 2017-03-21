package network;

import java.net.Socket;

public class Child implements Runnable {
	
	private Socket s;

	public Child(Socket s) {
		this.s = s;
	}

	public void run() {
		System.out.println("New Child : " + s.getInetAddress() + ":" +s.getPort());
		// TODO client listening
	}

	//TODO sendMessage
	public void sendMessage(String str) {
		
	}

}
