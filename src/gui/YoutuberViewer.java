package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class YoutuberViewer extends JPanel{
	WindowFrame frame;
	public YoutuberViewer(WindowFrame frame) {
		this.frame=frame;
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Subscriber num");
		model.addColumn("Link");

		JTable table=new JTable(model);
		JScrollPane sp=new JScrollPane(table);

		this.add(sp);
	}
}
