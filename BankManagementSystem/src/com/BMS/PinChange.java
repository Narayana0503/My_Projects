package com.BMS;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PinChange extends JFrame implements ActionListener {
	
	JPasswordField rePinField, pinField;
	
	JButton change, back;
	
	String pin;
	
	PinChange(String pin){
		
		this.pin = pin;
		
		setLayout(null);
		
		setVisible(true);
		
		setLocation(350,0);
		
		setSize(900,900);
		
		setTitle("pin change");
		
		getContentPane().setBackground(Color.white);
		
		JLabel text = new JLabel("Change Your Pin");
		
		text.setBounds(310,100,300,30);
		
		text.setFont(new Font("railway", Font.BOLD,22));
		
		add(text);
		
		JLabel pinText = new JLabel("Enter New Pin:");
		
		pinText.setBounds(100,200,200,30);
		
		pinText.setFont(new Font("railway", Font.BOLD,16));
		
		add(pinText);
		
		JLabel rePinText = new JLabel("Re-Enter New Pin:");
		
		rePinText.setBounds(100,250,200,30);
		
		rePinText.setFont(new Font("railway", Font.BOLD,16));
		
		add(rePinText);
		
		pinField = new JPasswordField();
		
		pinField.setBounds(250,200,180,30);
		
		pinField.setFont(new Font("railway", Font.BOLD,16));
		
		add(pinField);
		
		pinField.requestFocus();
		
		rePinField = new JPasswordField();
		
		rePinField.setBounds(250,250,180,30);
		
		rePinField.setFont(new Font("railway", Font.BOLD,16));
		
		add(rePinField);
		
		rePinField.requestFocus();
		
		change = new JButton("change");
		
		change.setBounds(325,300,100,30);
		
		change.setBackground(Color.BLACK);
		
		change.setForeground(Color.WHITE);
		
		change.addActionListener(this);
		
		add(change);
		
		change.requestFocus();
		
		back = new JButton("Back");
		
		back.setBounds(325,350,100,30);
		
		back.setBackground(Color.BLACK);
		
		back.setForeground(Color.WHITE);
		
		back.addActionListener(this);
		
		add(back);
		
		back.requestFocus();
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		new PinChange("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==change) {
			
			try {
				
				String p1 = pinField.getText();
				
				String p2 = rePinField.getText();
				
				if(!p1.equals(p2)) {
					
					JOptionPane.showMessageDialog(null, "Pin doesn't match re enter properly");
					
					return;
				}
				
				if(p1.equals("")) {
					
					JOptionPane.showMessageDialog(null, "Enter pin properly");
					
					return;
				}
				
				if(p2.equals("")) {
					
					JOptionPane.showMessageDialog(null, "Re Enter new pin properly");
					
					return;
				}
				
				Conn con = new Conn();
				
				String query1 = "UPDATE login SET pinNumber = '"+p2+"' WHERE pinNumber = '"+pin+"'";
				
				String query2 = "UPDATE bank SET Pin = '"+p2+"' WHERE Pin = '"+pin+"'";
				
				String query3 = "UPDATE signupthree SET PinNumber = '"+p2+"' WHERE PinNumber = '"+pin+"'";
				
				con.s.executeUpdate(query1);
				
				con.s.executeUpdate(query2);
				
				con.s.executeUpdate(query3);
				
				JOptionPane.showMessageDialog(null, "Pin change sucessfully");
				
				setVisible(false);
				
				new Transactions(pin).setVisible(true);
				
			}
			
			catch(Exception e1) {
				
				System.out.println(e1);
				
			}
			
		}
		
		else if(e.getSource()== back) {
			
			setVisible(false);
			
			new Transactions(pin).setVisible(true);
			
			
		}
		
	}

}
