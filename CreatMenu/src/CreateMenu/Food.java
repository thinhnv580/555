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

public class Food extends DishInfo{
	public void setInfo(){
		/* ----Food info---- */
		dishName = new Vector();
		prices = new Vector();
		dishName.add("Lau vit");
		prices.add(15.0);
		
		dishName.add ("Lau ga");
		prices.add(15.5);
		
		dishName.add ("Lau bo");
		prices.add(20.3);
		
		dishName.add("Vit Quay");
		prices.add(10.0);
		
		dishName.add("Ga Tan");
		prices.add(25.0);
		/*--------------------*/
	}
}
