package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.YoutuberAdder;
import gui.YoutuberViewer;

public class YoutuberAdderCancleListener implements ActionListener {
	WindowFrame frame;
	public YoutuberAdderCancleListener(WindowFrame frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}
}
