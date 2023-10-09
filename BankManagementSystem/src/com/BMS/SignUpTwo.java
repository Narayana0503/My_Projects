package com.BMS;

import java.awt.Color;

import java.awt.event.*;

import java.awt.Font;

import javax.swing.*;

import java.util.*;

public class SignUpTwo extends JFrame implements ActionListener {
	
		private static final long serialVersionUID = 3L;
				
		JTextField panField, adharNumberField;
		
		JRadioButton old;
		JRadioButton nold;
		JRadioButton yacc;
		JRadioButton nacc;
		
		JButton next;
		
		JComboBox religion, caste, studyDetails, money, occuDetails;

	    String formNo;
		
		

		public SignUpTwo(String formNo) {
			
			this.formNo = formNo;
			
			setLayout(null);
			
			setVisible(true);
			
			setSize(850,800);
			
			setLocation(350,10);
			
			setTitle("New Application Form - Page 2");
			
		    JLabel presonalDetails = new JLabel("Page 2: Additional Details");
			
			presonalDetails.setBounds(280,100,400,30);
			
			presonalDetails.setFont(new Font("osward",Font.BOLD,22));
			
			add(presonalDetails);
			
			JLabel name = new JLabel("Religion: ");
			
			name.setBounds(50,200,100,30);
			
			name.setFont(new Font("osward",Font.BOLD,18));
			
			add(name);
			
			String[] religions = {"Hindu", "Christian", "Muslim", "Sikh", "Other"};
			
			religion = new JComboBox(religions);
			
			religion.setBounds(250,200,350,30);
			
			religion.setFont(new Font("osward",Font.PLAIN,14));
			
			religion.setBackground(Color.white);
			
			add(religion);
			
			
			String[] cate = {"OC", "OBC","SC","ST"};
			
			caste = new JComboBox(cate);
			
			caste.setBounds(250,250,350,30);
			
			caste.setFont(new Font("osward",Font.PLAIN,12));
			
			caste.setBackground(Color.WHITE);
			
			add(caste);
			
			
			JLabel fname = new JLabel("Category: ");
			
			fname.setBounds(50,250,200,30);
			
			fname.setFont(new Font("osward",Font.BOLD,18));
			
			add(fname);
			
			
			String[] study = {"Non-Graduate", "UG","PG","Other"};
			
			studyDetails = new JComboBox(study);
			
			studyDetails.setBounds(250,300,350,30);
			
			studyDetails.setFont(new Font("osward",Font.PLAIN,14));
			
			add(studyDetails);
			
			JLabel gender = new JLabel("Educational Details: ");
			
			gender.setBounds(50,300,200,30);
			
			gender.setFont(new Font("osward",Font.BOLD,18));
			
			add(gender);
			
		
			
			JLabel email = new JLabel("Income: ");
			
			email.setBounds(50,350,200,30);
			
			email.setFont(new Font("osward",Font.BOLD,18));
			
			add(email);
			
			String[] cash = {"NULL","<50000", "<1,50000","<300,000","<500,000"};
			
		    money = new JComboBox(cash);
			
		    money.setBounds(250,350,350,30);
			
		    money.setFont(new Font("osward",Font.PLAIN,14));
			
			add(money);
			
			JLabel maritalStatus = new JLabel("Occupation: ");
			
			maritalStatus.setBounds(50,400,200,30);
			
			maritalStatus.setFont(new Font("osward",Font.BOLD,18));
			
			add(maritalStatus);
			
			String[] work = {"Un-Employed","Self-Employed", "Business","Student","Other"};
			
		    occuDetails = new JComboBox(work);
			
		    occuDetails.setBounds(250,400,350,30);
			
		    occuDetails.setFont(new Font("osward",Font.PLAIN,14));
			
			add(occuDetails);
		
			
			JLabel pan = new JLabel("PAN number: ");
			
			pan.setBounds(50,450,200,30);
			
			pan.setFont(new Font("osward",Font.BOLD,18));
			
			add(pan);
			
			panField = new JTextField();
			
			panField.setBounds(250,450,350,30);
			
			panField.setFont(new Font("osward",Font.BOLD,18));
			
			add(panField);
			
			JLabel adhar = new JLabel("Adhar Number: ");
			
			adhar.setBounds(50,500,200,30);
			
			adhar.setFont(new Font("osward",Font.BOLD,18));
			
			add(adhar);
			
			adharNumberField = new JTextField();
			
			adharNumberField.setBounds(250,500,350,30);
			
			adharNumberField.setFont(new Font("osward",Font.BOLD,18));
			
			add(adharNumberField);
			
			JLabel seniorct = new JLabel("Senior Citizen: ");
			
			seniorct.setBounds(50,550,200,30);
			
			seniorct.setFont(new Font("osward",Font.BOLD,18));
			
			add(seniorct);
			
			old = new JRadioButton("Yes");
			
			old.setBounds(250,550,100,30);
			
			old.setFont(new Font("osward",Font.BOLD,14));
			
			old.setBackground(Color.white);
			
			add(old);
			
			nold = new JRadioButton("No");
			
			nold.setBounds(350,550,100,30);
			
			nold.setFont(new Font("osward",Font.BOLD,14));
			
			nold.setBackground(Color.white);
			
			add(nold);
			
			ButtonGroup oldOrNot = new ButtonGroup();
			
			oldOrNot.add(nold);
			
			oldOrNot.add(old);
			
			JLabel pincode = new JLabel("Existing Account: ");
			
			pincode.setBounds(50,600,200,30);
			
			pincode.setFont(new Font("osward",Font.BOLD,18));
			
			add(pincode);
			
			yacc = new JRadioButton("Yes");
			
			yacc.setBounds(250,600,100,30);
			
			yacc.setFont(new Font("osward",Font.BOLD,14));
			
			yacc.setBackground(Color.white);
			
			add(yacc);
			
			nacc = new JRadioButton("No");
			
			nacc.setBounds(350,600,50,30);
			
			nacc.setFont(new Font("osward",Font.BOLD,14));
			
  			nacc.setBackground(Color.white);
			
			add(nacc);
			
			ButtonGroup ynAcc = new ButtonGroup();
			
			ynAcc.add(yacc);
			
			ynAcc.add(nacc);
			
			
			
			next = new JButton("Next");
			
			next.setBackground(Color.black);
			
			next.setForeground(Color.white);
			
			next.setBounds(520,650,80,30);
			
			next.addActionListener(this);
			
			add(next);
			
			
			getContentPane().setBackground(Color.WHITE);
			
		}

		public static void main(String[] args) {
			
			new SignUpTwo("");


		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			String sreligion = (String) religion.getSelectedItem();
			
			String scaste = (String) caste.getSelectedItem();
			
			String educationDeatails = (String) studyDetails.getSelectedItem();
			
			String occupation = (String) occuDetails.getSelectedItem();
			
			String scash = (String) money.getSelectedItem();
			
			String adhar = adharNumberField.getText();
			
			String panNo = panField.getText();
			
			String seniorCitizen = null;
			
			if(old.isSelected()) {
				
				seniorCitizen = "Yes";
			}
			else if(nold.isSelected()) {
				
				seniorCitizen = "No";
			}
			
			String existOrNot  = null;
			
			if(yacc.isSelected()) {
				
				existOrNot ="Yes";
				
			}else if(nacc.isSelected()) {
				
				existOrNot ="No";
			}
			
				
				try {
					
					Conn c = new Conn();
					
					String query = "INSERT INTO signuptwo VALUES('"+formNo+"','"+sreligion+"','"+scaste+"','"+educationDeatails+"','"+scash+"','"+occupation+"','"+adhar+"','"+panNo+"','"+seniorCitizen+"','"+existOrNot+"')";
					
					c.s.executeUpdate(query);
					
					setVisible(false);
					
					new SignUpThree(formNo).setVisible(true);
				}
				catch(Exception e1) {
					
					System.out.println(e1);
					
				}
			}
			
			
		}




