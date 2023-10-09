package com.BMS;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	JLabel text, cardNo, pin;
	
	JTextField cardField;
	
	JPasswordField pinField;
	
	JButton login, signUp, clear;

	public Login() {
		
		setLayout(null);
		
		setSize(800,450); // frame code
		
		setLocation(350,220);
		
		setVisible(true);
		
		setTitle("Automatic Teller Machine");
		
		text = new JLabel("Welcome To ATM"); // text related
		
		text.setBounds(250,10,300,100);
		
		text.setFont(new Font("osward",Font.BOLD,30));
		
		add(text);
		
		cardNo = new JLabel("card No:");
		
		cardNo.setFont(new Font("osward",Font.BOLD,20));
		
		cardNo.setBounds(190,110,150,30);
		
		add(cardNo);
		
		cardField = new JTextField(); // field related
		
		cardField.setBounds(280,110,150,30);
		
		cardField.setFont(new Font("osward",Font.BOLD,14));
		
		add(cardField);
		
		pin = new JLabel("Pin No:");
		
		pin.setFont(new Font("osward",Font.BOLD,20));
		
		pin.setBounds(190,170,200,30);
		
		add(pin);
		
		pinField = new JPasswordField();
		
		pinField.setBounds(280, 170, 150, 30);
		
		pinField.setFont(new Font("osward",Font.BOLD,14));
		
		add(pinField);
		
		login = new JButton("SIGN IN"); // button related
		
		login.setBounds(260,250,100,30);
		
		login.setBackground(Color.black);
		
		login.setForeground(Color.WHITE);
		
		login.addActionListener(this);
		
		add(login);
		
		clear = new JButton("CLEAR");
		
		clear.setBounds(380,250,100,30);
		
		clear.setBackground(Color.black);
		
		clear.setForeground(Color.WHITE);
		
		clear.addActionListener(this);
		
		add(clear);
		
		signUp = new JButton("SIGN UP");
		
		signUp.setBounds(260,300,230,30);
		
		signUp.setBackground(Color.black);
		
		signUp.setForeground(Color.WHITE);
		
		signUp.addActionListener(this);
		
		add(signUp);
		
		getContentPane().setBackground(Color.white);
		
	
	}

	public static void main(String[] args) {
		
		new Login();
	}
	@Override
	public void actionPerformed(ActionEvent e) { // event triggers
		
		if(e.getSource()==clear){
			
			cardField.setText("");
			
			pinField.setText("");
			
		} else if(e.getSource()==login) {
			
			Conn con = new Conn();
			
			String cardNum = cardField.getText();
			
			String pinNum = pinField.getText();
			
			String query = "SELECT * FROM login WHERE cardNumber = '"+cardNum+"' AND pinNumber ='"+pinNum+"'";
			
			try {
				
				ResultSet rs = con.s.executeQuery(query);
				
				if(rs.next()) {
					
					setVisible(false);
					
					new Transactions(pinNum).setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect card or pin");
				}
				
			}
			catch(Exception e1) {
				
				System.out.println(e1);
				
			}
			
			
			
		}else if(e.getSource()==signUp) {
			
			setVisible(false);
			
			new SignUpOne().setVisible(true);
		}
		
	}

}
