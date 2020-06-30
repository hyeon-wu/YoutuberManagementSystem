package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.YoutuberViewer;
import manager.YoutuberManager;

public class ButtonViewerListener implements ActionListener {
	WindowFrame frame;
	public ButtonViewerListener(WindowFrame frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		YoutuberViewer youtuberViewer=frame.getYoutuberviewer();
		YoutuberManager youtuberManager=getObject("youtubermanager.ser");		
		youtuberViewer.setYoutuberManager(youtuberManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(youtuberViewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static YoutuberManager getObject(String filename) {
		YoutuberManager youtuberManager=null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			youtuberManager=(YoutuberManager)in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return youtuberManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return youtuberManager;
	}
}
