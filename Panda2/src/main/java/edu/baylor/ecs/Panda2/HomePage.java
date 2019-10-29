package edu.baylor.ecs.Panda2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class HomePage extends JPanel implements ItemListener, ActionListener{
	private JFrame frame = new JFrame("PandaDealerShip");
	private JPanel contentPanel;
	private JPanel YourMayLike;
	private JPanel panel;
	private JComboBox Maker;
	private JComboBox Model;
	private JComboBox Year;
	private JComboBox PriceRange;
	private JButton LoginButton;
	private JButton RegisterButton;
	private JButton ProfileButton;
	private JButton MoreButton;
	private Map<Integer, Vector<String>> map = new HashMap<Integer, Vector<String>>();
	
	public void CreateFrame() {
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5,5,5,5));
		contentPanel.setLayout(null);
		
		// 转到login page
		LoginButton = new JButton("Login");
		LoginButton.setFont(new java.awt.Font("Leelawadee UI", 0, 15));
		LoginButton.setBounds(600,20,90,30);
		contentPanel.add(LoginButton);
		LoginButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				closeThis();
				LoginPage loginPage = new LoginPage();
				loginPage.CreateLogin();
			}
			
		});
		
		// 转到Register page
		RegisterButton = new JButton("Register");
		RegisterButton.setFont(new java.awt.Font("Leelawadee UI", 0, 15));
		RegisterButton.setBounds(680,20,90,30);
		contentPanel.add(RegisterButton);
		RegisterButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				closeThis();
				RegisterPage registerPage = new RegisterPage();
				registerPage.CreateRegister();
			}
					
		});
		
		// 转到profile
		ProfileButton = new JButton("Profile");
		ImageIcon img3 = new ImageIcon("profile.jpg");
		ProfileButton.setIcon(img3);
		ProfileButton.setBounds(620,60,130,81);
		contentPanel.add(ProfileButton);
		ProfileButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				closeThis();
				ProfileFrame profile = new ProfileFrame();
			}
					
		});
		
		// 标题1
		JLabel HomePageLabel1 = new JLabel();
		HomePageLabel1.setText("PandaDealerShip");
		HomePageLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 30));
		HomePageLabel1.setBounds(20,20,250,30);
		contentPanel.add(HomePageLabel1);
		
		// 标题2
		JLabel HomePageLabel2 = new JLabel();
		HomePageLabel2.setText("Best DealerShip in Waco");
		HomePageLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		HomePageLabel2.setBounds(280,23,250,30);
		contentPanel.add(HomePageLabel2);
		
		// 图片
		JLabel HomePagePhoto = new JLabel();
		ImageIcon imgHomePage = new ImageIcon("baylor.png");
		HomePagePhoto.setIcon(imgHomePage);
		HomePagePhoto.setBounds(20,50,500,100);
		contentPanel.add(HomePagePhoto);
		
		// 搜索栏标题
		JLabel FindCarLabel = new JLabel();
		FindCarLabel.setText("Find Your Car:");
		FindCarLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		FindCarLabel.setBounds(20,150,200,30);
		contentPanel.add(FindCarLabel);
	
		// Maker 搜索栏
		Vector<String> MakerItems = new Vector<String>();
		String[] Makerlist = new String[] {"Audi","BMW","Mercedes-Benz"};
		for (int i = 0; i < 3; i++) {
			MakerItems.add(Makerlist[i]);
		}
		Maker = new JComboBox(MakerItems);
		Maker.addItemListener(this);
		
		// Audi 搜索栏
		Vector<String> vector0 = new Vector<String>();
		String[] list0 = new String[] {"R8", "RS7", "RS5", "TTRS", "Q8"};
		for (int i = 0; i < 5; i++) {
			vector0.add(list0[i]);
		}
		map.put(0, vector0);
		
		// BMW 搜索栏
		Vector<String> vector1 = new Vector<String>();
		String[] list1 = new String[] {"i8", "M8", "M5", "X6M", "X5M"};
		for (int i = 0; i < 5; i++) {
			vector1.add(list1[i]);
		}
		map.put(1, vector1);
		
		// Benz 搜索栏
		Vector<String> vector2 = new Vector<String>();
		String[] list2 = new String[] {"AMG GT63", "AMG G63", "SLS AMG", "AMG C63", "G 550"};
		for (int i = 0; i < 5; i++) {
			vector2.add(list2[i]);
		}
		map.put(2, vector2);
		
		Model = new JComboBox(new DefaultComboBoxModel(map.get(0)));
		Model.addItemListener(this);
		
		String[] yearList = new String[] {"2019","2018","2017","2016","2015","2014","2013"};
		Year = new JComboBox<String>(yearList);
		
		String[] pricelist = new String[] {">100,000", ">90,000", ">80,000", ">70,000", ">60,000"};
		PriceRange = new JComboBox<String>(pricelist);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5,5,5,5));
		panel.setLayout(null);
		Maker.setBounds(20, 0, 80, 30);
		Model.setBounds(100, 0, 80, 30);
		Year.setBounds(180, 0, 100, 30);
		PriceRange.setBounds(280, 0, 120, 30);
		panel.add(Maker);
		panel.add(Model);
		panel.add(Year);
		panel.add(PriceRange);
		
		// you may also like 文字
		JLabel YMlike = new JLabel("Test");
		YMlike.setFont(new java.awt.Font("Leelawadee UI", 0, 30));
		YMlike.setText("You May Also Like:");
		YMlike.setBounds(20,0, 300, 30);
		
		// more Button
		MoreButton = new JButton("More Cars");
		MoreButton.setFont(new java.awt.Font("Leelawadee UI", 0, 15));
		MoreButton.setBounds(500,0,150,30);
		MoreButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				closeThis();
				try {
					CarListFrame carList = new CarListFrame();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		
		// 奥迪R8 图片
		JButton imgButton1 = new JButton();
		ImageIcon img1 = new ImageIcon("audiR8.jpeg");
		imgButton1.setIcon(img1);
		imgButton1.setBounds(40,30,300,150);
		imgButton1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				closeThis();
				CarInfo2 Info2 = new CarInfo2();
			}
			
		});
		// 奥迪R8 描述
		JLabel carTest1 = new JLabel("Test");
		carTest1.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		carTest1.setText("2019 Audi R8!");
		carTest1.setBounds(40,180,200,50);
		
		// 奔驰GT 图片
		JButton imgButton2 = new JButton();
		ImageIcon img2 = new ImageIcon("BenzGT63.jpg");
		imgButton2.setIcon(img2);
		imgButton2.setBounds(400,30,300,150);
		imgButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				closeThis();
				CarInfo1 Info1 = new CarInfo1();
			}
			
		});
		// 奔驰GT 描述
		JLabel carTest2 = new JLabel("Test");
		carTest2.setFont(new java.awt.Font("Leelawadee UI", 0, 20));
		carTest2.setText("Benz GT 63!");
		carTest2.setBounds(400,180,200,50);
		
		
		YourMayLike = new JPanel();
		YourMayLike.setBorder(new EmptyBorder(5,5,5,5));
		YourMayLike.setLayout(null);
		YourMayLike.add(YMlike);
		YourMayLike.add(imgButton1);
		YourMayLike.add(carTest1);
		YourMayLike.add(imgButton2);
		YourMayLike.add(carTest2);
		YourMayLike.add(MoreButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(800, 650);
		frame.setLocationRelativeTo(null);
		
		contentPanel.setBounds(0,0,800,200);
		//contentPanel.setBackground(Color.blue);
		
		panel.setBounds(0,200,800,50);
		//panel.setBackground(Color.green);
		
		YourMayLike.setBounds(0,250,800,400);
		//YourMayLike.setBackground(Color.yellow);
		
		frame.add(contentPanel);
		frame.add(panel);
		frame.add(YourMayLike);
		
		
	}

	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getStateChange() == ItemEvent.SELECTED) {
            if(e.getSource() == Maker) {
                int index = Maker.getSelectedIndex();
                Model.setModel(new DefaultComboBoxModel(map.get(index)));
            }
        }  
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("xixi)");
	}
	
	public void closeThis() {
		frame.dispose();
	}

}
