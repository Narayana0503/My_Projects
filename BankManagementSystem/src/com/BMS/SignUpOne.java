package com.BMS;

import java.awt.Color;

import java.awt.event.*;

import java.awt.Font;

import javax.swing.*;

import java.util.*;

public class SignUpOne extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 2L;
	
	long random;
	
	JTextField nameField, fnameField, dc, emailField,addField, cityField, pincodeField, stateField;
	
	JRadioButton male, fmale, other, married, single;
	
	JButton next;

	public SignUpOne() {
		
		setLayout(null);
		
		setVisible(true);
		
		setSize(850,800);
		
		setLocation(350,10);
		
		Random ran = new Random();
		
		random = Math.abs(ran.nextLong() % 9000L - 1000L);
		
		JLabel appNo = new JLabel("Application No: "+random);
		
		appNo.setBounds(250,20,400,40);
		
		appNo.setFont(new Font("osward",Font.BOLD,40));
		
		add(appNo);
		
		JLabel presonalDetails = new JLabel("Page 1: Personal Details");
		
		presonalDetails.setBounds(300,75,400,30);
		
		presonalDetails.setFont(new Font("osward",Font.BOLD,22));
		
		add(presonalDetails);
		
		JLabel name = new JLabel("Name: ");
		
		name.setBounds(50,150,100,30);
		
		name.setFont(new Font("osward",Font.BOLD,18));
		
		add(name);
		
		nameField = new JTextField();
		
		nameField.setBounds(250,150,350,30);
		
		nameField.setFont(new Font("osward",Font.BOLD,18));
		
		add(nameField);
		
		fnameField = new JTextField();
		
		fnameField.setBounds(250,200,350,30);
		
		fnameField.setFont(new Font("osward",Font.BOLD,18));
		
		add(fnameField);
		
		
		JLabel fname = new JLabel("Father's Name: ");
		
		fname.setBounds(50,200,200,30);
		
		fname.setFont(new Font("osward",Font.BOLD,18));
		
		add(fname);
		
		JLabel dob = new JLabel("DOB: ");
		
		dob.setBounds(50,250,200,30);
		
		dob.setFont(new Font("osward",Font.BOLD,18));
		
		add(dob);
		
		dc = new JTextField();
		
		dc.setBounds(250,250,150,30);
		
		add(dc);
		
		JLabel gender = new JLabel("gender: ");
		
		gender.setBounds(50,300,200,30);
		
		gender.setFont(new Font("osward",Font.BOLD,18));
		
		add(gender);
		
		male = new JRadioButton("Male");
		
		male.setBounds(250,300,100,30);
		
		male.setBackground(Color.WHITE);
		
		add(male);
		
		fmale = new JRadioButton("Female");
		
		fmale.setBounds(400,300,100,30);
		
		fmale.setBackground(Color.WHITE);
		
		add(fmale);
		
		ButtonGroup genderGroup = new ButtonGroup();
		
		genderGroup.add(fmale);
	
		genderGroup.add(male);
		
		JLabel email = new JLabel("Email: ");
		
		email.setBounds(50,350,200,30);
		
		email.setFont(new Font("osward",Font.BOLD,18));
		
		add(email);
		
	    emailField = new JTextField();
		
		emailField.setBounds(250,350,350,30);
		
		emailField.setFont(new Font("osward",Font.BOLD,18));
		
		add(emailField);
		
		JLabel maritalStatus = new JLabel("Marital Status: ");
		
		maritalStatus.setBounds(50,400,200,30);
		
		maritalStatus.setFont(new Font("osward",Font.BOLD,18));
		
		add(maritalStatus);
		
		married = new JRadioButton("Married");
		
		married.setBounds(250,400,100,30);
		
		married.setBackground(Color.white);
		
		add(married);
		
	    single = new JRadioButton("Single");
		
		single.setBounds(400,400,100,30);
		
		single.setBackground(Color.white);
		
		add(single);
		
		other = new JRadioButton("other");
		
		other.setBounds(550,400,100,30);
		
		other.setBackground(Color.white);
		
		add(other);
		
		
		ButtonGroup maritalStatus1 = new ButtonGroup();
		
		maritalStatus1.add(married);
		
		maritalStatus1.add(single);
		
		maritalStatus1.add(other);
		
		JLabel addres = new JLabel("Addres: ");
		
		addres.setBounds(50,450,200,30);
		
		addres.setFont(new Font("osward",Font.BOLD,18));
		
		add(addres);
		
		addField = new JTextField();
		
		addField.setBounds(250,450,350,30);
		
		addField.setFont(new Font("osward",Font.BOLD,18));
		
		add(addField);
		
		JLabel city = new JLabel("City: ");
		
		city.setBounds(50,500,200,30);
		
		city.setFont(new Font("osward",Font.BOLD,18));
		
		add(city);
		
		cityField = new JTextField();
		
		cityField.setBounds(250,500,350,30);
		
		cityField.setFont(new Font("osward",Font.BOLD,18));
		
		add(cityField);
		
		JLabel state = new JLabel("State: ");
		
		state.setBounds(50,550,200,30);
		
		state.setFont(new Font("osward",Font.BOLD,18));
		
		add(state);
		
		stateField = new JTextField();
		
		stateField.setBounds(250,550,350,30);
		
		stateField.setFont(new Font("osward",Font.BOLD,18));
		
		add(stateField);
		
		JLabel pincode = new JLabel("Pincode: ");
		
		pincode.setBounds(50,600,200,30);
		
		pincode.setFont(new Font("osward",Font.BOLD,18));
		
		add(pincode);
		
		pincodeField = new JTextField();
		
		pincodeField.setBounds(250,600,350,30);
		
		pincodeField.setFont(new Font("osward",Font.BOLD,18));
		
		add(pincodeField);
		
		next = new JButton("Next");
		
		next.setBackground(Color.black);
		
		next.setForeground(Color.white);
		
		next.setBounds(520,650,80,30);
		
		next.addActionListener(this);
		
		add(next);
		
		
		getContentPane().setBackground(Color.WHITE);
		
	}

	public static void main(String[] args) {
		
		new SignUpOne();


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String formNo = ""+random;
		
		String name = nameField.getText();
		
		String fname = fnameField.getText();
		
		String date = dc.getText();
		
		String email = emailField.getText();
		
		String address = addField.getText();
		
		String city = cityField.getText();
		
		String pincode = pincodeField.getText();
		
		String state = stateField.getText();
		
		String gender = null;
		
		if(male.isSelected()) {
			
			gender = "Male";
		}
		else if(fmale.isSelected()) {
			
			gender = "Female";
		}
		
		String maritalStatus  = null;
		
		if(married.isSelected()) {
			
			maritalStatus ="Married";
			
		}else {
			
			maritalStatus ="single";
		}
		
		if(name.equals("")) {
			
			JOptionPane.showMessageDialog(null, "name is required");
		}
		else {
			
			try {
				
				Conn c = new Conn();
				
				String query = "INSERT INTO signup VALUES('"+formNo+"','"+name+"','"+fname+"','"+date+"','"+email+"','"+address+"','"+city+"','"+pincode+"','"+state+"','"+gender+"','"+maritalStatus+"')";
				
				c.s.executeUpdate(query);
				
				setVisible(false);
				
				new SignUpTwo(formNo).setVisible(true);;
			}
			catch(Exception e1) {
				
				System.out.println(e1);
				
			}
		}
		
		
	}

}
