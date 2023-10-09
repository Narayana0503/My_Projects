package com.BMS;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class Transactions extends JFrame implements ActionListener {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 7L;

	JButton deposit, withdrawl, fastCash, pinChange, miniStatement, balanceEnquiry, exit;
	
	String pin ;
	
    Transactions(String pin) {
    	this.pin = pin;
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
        setLayout(null);
        setTitle("Transactions");
        getContentPane().setBackground(Color.WHITE);

        JLabel text = new JLabel("Select Your Transaction");
        
        text.setBounds(280, 100, 300, 30);
        
        text.setFont(new Font("system", Font.BOLD,22));
        
        add(text);
        
        deposit = new JButton("Deposit");
        
        deposit.setBounds(200,200,150,30);
        
        deposit.setBackground(Color.black);
        
        deposit.setForeground(Color.WHITE);
        
        deposit.addActionListener(this);
        
        add(deposit);
        
        withdrawl = new JButton("Withdrawl");
        
        withdrawl.setBounds(500,200,150,30);
        
        withdrawl.setBackground(Color.black);
        
        withdrawl.setForeground(Color.WHITE);
        
        withdrawl.addActionListener(this);
        
        add(withdrawl);
        
        fastCash = new JButton("Fast Cash");
        
        fastCash.setBounds(200,250,150,30);
        
        fastCash.setBackground(Color.black);
        
        fastCash.setForeground(Color.WHITE);
        
        fastCash.addActionListener(this);
        
        add(fastCash);
        
        miniStatement = new JButton("Mini Statement");
        
        miniStatement.setBounds(500,250,150,30);
        
        miniStatement.setBackground(Color.black);
        
        miniStatement.setForeground(Color.WHITE);
        
        miniStatement.addActionListener(this);

        add(miniStatement);
        
        pinChange = new JButton("Pin Change");
        
        pinChange.setBounds(200,300,150,30);
        
        pinChange.setBackground(Color.black);
        
        pinChange.setForeground(Color.WHITE);
        
        pinChange.addActionListener(this);

        
        add(pinChange);
        
        balanceEnquiry = new JButton("Balance Enquiry");
        
        balanceEnquiry.setBounds(500,300,150,30);
        
        balanceEnquiry.setBackground(Color.black);
        
        balanceEnquiry.setForeground(Color.WHITE);
        
        balanceEnquiry.addActionListener(this);
        
        add(balanceEnquiry);
        
         exit = new JButton("Exit");
        
        exit.setBounds(350,350,150,30);
        
        exit.setBackground(Color.black);
        
        exit.setForeground(Color.WHITE);
        
        exit.addActionListener(this);
        
        add(exit);
        
        
    }

    public static void main(String[] args) {
        new Transactions("");
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==exit) {
			
			System.exit(0);
		} else if(e.getSource()==deposit) {
			
			setVisible(false);
			
			new Deposit(pin).setVisible(true);
		}
		  else if(e.getSource()==withdrawl) {
			
			setVisible(false);
			
			new Withdraw(pin).setVisible(true);
		}
		
		  else if(e.getSource()==fastCash) {
				
				setVisible(false);
				
				new FastCash(pin).setVisible(true);
			}
		
		  else if(e.getSource()==pinChange) {
				
				setVisible(false);
				
				new PinChange(pin).setVisible(true);
			}
		
		  else if(e.getSource()==balanceEnquiry) {
				
				setVisible(false);
				
				new BalanceEnquiry(pin).setVisible(true);
			}
		
		
	}
}
