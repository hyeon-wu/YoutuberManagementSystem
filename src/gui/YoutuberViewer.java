package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Youtuber.YoutuberInput;
import manager.YoutuberManager;

public class YoutuberViewer extends JPanel{

	WindowFrame frame;

	YoutuberManager youtuberManager;

	public YoutuberViewer(WindowFrame frame, YoutuberManager youtuberManager) {
		this.frame=frame;
		this.youtuberManager=youtuberManager;
		System.out.println("***"+youtuberManager.size()+"***");
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Subscriber num");
		model.addColumn("Link");

		for(int i=0; i<youtuberManager.size(); i++) {
			Vector row=new Vector();
			YoutuberInput yi=youtuberManager.get(i);
			row.add(yi.getId());
			row.add(yi.getName());
			row.add(yi.getSubscribernum());
			row.add(yi.getLink());
			model.addRow(row);
		}

		JTable table=new JTable(model);
		JScrollPane sp=new JScrollPane(table);

		this.add(sp);
	}
}
