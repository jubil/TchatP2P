package network;

import java.net.Socket;

public abstract class Node {

	protected Socket s;
	
	public Node(Socket s) {
		this.s = s;
	}

	public Socket getS() {
		return s;
	}

}
