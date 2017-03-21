package gui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class Tchat extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Tchat() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblGlobalRoom = new JLabel("Global Room");
		lblGlobalRoom.setHorizontalAlignment(SwingConstants.CENTER);
		lblGlobalRoom.setFont(lblGlobalRoom.getFont().deriveFont(lblGlobalRoom.getFont().getStyle() | Font.BOLD, lblGlobalRoom.getFont().getSize() + 10f));
		GridBagConstraints gbc_lblGlobalRoom = new GridBagConstraints();
		gbc_lblGlobalRoom.gridwidth = 2;
		gbc_lblGlobalRoom.insets = new Insets(0, 0, 5, 0);
		gbc_lblGlobalRoom.gridx = 0;
		gbc_lblGlobalRoom.gridy = 0;
		add(lblGlobalRoom, gbc_lblGlobalRoom);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 2;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		GridBagConstraints gbc_btnSend = new GridBagConstraints();
		gbc_btnSend.insets = new Insets(0, 0, 5, 0);
		gbc_btnSend.gridx = 1;
		gbc_btnSend.gridy = 2;
		add(btnSend, gbc_btnSend);

	}

}
