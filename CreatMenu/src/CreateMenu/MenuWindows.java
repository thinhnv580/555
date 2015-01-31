package CreateMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuWindows {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuWindows window = new MenuWindows();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuWindows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Ordering dish menu");
		frame.setBounds(100, 100, 450, 202);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(68, 11, 283, 31);
		frame.getContentPane().add(lblMenu);
		
		JButton btnNewButton = new JButton("Food");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Food window = new Food();
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 53, 402, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDrink = new JButton("Drink");
		btnDrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink window = new Drink();
				window.frame.setVisible(true);
			}
		});
		btnDrink.setBounds(10, 99, 402, 35);
		frame.getContentPane().add(btnDrink);
	}
}
