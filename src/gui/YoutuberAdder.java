package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.YoutuberAdderCancleListener;
import event.YoutuberAdderListener;
import manager.YoutuberManager;

public class YoutuberAdder extends JPanel {
	
	WindowFrame frame;
	YoutuberManager youtuberManager;
	
	public YoutuberAdder(WindowFrame frame, YoutuberManager youtuberManager) {
		this.frame=frame;
		this.youtuberManager=youtuberManager;
		
		JPanel panel=new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelID=new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID=new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);

		JLabel labelName=new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName=new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);

		JLabel labelSub=new JLabel("Subscriber Num: ", JLabel.TRAILING);
		JTextField fieldSub=new JTextField(10);
		labelSub.setLabelFor(fieldSub);
		panel.add(labelSub);
		panel.add(fieldSub);

		JLabel labelLink=new JLabel("Link: ", JLabel.TRAILING);
		JTextField fieldLink=new JTextField(10);
		labelLink.setLabelFor(fieldLink);
		
		JButton saveButton=new JButton("save");
		saveButton.addActionListener(new YoutuberAdderListener(fieldID, fieldName, fieldSub, fieldLink, youtuberManager));
		
		JButton cancleButton=new JButton("cancle");
		cancleButton.addActionListener(new YoutuberAdderCancleListener(frame));
		panel.add(labelLink);
		panel.add(fieldLink);

		panel.add(saveButton);
		panel.add(cancleButton);

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

		this.add(panel);
		this.setVisible(true);
	}
}
