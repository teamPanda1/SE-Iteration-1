package edu.baylor.ecs.Panda2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginPage extends JFrame{
	private JFrame frame = new JFrame("Login");
	private JPanel contentPanel;
	private JButton BackButton;
	private JButton ConfirmButton;
	HomePage homePage = new HomePage();
	
	public void CreateLogin() {
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5,5,5,5));
		contentPanel.setLayout(null);
		
		// 标题
		JLabel HomeLabel = new JLabel();
		HomeLabel.setText("Login");
		HomeLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 30));
		HomeLabel.setBounds(350,20,200,50);
		contentPanel.add(HomeLabel);
		
		// Email
		JLabel EmailLabel = new JLabel();
		EmailLabel.setText("Email");
		EmailLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		EmailLabel.setBounds(200,300,200,30);
		contentPanel.add(EmailLabel);
		
		JTextField EmailField = new JTextField();
		EmailField.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		EmailField.setBounds(400,300,200,30);
		contentPanel.add(EmailField);

		// Password
		JLabel PasswordLabel = new JLabel();
		PasswordLabel.setText("PassWord");
		PasswordLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		PasswordLabel.setBounds(200,350,200,30);
		contentPanel.add(PasswordLabel);
				
		JTextField PasswordlField = new JTextField();
		PasswordlField.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		PasswordlField.setBounds(400,350,200,30);
		contentPanel.add(PasswordlField);	
		
		// Confirm Button
		ConfirmButton = new JButton("OK");
		ConfirmButton.setFont(new java.awt.Font("Leelawadee UI", 0, 15));
		ConfirmButton.setBounds(250,450,100,50);
		contentPanel.add(ConfirmButton);
		ConfirmButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				closeThis();
				//HomePage homePage = new HomePage();
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
				//HomePage homePage = new HomePage();
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
