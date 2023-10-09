package com.BMS;

	import java.awt.Color;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.sql.ResultSet;

	import javax.swing.*;

	public class BalanceEnquiry extends JFrame implements ActionListener{
		
		private static final long serialVersionUID = 8L;
		
		JButton back;

		String pin;

		public BalanceEnquiry(String pin) {
			
			this.pin = pin;

			int balance = 0;
				
			try {
				
				Conn con = new Conn();
				
				ResultSet rs = con.s.executeQuery("SELECT * FROM bank WHERE Pin = '"+pin+"'");
				
				while(rs.next()) {
					
					if(rs.getString("Type").equals("Deposit")) {
						
						balance += Integer.parseInt(rs.getString("Amount"));
					}
					
					else {
						
						balance -= Integer.parseInt(rs.getString("Amount"));
					}
				}
				
			} catch (Exception e1) {
				
				System.out.println(e1);
			}
			
			setVisible(true);
			
			setLayout(null);
			
			setLocation(300,0);
			
			setSize(900,900);
			
			getContentPane().setBackground(Color.WHITE);
			
			back = new JButton("back");
			
			back.setBounds(450,250,100,30);
			
			back.setBackground(Color.black);
			
			back.setForeground(Color.WHITE);
			
			back.addActionListener(this);
			
			back.requestFocus();
			
			add(back);
			
			JLabel text = new JLabel("Your Balance Is: "+balance);
			
			text.setBounds(100,200,200,30);
			
			text.setFont(new Font("system",Font.BOLD,18));
			
			add(text);
				
		}

		public static void main(String[] args) {
			
			new BalanceEnquiry("");


		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			setVisible(false);
			
			new Transactions(pin).setVisible(true);
			
			
		}

	}


