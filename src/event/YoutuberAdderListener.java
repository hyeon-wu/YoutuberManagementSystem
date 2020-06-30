package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Youtuber.VlogYoutuber;
import Youtuber.YoutuberInput;
import Youtuber.YoutuberKind;
import exceptions.LinkFormatException;
import manager.YoutuberManager;

public class YoutuberAdderListener implements ActionListener {
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldSub;
	JTextField fieldLink;
	
	YoutuberManager youtuberManager;

	public YoutuberAdderListener(
			JTextField fieldID,
			JTextField fieldName,
			JTextField fieldSub, 
			JTextField fieldLink,YoutuberManager youtuberManager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldSub = fieldSub;
		this.fieldLink = fieldLink;
		this.youtuberManager=youtuberManager;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		YoutuberInput youtuber=new VlogYoutuber(YoutuberKind.Vlog);
		try {
			youtuber.setId(Integer.parseInt(fieldID.getText()));
			youtuber.setName(fieldName.getName());
			youtuber.setSubscribernum(Integer.parseInt(fieldSub.getText()));
			youtuber.setLink(fieldLink.getText());
			youtuberManager.addYoutuber(youtuber);
			putObject(youtuberManager, "youtubermanager.ser");
			youtuber.printInfo();
		} catch (LinkFormatException e) {
			e.printStackTrace();
		}
	}
	public static void putObject(YoutuberManager youtuberManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(youtuberManager);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
