package src.mathPlot.components;

import java.awt.event.*;
import java.security.*;

import javax.swing.*;

import src.mathPlot.plot.*;

/**
 * BSD License
 * 
 * @author Yann RICHET
 */

public class DataToolBar extends JToolBar {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;

	protected JButton buttonPasteToClipboard;

	protected JButton buttonSaveFile;

	private boolean denySaveSecurity;

	private JFileChooser fileChooser;

	private DataPanel dataPanel;

	public DataToolBar(DataPanel dp) {

		dataPanel = dp;

		try {
			fileChooser = new JFileChooser();
		} catch (AccessControlException ace) {
			denySaveSecurity = true;
		}

		buttonPasteToClipboard = new JButton(new ImageIcon("/Users/shivamawasthi/Documents/Juzzy/Juzzy_V1-10_Source/Juzzy/src/mathPlot/icons/toclipboard.png"));
		buttonPasteToClipboard.setToolTipText("Copy data to clipboard");

		buttonSaveFile = new JButton(new ImageIcon("/Users/shivamawasthi/Documents/Juzzy/Juzzy_V1-10_Source/Juzzy/src/mathPlot/icons/tofile.png"));
		buttonSaveFile.setToolTipText("Save data into ASCII file");

		buttonPasteToClipboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataPanel.toClipBoard();
			}
		});
		buttonSaveFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chooseFile();
			}
		});

		add(buttonPasteToClipboard, null);
		add(buttonSaveFile, null);

		if (!denySaveSecurity) {
			fileChooser.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(ActionEvent e) {
					saveFile();
				}
			});
		} else {
			buttonSaveFile.setEnabled(false);
		}
	}

	void saveFile() {
		java.io.File file = fileChooser.getSelectedFile();
		dataPanel.toASCIIFile(file);
	}

	void chooseFile() {
		fileChooser.showSaveDialog(this);
	}

}