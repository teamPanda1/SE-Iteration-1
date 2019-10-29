package edu.baylor.ecs.Panda2;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CarListFrame extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField textField;
	private JFrame frame = new JFrame("Car List"); 
	private String[] columnNames = {"Make", "Model", "Year",
			"Color", "Price"};
	private DefaultTableModel tblModel = new DefaultTableModel();
	private CarList myList;
	private Object[][] listData;
	private DefaultTableModel tableModel;
	private JTable table;
	private JButton backButton;
	private TableRowSorter<TableModel> rowSorter;
	private JButton addButton;
	private JButton payButton;
	private CarFavList FavList = new CarFavList();
	private Car car = new Car();
	

    /**
     * Launch the application.
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {
            @SuppressWarnings("unused")
			CarListFrame frame = new CarListFrame();
    }

    /**
     * Create the frame.
     * @throws FileNotFoundException 
     */
    public CarListFrame() throws FileNotFoundException {

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);

        JLabel label = new JLabel("Search :");
        label.setBounds(12, 12, 75, 18);
        
        
        textField = new JTextField();
        textField.setBounds(80, 7, 189, 28);
        contentPane.add(textField);
        textField.setColumns(10);
        label.setLabelFor(textField);
        contentPane.add(label);
        
        myList = new CarList();
        myList.readCSV("CarList1.csv");
        listData = myList.conver2Data();
        tableModel = new DefaultTableModel(listData,columnNames);
        table = new JTable(tableModel);
        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);
        textField.getDocument().addDocumentListener(new DocumentListener(){

            public void insertUpdate(DocumentEvent e) {
                String text = textField.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            public void removeUpdate(DocumentEvent e) {
                String text = textField.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
        
        
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(22, 42, 570, 400);
        contentPane.add(scrollPane);    
        
        backButton = new JButton("Back");
        backButton.setBounds(60, 455, 80, 40);
        contentPane.add(backButton);
        backButton.addActionListener(this);
        
        addButton = new JButton("Add");
        addButton.setBounds(260, 455, 80, 40);
        contentPane.add(addButton);
        addButton.addActionListener(this);
        
        payButton = new JButton("Pay");
        payButton.setBounds(460, 455, 80, 40);
        contentPane.add(payButton);
        payButton.addActionListener(this);
        
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(650, 570);
		frame.setLocationRelativeTo(null);
		frame.add(contentPane);
		 
    }

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backButton) {
    		frame.dispose();
    		HomePage homePage = new HomePage();
    		homePage.CreateFrame();
    		
    	}
		else if(e.getSource() == addButton) {
			
	        int row = table.getSelectedRow();
	        String value = table.getModel().getValueAt(row, 0).toString();
	        String value1 = table.getModel().getValueAt(row, 1).toString();
	        String value2 = table.getModel().getValueAt(row, 2).toString();
	        String value3 = table.getModel().getValueAt(row, 3).toString();
	        String value4 = table.getModel().getValueAt(row, 4).toString();
	        car = new Car(value,value1,value2,value3,value4);
			FavList.store(car); 
		}
		else if(e.getSource() == payButton) {
			/*
			int column = 0;
	        int row = table.getSelectedRow();
	        String value = table.getModel().getValueAt(row, column).toString();
	        */
	        frame.dispose();
	        MakePayment pay = new MakePayment();
	        //pay.setVisible(true);
		}
    }
    
    
    
}
