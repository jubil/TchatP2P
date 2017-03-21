package gui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

public class Connection extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

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
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblIp = new JLabel("  IP : ");
		lblIp.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblIp = new GridBagConstraints();
		gbc_lblIp.anchor = GridBagConstraints.WEST;
		gbc_lblIp.insets = new Insets(0, 0, 5, 5);
		gbc_lblIp.gridx = 0;
		gbc_lblIp.gridy = 2;
		add(lblIp, gbc_lblIp);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPort = new JLabel("  Port : ");
		GridBagConstraints gbc_lblPort = new GridBagConstraints();
		gbc_lblPort.anchor = GridBagConstraints.WEST;
		gbc_lblPort.insets = new Insets(0, 0, 5, 5);
		gbc_lblPort.gridx = 0;
		gbc_lblPort.gridy = 3;
		add(lblPort, gbc_lblPort);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(25566, 1, 65535, 1));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.fill = GridBagConstraints.BOTH;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 1;
		gbc_spinner.gridy = 3;
		add(spinner, gbc_spinner);
		
		JButton btnSeConnecter = new JButton("Connect");
		GridBagConstraints gbc_btnSeConnecter = new GridBagConstraints();
		gbc_btnSeConnecter.anchor = GridBagConstraints.EAST;
		gbc_btnSeConnecter.insets = new Insets(0, 0, 0, 5);
		gbc_btnSeConnecter.gridx = 1;
		gbc_btnSeConnecter.gridy = 4;
		add(btnSeConnecter, gbc_btnSeConnecter);

		
		
	}

}
