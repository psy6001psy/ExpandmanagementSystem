package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ExpendAdder extends JPanel {
	
	WindowFrame frame;
	
	public ExpendAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelBirth = new JLabel("Birth : ", JLabel.TRAILING);
		JTextField fieldBirth = new JTextField(10);
		labelBirth.setLabelFor(fieldBirth);
		panel.add(labelBirth);
		panel.add(fieldBirth);
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelBirth.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelEmail = new JLabel("Email : ", JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10);
		labelBirth.setLabelFor(fieldEmail);
		panel.add(labelEmail);
		panel.add(fieldEmail);
		
		JLabel labelPhone = new JLabel("Phone : ", JLabel.TRAILING);
		JTextField fieldPhone= new JTextField(10);
		labelBirth.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("Cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
		
	}
}
