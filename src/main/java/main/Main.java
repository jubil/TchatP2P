package main;

import gui.Window;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
