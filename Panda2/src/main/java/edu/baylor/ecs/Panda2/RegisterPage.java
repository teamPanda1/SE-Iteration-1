package edu.baylor.ecs.Panda2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RegisterPage extends JFrame{
	private JFrame frame = new JFrame("Register");
	private JPanel contentPanel;
	private JButton BackButton;
	private JButton ConfirmButton;
	HomePage homePage = new HomePage();
	
	public void CreateRegister() {
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5,5,5,5));
		contentPanel.setLayout(null);
		
		// 标题
		JLabel HomeLabel = new JLabel();
		HomeLabel.setText("Register");
		HomeLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 30));
		HomeLabel.setBounds(350,20,200,50);
		contentPanel.add(HomeLabel);
		
		// Last Name
		JLabel LastNameLabel = new JLabel();
		LastNameLabel.setText("Last Name*");
		LastNameLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		LastNameLabel.setBounds(20,100,200,30);
		contentPanel.add(LastNameLabel);
		
		JTextField LNField = new JTextField();
		LNField.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		LNField.setBounds(500,100,200,30);
		contentPanel.add(LNField);
		
		// First Name
		JLabel FirstNameLabel = new JLabel();
		FirstNameLabel.setText("First Name*");
		FirstNameLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		FirstNameLabel.setBounds(20,140,200,30);
		contentPanel.add(FirstNameLabel);
		
		JTextField FNField = new JTextField();
		FNField.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		FNField.setBounds(500,140,200,30);
		contentPanel.add(FNField);
		
		// Email
		JLabel EmailLabel = new JLabel();
		EmailLabel.setText("Email*");
		EmailLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		EmailLabel.setBounds(20,180,200,30);
		contentPanel.add(EmailLabel);
		
		JTextField EmailField = new JTextField();
		EmailField.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		EmailField.setBounds(500,180,200,30);
		contentPanel.add(EmailField);
		
		// Phone
		JLabel PhoneLabel = new JLabel();
		PhoneLabel.setText("Phone*");
		PhoneLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		PhoneLabel.setBounds(20,220,200,30);
		contentPanel.add(PhoneLabel);
		
		JTextField PhoneField = new JTextField();
		PhoneField.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		PhoneField.setBounds(500,220,200,30);
		contentPanel.add(PhoneField);
		
		// Set Password
		JLabel SetPasswordLabel = new JLabel();
		SetPasswordLabel.setText("Set Password*");
		SetPasswordLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		SetPasswordLabel.setBounds(20,260,200,30);
		contentPanel.add(SetPasswordLabel);
		
		JTextField SPField = new JTextField();
		SPField.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		SPField.setBounds(500,260,200,30);
		contentPanel.add(SPField);
		
		// Confirm Password
		JLabel ConfirmPasswordLabel = new JLabel();
		ConfirmPasswordLabel.setText("Confirm Password*");
		ConfirmPasswordLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		ConfirmPasswordLabel.setBounds(20,300,200,30);
		contentPanel.add(ConfirmPasswordLabel);
		
		JTextField CPField = new JTextField();
		CPField.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		CPField.setBounds(500,300,200,30);
		contentPanel.add(CPField);
		
		// Vim Number
		JLabel VimNumberLabel = new JLabel();
		VimNumberLabel.setText("Vim Number(If you puchsed before)");
		VimNumberLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		VimNumberLabel.setBounds(20,340,400,30);
		contentPanel.add(VimNumberLabel);
		
		JTextField VNField = new JTextField();
		VNField.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		VNField.setBounds(500,340,200,30);
		contentPanel.add(VNField);
		
		
		// Confirm Button
		ConfirmButton = new JButton("OK");
		ConfirmButton.setFont(new java.awt.Font("Leelawadee UI", 0, 15));
		ConfirmButton.setBounds(250,450,100,50);
		contentPanel.add(ConfirmButton);
		ConfirmButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				closeThis();
				homePage.CreateFrame();
			}
					
		});
				
		// Back Button
		BackButton = new JButton("Back");
		BackButton.setFont(new java.awt.Font("Leelawadee UI", 0, 15));
		BackButton.setBounds(400,450,100,50);
		contentPanel.add(BackButton);
		BackButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				closeThis();
				homePage.CreateFrame();
			}
							
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(800, 650);
		frame.setLocationRelativeTo(null);
		contentPanel.setBounds(0,0,800,650);
		frame.add(contentPanel);
		
	}
	
	public void closeThis() {
		frame.dispose();
	}

}
