package com.bionic.javase.week6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TreatEventsFrame extends JFrame {
	private JButton b;
	private JLabel l;
	private JTextField t;
	private JPanel p;
	private ActionListener listener;

	public TreatEventsFrame() {
		// TODO Auto-generated constructor stub
		listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l.setText(t.getText());
				t.setText("");
			}
		};
	
		
		p = new JPanel();
		b = new JButton("ok");
		l = new JLabel("enter your name");
		t = new JTextField(40);
		
		b.addActionListener(listener
				/*new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				l.setText(t.getText());

			}
		}*/);
		
		p.add(b);
		p.add(l);
		p.add(t);
		this.add(p);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 100);
		this.setLocation(100, 100);
		this.setTitle("ololo");
		this.setVisible(true);
		
	}
}
