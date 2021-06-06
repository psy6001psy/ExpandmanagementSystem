package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.ExpendManager;

public class WindowFrame extends JFrame {
	
	ExpendManager expendManager;
	MenuSelection menuselection;
	ExpendAdder expendadder;
	ExpendViewer expendviewer;
	
	public WindowFrame(ExpendManager expendManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.expendManager = expendManager;
		menuselection = new MenuSelection(this);
		expendadder = new ExpendAdder(this);
		expendviewer = new ExpendViewer(this, this.expendManager);

		
		this.add(menuselection);
		
		this.setVisible(true);
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public ExpendAdder getExpendadder() {
		return expendadder;
	}

	public void setExpendadder(ExpendAdder expendadder) {
		this.expendadder = expendadder;
	}

	public ExpendViewer getExpendviewer() {
		return expendviewer;
	}

	public void setExpendviewer(ExpendViewer expendviewer) {
		this.expendviewer = expendviewer;
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

}
