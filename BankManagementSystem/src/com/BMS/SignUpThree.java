package com.BMS;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;

public class SignUpThree extends JFrame implements ActionListener{

    private static final long serialVersionUID = 3L;

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;

	String formNo;

    SignUpThree(String formNo) {
    	
    	this.formNo = formNo;
        setTitle("Account Details Page 3");
        setSize(850, 820);
        setLocation(350, 10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Added close operation
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel page = new JLabel("Page 3: Account Details");
        page.setFont(new Font("Railway", Font.BOLD, 22));
        page.setBounds(300, 40, 350, 40);
        add(page);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Railway", Font.BOLD, 24));
        type.setBounds(100, 150, 350, 30);
        add(type);

        r1 = new JRadioButton("Savings Account");
        r1.setBounds(140, 200, 200, 30);
        r1.setBackground(Color.WHITE);
        r1.setFont(new Font("Railway", Font.PLAIN, 16));
        add(r1);

        r2 = new JRadioButton("Current Account");
        r2.setBounds(140, 250, 200, 30);
        r2.setBackground(Color.WHITE);
        r2.setFont(new Font("Railway", Font.PLAIN, 16));
        add(r2);

        r3 = new JRadioButton("Fixed Account");
        r3.setBounds(350, 200, 200, 30);
        r3.setBackground(Color.WHITE);
        r3.setFont(new Font("Railway", Font.PLAIN, 16));
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBounds(350, 250, 300, 30);
        r4.setBackground(Color.WHITE);
        r4.setFont(new Font("Railway", Font.PLAIN, 16));
        add(r4);

        ButtonGroup acc = new ButtonGroup();
        acc.add(r1);
        acc.add(r2);
        acc.add(r3);
        acc.add(r4);

        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Railway", Font.BOLD, 22));
        card.setBounds(100, 310, 250, 40);
        add(card);

        JLabel detail = new JLabel("Your 16 Digit Card Number");
        detail.setFont(new Font("Railway", Font.PLAIN, 10));
        detail.setBounds(110, 330, 250, 40);
        add(detail);

        JLabel cNum = new JLabel("XXXX-XXXX-XXXX-XXXX");
        cNum.setFont(new Font("Railway", Font.BOLD, 22));
        cNum.setBounds(350, 310, 290, 40);
        add(cNum);

        JLabel pin = new JLabel("Pin Number:");
        pin.setFont(new Font("Railway", Font.BOLD, 22));
        pin.setBounds(100, 370, 250, 40);
        add(pin);

        JLabel Pdetail = new JLabel("Your 4 Digit Pin Number");
        Pdetail.setFont(new Font("Railway", Font.PLAIN, 10));
        Pdetail.setBounds(110, 390, 250, 40);
        add(Pdetail);

        JLabel pNum = new JLabel("XXXX");
        pNum.setFont(new Font("Railway", Font.BOLD, 22));
        pNum.setBounds(350, 370, 100, 40);
        add(pNum);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Railway", Font.BOLD, 22));
        services.setBounds(100, 440, 250, 40);
        add(services);

        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Railway", Font.BOLD, 18));
        c1.setBounds(100, 480, 150, 40);
        c1.setBackground(Color.WHITE);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Railway", Font.BOLD, 18));
        c2.setBounds(300, 480, 250, 40);
        c2.setBackground(Color.WHITE);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Railway", Font.BOLD, 18));
        c3.setBounds(100, 530, 200, 40);
        c3.setBackground(Color.WHITE);
        add(c3);
        
        c4 = new JCheckBox("EMAIL & SMS Services");
        c4.setFont(new Font("Railway", Font.BOLD, 18));
        c4.setBounds(300, 530, 300, 40);
        c4.setBackground(Color.WHITE);
        add(c4);
        
        c5 = new JCheckBox("Check Book");
        c5.setFont(new Font("Railway", Font.BOLD, 18));
        c5.setBounds(100, 580, 200, 40);
        c5.setBackground(Color.WHITE);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Railway", Font.BOLD, 18));
        c6.setBounds(300, 580, 300, 40);
        c6.setBackground(Color.WHITE);
        add(c6);
        
        c7 = new JCheckBox("I hear by declare that above details are correct to the best of my knowledge ");
        c7.setFont(new Font("Railway", Font.BOLD, 16));
        c7.setBounds(120, 630, 700, 40);
        c7.setBackground(Color.WHITE);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setBounds(250,700,80,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setBounds(400,700,80,30);
        cancel.addActionListener(this);
        add(cancel);

        setVisible(true);
    }

    public static void main(String[] args) {
     
            new SignUpThree("");
        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==submit) {
			
			String accountType =null;
			
			if(r1.isSelected()) {
				accountType = "Savings Account";
			}
			else if(r2.isSelected()) {
				accountType = "Current Account";
			}
			else if(r3.isSelected()) {
				accountType = "Fixed Account";
			}
			else if(r4.isSelected()) {
				accountType = "Recurring  Account";
			}
			
			Random random = new Random();
			
			String  cardNum = ""+Math.abs((random.nextLong() % 90000000L) +5040936000000000L); 
			
			int random4DigitNumber = random.nextInt(9000) + 1000;
			if (random4DigitNumber < 1000) {
			    random4DigitNumber += 1000;
			}
			String  pinNum = String.valueOf(random4DigitNumber);
			
			String facility ="";
			
			if(c1.isSelected()) {
				
				facility += "ATM Card";
			}
			if (c2.isSelected()){
				facility += ", Internet Banking";
			}
			if (c3.isSelected()){
				facility += ", Mobile Banking";
			}
			if (c4.isSelected()){
				facility += ", EMAIL & SMS Services";
			}
			if (c5.isSelected()){
				facility += ", Check Book";
			}
			if (c6.isSelected()){
				facility += ", E-Statement";
			}
			try {
				if(accountType.equals("")) {
					JOptionPane.showMessageDialog(null, "Acoount type is required");
				}
				else {
				    Conn  con = new Conn();
				    String query1 = "INSERT INTO signupthree VALUES('"+formNo+"','"+accountType+"','"+cardNum+"','"+pinNum+"','"+facility+"')";
				    con.s.executeUpdate(query1);
				    String query2 = "INSERT INTO login VALUES('"+formNo+"','"+cardNum+"','"+pinNum+"')";
				    con.s.executeUpdate(query2);
				    
				    JOptionPane.showMessageDialog(null, "card number: "+cardNum+" \n pin Number: "+pinNum);
				    
				    setVisible(false);
				    
				    new Deposit(pinNum).setVisible(true);
				}
				
			}
			catch(Exception e1){
				System.out.println(e1);
			}
		
		}
		
		else if(e.getSource()==cancel) {
			
			setVisible(false);
			
			new Login().setVisible(true);
			
		}
		
	}
}

 