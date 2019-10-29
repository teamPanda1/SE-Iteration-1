package edu.baylor.ecs.Car;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class MakePayment extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame frame = new JFrame("Make a Payment");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton payButton;
	private JButton backButton;
	private String pic = "pay1.jpg";
	private PaymentInfo payment;
	private JCheckBox c1;


    public static void main(String[] args) {
    	MakePayment frame2 = new MakePayment();
    }
	public MakePayment() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(pic));
        lblNewLabel.setBounds(10, 10, 116, 133);
        contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Make Payment: ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 150, 750, 370);
		contentPane.add(panel);
		panel.setLayout(null);
	 
	    JLabel label = new JLabel("Car Names");
	    label.setBounds(20, 34, 105, 18);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Car Price");
		label_1.setBounds(20, 75, 105, 18);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Buyer's Names");
		label_2.setBounds(20, 116, 105, 18);
		panel.add(label_2);
		 
		JLabel label_3 = new JLabel("Credit Card");
		label_3.setBounds(20, 157, 105, 18);
		panel.add(label_3);
		 
		JLabel lblNewLabel_1 = new JLabel("Pick up Date");
		lblNewLabel_1.setBounds(20, 198, 105, 18);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField("xxxxx ");
		textField.setBounds(120, 34, 188, 28);
		panel.add(textField);
		textField.setColumns(10);
		 
		textField_1 = new JTextField("xx,000");
		textField_1.setBounds(120, 75, 188, 28);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField("xxx xxx");
		textField_2.setBounds(120, 116, 188, 23);
		panel.add(textField_2);
		textField_2.setColumns(10);
		 
		textField_3 = new JTextField("MM/DD/YYYY");
		textField_3.setBounds(120, 157, 188, 23);
		panel.add(textField_3);
		textField_3.setColumns(10);
		     
		textField_4 = new JTextField("xxxx xxxx xxxx xxxx");
		textField_4.setBounds(120, 198, 188, 23);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		backButton = new JButton("Back");
		backButton.setBounds(350, 525, 80, 40);
	    contentPane.add(backButton);
	    backButton.addActionListener(this);
	        
	    payButton = new JButton("Submit");
        payButton.setBounds(135, 525, 80, 40);
        contentPane.add(payButton);
        payButton.addActionListener(this);
			
        c1 = new JCheckBox("I have read and agree to the Terms");
        c1.setBounds(145, 565, 288, 23);
        contentPane.add(c1);
			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(800, 650);
		frame.add(panel);
		frame.add(contentPane);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == payButton) {
			if(c1.isSelected() == true) {
				frame.dispose();
				FinishPayment pay = new FinishPayment();
			}
			else {
				Error error = new Error();
			}
		}
		
	}
}
