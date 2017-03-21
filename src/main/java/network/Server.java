package network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server implements Runnable {

	private int port;
	
	private ArrayList<Child> children;
	
	public Server(int port) {
		this.port = port;
		children = new ArrayList<Child>();
	}

	public void run() {
		try {
			//Start Server d'écoute
			ServerSocket ss = new ServerSocket(port);
			System.out.println("Server Started...");
			
			//Wait connection
			while(true){
					Socket s = ss.accept();
					Child c = new Child(s);
					children.add(c);
					Thread t = new Thread(c);
					t.start();
			}
		
		} catch (IOException e1) {
			e1.printStackTrace();
		}	
	}
	
	public void addParent(Child parent){
		Thread t = new Thread(parent);
		t.start();
		children.add(parent);
	}
	
	public void sendMessage(String str){
		for(Child c : children){
			c.sendMessage(str);
		}
	}
}
