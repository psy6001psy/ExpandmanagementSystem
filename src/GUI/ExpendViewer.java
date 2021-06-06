package GUI;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Expend.ExpendInput;
import manager.ExpendManager;

public class ExpendViewer extends JPanel {

	WindowFrame frame;
	
	ExpendManager expendManager; 
	
	public ExpendViewer(WindowFrame frame, ExpendManager expendManager) {
		this.frame = frame;
		this.expendManager = expendManager;
		
		System.out.println("***"+ expendManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Birth");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Contatct Info.");
		
		for (int i=0; i< expendManager.size(); i++) {
			Vector row = new Vector();
			ExpendInput si = expendManager.get(i);
			row.add(si.getBirth());
			row.add(si.getName());
			row.add(si.getEmail());
			row.add(si.getPhone());
			model.addRow(row);
		}
		
		JTable table = new JTable(model); 
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
