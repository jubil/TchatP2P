package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class Window extends JFrame {
	
	public static Window window; 
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Window() {
		window = this;
		setTitle("Tchat P2P - Jubil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 640);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmSeConnecter = new JMenuItem("Connect...");
		mntmSeConnecter.addActionListener(new Redirect(new Connection()));
		mnFile.add(mntmSeConnecter);
		
		JMenuItem mntmDisconnect = new JMenuItem("Disconnect");
		mnFile.add(mntmDisconnect);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnTchat = new JMenu("Tchat");
		menuBar.add(mnTchat);
		
		JMenuItem mntmGlobalTchat = new JMenuItem("Global Tchat");
		mntmGlobalTchat.addActionListener(new Redirect(new Tchat()));
		mnTchat.add(mntmGlobalTchat);
		
		contentPane = new Connection();
		setContentPane(contentPane);
		
		setVisible(true);
	}

}
