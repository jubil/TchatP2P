package gui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Tchat extends JPanel {

	/**
	 * Create the panel.
	 */
	public Tchat() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblGlobalRoom = new JLabel("Global Room");
		lblGlobalRoom.setHorizontalAlignment(SwingConstants.CENTER);
		lblGlobalRoom.setFont(lblGlobalRoom.getFont().deriveFont(lblGlobalRoom.getFont().getStyle() | Font.BOLD, lblGlobalRoom.getFont().getSize() + 10f));
		GridBagConstraints gbc_lblGlobalRoom = new GridBagConstraints();
		gbc_lblGlobalRoom.gridx = 0;
		gbc_lblGlobalRoom.gridy = 0;
		add(lblGlobalRoom, gbc_lblGlobalRoom);

	}

}
