package network;

import java.net.Socket;

public class Child extends Node implements Runnable {
	
	public Child(Socket s) {
		super(s);
	}

	public void run() {
		System.out.println("New Child : " + s.getInetAddress() + ":" +s.getPort());
		// TODO Auto-generated method stub

	}

}
