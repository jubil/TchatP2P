package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import main.Main;

public class Child implements Runnable {

	private Socket s;

	public Child(Socket s) {
		this.s = s;
	}

	public void run() {
		System.out.println("New Child : " + s.getInetAddress() + ":" + s.getPort());
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while (true) {
				// Waiting for message
				String str = br.readLine();

				// Construct Message, TODO Check tab length
				String[] tab = str.split("&");
				Message msg = new Message(Long.valueOf(tab[0]), tab[1], tab[2]);

				// TODO Forward
				Main.server.sendMessage(msg);

			}

		} catch (IOException e) {
			System.out.println("Connection lost with " + s.getInetAddress() + ":" + s.getPort());
		}
	}
	
	public void close(){
		try {
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendMessage(Message msg) {
		try {
			PrintWriter out = new PrintWriter(s.getOutputStream(), true);

			// TODO Message Format
			out.println(msg.getDate() + "&" + msg.getLogin() + "&" + msg.getText());

			// Validate
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
