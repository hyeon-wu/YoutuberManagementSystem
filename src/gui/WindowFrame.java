package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	WindowFrame frame;
	MenuSelection menuselection;
	YoutuberAdder youtuberadder;
    YoutuberViewer youtuberviewer;
    
	public WindowFrame() {
		this.menuselection=new MenuSelection(this);
	    this.youtuberadder=new YoutuberAdder(this);
	    this.youtuberviewer=new YoutuberViewer(this);
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	   public MenuSelection getMenuselection() {
			return menuselection;
		}

		public void setMenuselection(MenuSelection menuselection) {
			this.menuselection = menuselection;
		}

		public YoutuberAdder getYoutuberadder() {
			return youtuberadder;
		}

		public void setYoutuberadder(YoutuberAdder youtuberadder) {
			this.youtuberadder = youtuberadder;
		}

		public YoutuberViewer getYoutuberviewer() {
			return youtuberviewer;
		}

		public void setYoutuberviewer(YoutuberViewer youtuberviewer) {
			this.youtuberviewer = youtuberviewer;
		}
}
