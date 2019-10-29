package edu.baylor.ecs.Car;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Error extends JFrame implements ActionListener{
	

	private JButton okButton;
	private JLabel lbl;
	private JFrame frame;
	
	public static void main(String[] args) {
		Error error = new Error();
	}
	public Error() {
		
		frame= new JFrame();	
		lbl = new JLabel("Click the check box!!!!!!");
		lbl.setBounds(10, 100, 150,50);
		
		okButton = new JButton("OK");
		okButton.setBounds(50, 100, 80, 40);
		okButton.addActionListener(this);
		
		frame.add(okButton);
		frame.add(lbl);
		frame.setSize(200, 200);
		frame.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == okButton) {
			frame.dispose();
		}
	}
}
