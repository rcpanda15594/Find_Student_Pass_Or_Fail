//page#137

package com.nt.jdbc;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AllStmtsTest extends JFrame implements ActionListener{
	
	private JLabel lno,lname,lm1,lm2,lm3,lres;
	private JTextField tname,tm1,tm2,tm3,tres;
	private JComboBox tno;
	private JButton bdetails,bserult;
	
	
	//Constructor
	public AllStmtsTest() {
		System.out.println("AllStmtsTest:0-param Cons");
		setTitle("Mini Projrct");
		setSize(300,300);
		setLayout(new FlowLayout());
		setBackground(Color.gray);
		
		//add comp
		lno=new JLabel("Student Id");
		add(lno);
		tno=new JComboBox();
		add(tno);
		bdetails=new JButton("details");
		bdetails.addActionListener(this);
		add(bdetails);
		lname=new JLabel("Name");
		add(lname);
		
	}//constructor

public static void main(String[]args) {
	System.out.println("Main(-) Method");
	new AllStmtsTest();
}//main method

@Override
public void actionPerformed(ActionEvent e) {
	
	
}//action perform(-)
	
}//class
