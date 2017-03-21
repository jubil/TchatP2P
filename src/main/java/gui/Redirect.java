package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Redirect implements ActionListener {

	private JPanel panel;
	
	public Redirect(JPanel panel) {
		this.panel = panel;
	}
	
	//Default redirect
	public Redirect(){
		this(new Connection());
	}
	
	public void actionPerformed(ActionEvent e) {
		Window.window.setContentPane(panel);
		Window.window.validate();
		//Window.window.setVisible(false);
		//Window.window.setVisible(true);
	}

}