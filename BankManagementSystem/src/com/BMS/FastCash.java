package com.BMS;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.sql.*;
import java.util.Date;

import javax.swing.*;

public class FastCash extends JFrame implements ActionListener {
    

	private static final long serialVersionUID = 6L;

	JButton hundred, fiveHundred, thousand, fiveThousand, tenThousand, twentyThousand, back;
	
	String pin ;
	
	FastCash(String pin) {
    	this.pin = pin;
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
        setLayout(null);
        setTitle("FastCash page");
        getContentPane().setBackground(Color.WHITE);

        JLabel text = new JLabel("Select Your Withdrawl");
        
        text.setBounds(280, 100, 300, 30);
        
        text.setFont(new Font("system", Font.BOLD,22));
        
        add(text);
        
        hundred = new JButton("Rs 100");
        
        hundred.setBounds(200,200,150,30);
        
        hundred.setBackground(Color.black);
        
        hundred.setForeground(Color.WHITE);
        
        hundred.addActionListener(this);
        
        add(hundred);
        
        fiveHundred = new JButton("Rs 500");
        
        fiveHundred.setBounds(500,200,150,30);
        
        fiveHundred.setBackground(Color.black);
        
        fiveHundred.setForeground(Color.WHITE);
        
        fiveHundred.addActionListener(this);
        
        fiveHundred.requestFocus();
        
        add(fiveHundred);

        
        thousand = new JButton("Rs 1000");
        
        thousand.setBounds(200,250,150,30);
        
        thousand.setBackground(Color.black);
        
        thousand.setForeground(Color.WHITE);
        
        thousand.addActionListener(this);
        
        add(thousand);
        
        thousand.requestFocus();
        
        fiveThousand = new JButton("Rs 5000");
        
        fiveThousand.setBounds(500,250,150,30);
        
        fiveThousand.setBackground(Color.black);
        
        fiveThousand.setForeground(Color.WHITE);
        
        fiveThousand.addActionListener(this);

        add(fiveThousand);
        
        fiveThousand.requestFocus();
        
        tenThousand = new JButton("Rs 10000");
        
        tenThousand.setBounds(200,300,150,30);
        
        tenThousand.setBackground(Color.black);
        
        tenThousand.setForeground(Color.WHITE);
        
        tenThousand.addActionListener(this);

        add(tenThousand);
        
        tenThousand.requestFocus();
        
        twentyThousand = new JButton("Rs 20000");
        
        twentyThousand.setBounds(500,300,150,30);
        
        twentyThousand.setBackground(Color.black);
        
        twentyThousand.setForeground(Color.WHITE);
        
        twentyThousand.addActionListener(this);
        
        add(twentyThousand);
        
        twentyThousand.requestFocus();
        
        back = new JButton("Back");
        
        back.setBounds(350,350,150,30);
        
        back.setBackground(Color.black);
        
        back.setForeground(Color.WHITE);
        
        back.addActionListener(this);
        
        add(back);
        
        back.requestFocus();
        
        
    }

    public static void main(String[] args) {
        new FastCash("");
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==back) {
			
			setVisible(false);
			
			new Transactions(pin).setVisible(true);
			
		} else {
			
			String cash = ((JButton)e.getSource()).getText().substring(3);
			
			try {
				
				Conn con = new Conn();
				
				ResultSet rs = con.s.executeQuery("SELECT * FROM bank WHERE Pin = '"+pin+"'");
				
				int balance = 0;
				
				while(rs.next()) {
					
					if(rs.getString("Type").equals("Deposit")) {
						
						balance += Integer.parseInt(rs.getString("Amount"));
					}
					
					else {
						
						balance -= Integer.parseInt(rs.getString("Amount"));
					}
				}
				
				if(e.getSource()!=back && balance < Integer.parseInt(cash)) {
					
					JOptionPane.showMessageDialog(null, "Insufficient Balance");
					
					return;
				}
				
				Date date = new Date();
				
				String query = "INSERT INTO bank VALUES ('"+pin+"','"+date+"','withdrawl','"+cash+"')";
				
				con.s.executeUpdate(query);
				
				JOptionPane.showMessageDialog(null, "Rs "+cash+" withdrawl sucessfully");
				
				setVisible(false);
				
				new Transactions(pin).setVisible(true);
				
			}
			catch(Exception e1) {

			System.out.println(e1);
			}
		}
	}
}