package edu.baylor.ecs.Panda2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ProfileFrame extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTable table;
    private JButton okButton;
	private JTextField textField_3;
	//private String pic = "pic.jpg";
	private JButton uploadButton;
	private JFrame frame = new JFrame("Personal Infomation");
	private JButton payButton;
	private CarFavList FavList = new CarFavList();
	private Object[][] listData;
	private String[] columnNames = {"Make", "Model", "Year",
			"Color", "Price"};
	private DefaultTableModel tableModel;
	private PersonList person;
	private JMenuBar menuBar;
	private JMenuItem menuItem1;
	private JButton deleteButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
          	ProfileFrame frame2 = new ProfileFrame();
    }

    /**
     * Create the frame.
     */
    
    public ProfileFrame() {
    	
        contentPane = new JPanel(); 
        contentPane.setLayout(null);
        JLabel lblNewLabel = new JLabel(new ImageIcon("pic.jpg"));
        lblNewLabel.setBounds(10, 10, 116, 133);
        contentPane.add(lblNewLabel);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Infomation: ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(10, 150, 750, 370);
        contentPane.add(panel);
        panel.setLayout(null);
        

        JLabel label = new JLabel("Name");
        label.setBounds(20, 34, 55, 18);
        panel.add(label);

        JLabel label_1 = new JLabel("Phone");
        label_1.setBounds(20, 75, 55, 18);
        panel.add(label_1);

        JLabel label_2 = new JLabel("Email");
        label_2.setBounds(20, 116, 55, 18);
        panel.add(label_2);
        
        JLabel label_3 = new JLabel("Licenses");
        label_3.setBounds(20, 157, 55, 18);
        panel.add(label_3);
        
        JLabel lblNewLabel_1 = new JLabel("Favorite Car");
        lblNewLabel_1.setBounds(20, 198, 85, 18);
        panel.add(lblNewLabel_1);

        textField = new JTextField("xxxxx");
        textField.setBounds(82, 34, 148, 28);
        panel.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField("254-xxx-xxxx");
        textField_1.setBounds(82, 75, 148, 28);
        panel.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField("xxx@xx.xxx");
        textField_2.setBounds(82, 116, 148, 23);
        panel.add(textField_2);
        textField_2.setColumns(10);
        
        textField_3 = new JTextField("xxxxxxxxxxx");
        textField_3.setBounds(82, 157, 148, 23);
        panel.add(textField_3);
        textField_3.setColumns(10);
        
        FavList = new CarFavList();
        listData = FavList.conver2Data();
        tableModel = new DefaultTableModel(listData,columnNames);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(120, 210, 405, 108);
        
        panel.add(scrollPane);
        table = new JTable();
        scrollPane.setViewportView(table);
        
        okButton = new JButton("OK");
        okButton.setBounds(650, 525, 80, 40);
        contentPane.add(okButton);
        okButton.addActionListener(this);
        
        deleteButton = new JButton("Delete");
        deleteButton.setBounds(350, 525, 80, 40);
        contentPane.add(deleteButton);
        deleteButton.addActionListener(this);
        
        uploadButton = new JButton("Upload");
        uploadButton.setBounds(135, 100, 80, 40);
        contentPane.add(uploadButton);
        uploadButton.addActionListener(this);
        contentPane.setVisible(true);
        
        payButton = new JButton("Pay");
        payButton.setBounds(50, 525, 80, 40);
        contentPane.add(payButton);
        payButton.addActionListener(this);
        
        menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        menuBar.add(menu);

        menuItem1 = new JMenuItem("Save");
        menuItem1.addActionListener(this);
        menu.add(menuItem1);
        
        frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 650);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.add(contentPane); 
        
    }
   
	public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == okButton) {
    		frame.dispose();
    		HomePage homePage = new HomePage();
    		homePage.CreateFrame();
    	}
    	else if (e.getSource() == uploadButton) {
    		
    	}
    	else if (e.getSource() == payButton) {
    		frame.dispose();
    		MakePayment payInfo = new MakePayment();
    	}
    }
}
