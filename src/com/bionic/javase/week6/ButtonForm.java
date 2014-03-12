package com.bionic.javase.week6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonForm extends JFrame {
	private JPanel p;
	JButton b1;
	JButton b2;
	JLabel l;
	ActionListener al;
	
	
	public ButtonForm() {
		p = new JPanel();
		b1 = new JButton("First");
		b2 = new JButton("Second");
		l = new JLabel("I'm here");
		al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l.setText(((JButton) e.getSource()).getText());
			}
		};
		
		p.add(b1);
		p.add(b2);
		p.add(l);
		b1.addActionListener(al);
		b2.addActionListener(al);
		this.add(p);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 100);
		this.setLocation(100, 100);
		this.setTitle("ololo");
		this.setVisible(true);
		
	}
	
	
}
