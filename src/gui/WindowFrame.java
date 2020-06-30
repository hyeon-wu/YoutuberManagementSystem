package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.YoutuberManager;

public class WindowFrame extends JFrame{

	YoutuberManager youtuberManager;
	
	MenuSelection menuSelection;
	YoutuberAdder youtuberadder;
	YoutuberViewer youtuberviewer;

	public WindowFrame(YoutuberManager youtuberManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");

		this.youtuberManager=youtuberManager;
		menuSelection=new MenuSelection(this);
		youtuberadder=new YoutuberAdder(this, this.youtuberManager);
		youtuberviewer=new YoutuberViewer(this, this.youtuberManager);

		this.add(menuSelection);
		this.setVisible(true);
	}

	public MenuSelection getMenuselection() {
		return menuSelection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuSelection = menuselection;
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
