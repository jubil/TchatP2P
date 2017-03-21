package gui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import main.Main;
import network.Child;

public class Connection extends JPanel {
	private JTextField textFieldLogin;
	private JTextField textFieldIp;

	private JSpinner spinner;
	
	public Connection() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblTchatPp = new JLabel("Tchat P2P - Connection");
		lblTchatPp.setFont(lblTchatPp.getFont().deriveFont(lblTchatPp.getFont().getStyle() | Font.BOLD, lblTchatPp.getFont().getSize() + 10f));
		GridBagConstraints gbc_lblTchatPp = new GridBagConstraints();
		gbc_lblTchatPp.gridwidth = 3;
		gbc_lblTchatPp.insets = new Insets(0, 0, 5, 5);
		gbc_lblTchatPp.gridx = 0;
		gbc_lblTchatPp.gridy = 0;
		add(lblTchatPp, gbc_lblTchatPp);
		
		JLabel lblYourName = new JLabel("  Your Name : ");
		GridBagConstraints gbc_lblYourName = new GridBagConstraints();
		gbc_lblYourName.insets = new Insets(0, 0, 5, 5);
		gbc_lblYourName.anchor = GridBagConstraints.WEST;
		gbc_lblYourName.gridx = 0;
		gbc_lblYourName.gridy = 1;
		add(lblYourName, gbc_lblYourName);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setText(Main.login);
		GridBagConstraints gbc_txtAnonymous = new GridBagConstraints();
		gbc_txtAnonymous.insets = new Insets(0, 0, 5, 5);
		gbc_txtAnonymous.fill = GridBagConstraints.BOTH;
		gbc_txtAnonymous.gridx = 1;
		gbc_txtAnonymous.gridy = 1;
		add(textFieldLogin, gbc_txtAnonymous);
		textFieldLogin.setColumns(10);
		
		JButton btnChange = new JButton("Change");
		GridBagConstraints gbc_btnChange = new GridBagConstraints();
		gbc_btnChange.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnChange.insets = new Insets(0, 0, 5, 5);
		gbc_btnChange.gridx = 2;
		gbc_btnChange.gridy = 1;
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.login = textFieldLogin.getText();
			}
		});
		add(btnChange, gbc_btnChange);
		
		JLabel lblIp = new JLabel("  IP : ");
		lblIp.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblIp = new GridBagConstraints();
		gbc_lblIp.anchor = GridBagConstraints.WEST;
		gbc_lblIp.insets = new Insets(0, 0, 5, 5);
		gbc_lblIp.gridx = 0;
		gbc_lblIp.gridy = 2;
		add(lblIp, gbc_lblIp);
		
		textFieldIp = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		add(textFieldIp, gbc_textField_1);
		textFieldIp.setColumns(10);
		
		JLabel lblPort = new JLabel("  Port : ");
		GridBagConstraints gbc_lblPort = new GridBagConstraints();
		gbc_lblPort.anchor = GridBagConstraints.WEST;
		gbc_lblPort.insets = new Insets(0, 0, 5, 5);
		gbc_lblPort.gridx = 0;
		gbc_lblPort.gridy = 3;
		add(lblPort, gbc_lblPort);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(25566, 1, 65535, 1));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.fill = GridBagConstraints.BOTH;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 1;
		gbc_spinner.gridy = 3;
		add(spinner, gbc_spinner);
		
		JButton btnSeConnecter = new JButton("Connect");
		GridBagConstraints gbc_btnSeConnecter = new GridBagConstraints();
		gbc_btnSeConnecter.fill = GridBagConstraints.BOTH;
		gbc_btnSeConnecter.gridheight = 2;
		gbc_btnSeConnecter.insets = new Insets(0, 0, 5, 5);
		gbc_btnSeConnecter.gridx = 2;
		gbc_btnSeConnecter.gridy = 2;
		btnSeConnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Main.server.addParent(new Child(new Socket(textFieldIp.getText(), (Integer) spinner.getValue())));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		add(btnSeConnecter, gbc_btnSeConnecter);

		
		
	}

}
