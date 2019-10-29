package edu.baylor.ecs.Car;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FinishPayment extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame = new JFrame("Your payment is successful!!!");
	private JLabel lbl;
	private JButton backButton;
	private JLabel lbl1;
	private JPanel contentPane;
	private JButton okButton;
	public static void main(String[] args) {
		FinishPayment frame2 = new FinishPayment();
    }

	
	public FinishPayment() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(null);
		okButton = new JButton("OK");
        okButton.setBounds(350, 525, 80, 40);
        contentPane.add(okButton);
        okButton.addActionListener(this);
        
        lbl1 = new JLabel("Your payment has been successfully processed. Thank you!");
        lbl1.setBounds(200,300,400,200);
        contentPane.add(lbl1);
        
        JLabel label = new JLabel();
		ImageIcon img = new ImageIcon("CCar.jpg");
		label.setIcon(img);
		label.setBounds(100,30,564,299);
		contentPane.add(label);
		
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 650);
        //frame.add(panel);
        frame.add(contentPane); 
        

	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == okButton) {
			frame.dispose();
		}
		
	}
	
}
