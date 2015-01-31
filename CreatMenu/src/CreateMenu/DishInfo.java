package CreateMenu;

import java.awt.Desktop.Action;
import java.awt.EventQueue;

import javax.swing.AbstractAction;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

public class DishInfo {
	JFrame frame;
	protected Vector <String> dishName;
	protected JCheckBox[] check;
	protected Vector prices ;
	protected double money = 0;
	protected JLabel lblMoney;
	/**
	 * Create the application.
	 */
	public DishInfo() {
		setInfo();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	protected void setInfo(){
		/* ----Dishes info---- */
		
		/*--------------------*/
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFood = new JLabel("Food Table");
		lblFood.setHorizontalAlignment(SwingConstants.CENTER);
		lblFood.setFont(new Font("Arial", Font.PLAIN, 25));
		lblFood.setBounds(148, 0, 127, 40);
		frame.getContentPane().add(lblFood);
		
		JLabel lblNameCol = new JLabel("Food Name");
		lblNameCol.setFont(new Font("Arial", Font.BOLD, 13));
		lblNameCol.setBounds(10, 20, 100, 40);
		frame.add(lblNameCol);
		
		JLabel lblPricesCol = new JLabel("Prices");
		lblPricesCol.setFont(new Font("Arial", Font.BOLD, 13));
		lblPricesCol.setBounds(225, 20, 100, 40);
		frame.add(lblPricesCol);
		
		JLabel lblOrderCol = new JLabel("Order");
		lblOrderCol.setFont(new Font("Arial", Font.BOLD, 13));
		lblOrderCol.setBounds(325, 20, 100, 40);
		frame.add(lblOrderCol);
		
		JLabel lblTotal = new JLabel("Total: ");
		lblTotal.setBounds(10, 50 + 18 * dishName.size() + 10, 300, 15);
		lblTotal.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(lblTotal);
		
		lblMoney = new JLabel(String.valueOf(money) + "k");
		lblMoney.setBounds(225, 50 + 18 * dishName.size() + 10, 75, 15);
		lblMoney.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(lblMoney);
	
		JButton button = new JButton("Confirm");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Confirm window = new Confirm();
				window.frame.setVisible(true);
			}
		});
		button.setBounds(325, 50 + 18 * dishName.size() + 10, 89, 23);
		frame.getContentPane().add(button);
		
		check = new JCheckBox [dishName.size()];
		for (int i = 0; i < dishName.size(); i++){
			JLabel lblName = new JLabel(dishName.get(i));
			lblName.setBounds(10, 50 + 18 *i, 300, 15);
			lblName.setFont(new Font("Arial", Font.ITALIC, 12));
			frame.getContentPane().add(lblName);
			
			JLabel lblPrices = new JLabel(String.valueOf(prices.get(i)) + "k");
			lblPrices.setBounds(225, 50 + 18 * i, 100, 25);
			lblPrices.setFont(new Font("Arial", Font.ITALIC, 12));
			frame.getContentPane().add(lblPrices);
			
			check[i] = new JCheckBox("");
			check[i].setBounds(325, 50 + 18 * i, 70, 23);
			check[i].addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Object c = (Object)e.getSource();
					for(int j = 0; j <dishName.size(); j++)
						if (c == check[j])
							if(check[j].isSelected()){
								money = money + (double)prices.get(j);
								lblMoney.setText(String.valueOf(money)+"k");
							}else{
								money = money - (double)prices.get(j);
								lblMoney.setText(String.valueOf(money)+"k");
							}
						}
				
			});
			frame.getContentPane().add(check[i]);
			
		}	
		
	}
}
