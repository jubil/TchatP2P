package network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server implements Runnable {

	private int port;
	
	private ArrayList<Child> children;
	private ArrayList<Message> messages;
	
	public Server(int port) {
		this.port = port;
		children = new ArrayList<Child>();
		messages = new ArrayList<Message>();
	}

	public void run() {
		try {
			//Start Server d'écoute
			ServerSocket ss = new ServerSocket(port);
			System.out.println("Server Started...");
			
			//Waitting connection
			while(true){
					Socket s = ss.accept();
					Child c = new Child(s);
					children.add(c);
					Thread t = new Thread(c);
					t.start();
					for(Message msg : messages){
						c.sendMessage(msg);
					}
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
	
	public void sendMessage(Message msg){
		//TODO Check if the message was already sent
		for(Message m : messages){
			if(msg.getDate() == m.getDate() && msg.getLogin().equals(m.getLogin())){
				return;
			}
		}
		//Save message
		messages.add(msg);
		
		//Send message
		for(Child c : children){
			c.sendMessage(msg);
		}
	}
	
	public void showMessages(){
		System.out.println(getMessages());
	}

	public String getMessages() {
		String str = "";
		for(Message m : messages){
			str += ("<" + m.getLogin() + "> : " + m.getText()+ "\n" );
		}
		return str;
	}
}
