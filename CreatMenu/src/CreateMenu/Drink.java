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

public class Drink extends DishInfo{
	public void setInfo(){
		/* ----Drinks info---- */
		dishName = new Vector();
		prices = new Vector();
		dishName.add("Cocacola");
		prices.add(8.0);
		
		dishName.add ("Pepsi");
		prices.add(8.0);
		
		dishName.add ("Tra da");
		prices.add(3.0);
		
		dishName.add("Sting");
		prices.add(10.0);
		
		dishName.add("Nutri food");
		prices.add(11.0);
		/*--------------------*/
	}
}
