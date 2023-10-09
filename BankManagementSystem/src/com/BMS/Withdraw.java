package com.BMS;

import java.awt.Color;

import java.util.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Withdraw extends JFrame implements ActionListener {
	
	
	private static final long serialVersionUID = 5L;
	
	JTextField amount;
	
	JButton withdraw, back;
	
	String pin;


	Withdraw(String pin){
		
		this.pin = pin;
	    setTitle("withdraw page");
	    setSize(900, 900);
	    setLocation(300, 0);
	    setLayout(null);
	 // Make the frame visible after adding components
	    setVisible(true);

	    // Create and configure the text label
	    JLabel text = new JLabel("Enter The Amount To Be withdraw");
	    text.setBounds(250, 100, 450, 30);
	    text.setFont(new Font("system", Font.BOLD, 18));
	    add(text);
	    
	    

	    // Create the amount text field
	    amount = new JTextField();
	    amount.setFont(new Font("osward", Font.BOLD, 18));
	    amount.setBounds(310, 160, 200, 30);
	    add(amount);
	    amount.requestFocus();
	    
	    withdraw = new JButton("Withdraw");
	    withdraw.setBounds(412, 200, 100, 30);
	    withdraw.setBackground(Color.black);
	    withdraw.setForeground(Color.WHITE);
	    withdraw.addActionListener(this);
	    add(withdraw);
	    withdraw.requestFocus();
	    
	    back = new JButton("Back");
	    back.setBounds(412, 250, 100, 30);
	    back.setBackground(Color.black);
	    back.setForeground(Color.WHITE);
	    back.addActionListener(this);
	    add(back);
	    back.requestFocus();
	    
	    

	    
	}
	

	public static void main(String[] args) {
		
		new Withdraw("");


	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==back) {
			
			setVisible(false);
			
			new Transactions(pin).setVisible(true);
			
			
		}
		else if(e.getSource()==withdraw) {
			
			String cash = amount.getText();
			
			Date date = new Date();
			
			if(cash.equals("")) {
				
				JOptionPane.showMessageDialog(null, "enter the money to withdraw");
			}
			else {
				
				try {
					
					String query = "INSERT INTO bank VALUES('"+pin+"','"+date+"','withdraw','"+cash+"')";
					
					Conn con = new Conn();
					
					con.s.executeUpdate(query);
					
					setVisible(false);
					
					new Transactions(pin).setVisible(true);
					
					JOptionPane.showMessageDialog(null, "Rs "+cash+" withdraw sucessfully");
						
				}
				catch (Exception e1) {
					System.out.println(e1);
				}
			}
		}
	}	
}