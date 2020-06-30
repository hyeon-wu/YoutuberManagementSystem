package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.YoutuberAdder;
import gui.YoutuberViewer;

public class ButtonAdderListener implements ActionListener {
	WindowFrame frame;
	public ButtonAdderListener(WindowFrame frame) {
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getYoutuberadder());
		frame.revalidate();
		frame.repaint();
	}
}
