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
		System.out.println("New Child : " + s.getInetAddress() + ":" +s.getPort());
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while (true) {
				// Waiting for message
				String msg = br.readLine();
				System.out.println(msg);

				//TODO Forward
				Main.server.sendMessage(msg);
			}

		} catch (IOException e) {
			System.out.println("Connection perdu avec le serveur");
		}
	}

	public void sendMessage(String str) {
		try {
			PrintWriter out = new PrintWriter(s.getOutputStream(),true);
			out.println(str);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
