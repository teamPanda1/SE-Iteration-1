package edu.baylor.ecs.Car;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarInfo2 extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton okButton;
	private JButton FavorButton;
	private JFrame frame = new JFrame("2019 Audi R8");
	private Car BenzCar = new Car("Audi", "R8", "2019", "Blue", "97000");
	private CarFavList FavList = new CarFavList();
	
	public CarInfo2() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(null);
		
		JLabel label = new JLabel();
		ImageIcon img = new ImageIcon("audi.jpg");
		label.setIcon(img);
		label.setBounds(100,25,600,340);
		contentPane.add(label);
		
		JLabel label1 = new JLabel("Test");
		label1.setText("The 2019 R8 spent plenty of time in Neckarsulm's gym, beefing up the 5.2-liter V10 to 562");
		label1.setBounds(100, 350, 600, 85);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Test");
		label2.setText("horsepower and 406 pound-feet of torque, gains of 30 hp and seven lb-ft over last year's ");
		label2.setBounds(100, 370, 600, 85);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("Test");
		label3.setText("model. With the R8 Performance, the improvements are smaller, with just nine hp and 15 lb-ft.");
		label3.setBounds(100, 390, 600, 85);
		contentPane.add(label3);
		
		
		okButton = new JButton("OK");
		okButton.setBounds(150, 500, 80, 40);
		contentPane.add(okButton);
		okButton.addActionListener((ActionListener) this);
		
		FavorButton = new JButton("Favor");
		FavorButton.setBounds(550, 500, 80, 40);
		contentPane.add(FavorButton);
		FavorButton.addActionListener((ActionListener) this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack(); 
		frame.setVisible(true);
		frame.setSize(800, 650);
		frame.add(contentPane);
		
		
		
	}
	public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == okButton) {
    		frame.dispose();
    		ProfileFrame frame2 = new ProfileFrame();
    		//frame2.setVisible(true);
    	}
    	else if(e.getSource() == FavorButton) {
    		//this.dispose();
    		FavList.store(BenzCar);
    	}
    }
	public static void main(String args[]) {
		CarInfo2 info2 = new CarInfo2();
		
	}
	
}
