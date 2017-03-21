package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Child implements Runnable {
	
	private Socket s;

	public Child(Socket s) {
		this.s = s;
	}

	public void run() {
		System.out.println("New Child : " + s.getInetAddress() + ":" +s.getPort());
		// TODO TEST
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while (true) {
				// Waiting for message
				String msg = br.readLine();
				System.out.println(msg);

				//TODO Forward
			}

		} catch (IOException e) {
			System.out.println("Connection perdu avec le serveur");
		}
	}

	//TODO TEST
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
