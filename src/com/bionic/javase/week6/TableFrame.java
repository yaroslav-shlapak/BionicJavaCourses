package com.bionic.javase.week6;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableFrame extends JFrame {
	JPanel panel = new JPanel();
	String[] columnNames = { "id", "author", "title", "year" };
	String[][] tableData = { { "1", "Ivanov", "I am very clever", "2013" },
			{ "2", "Ivanov", "Getting rid of consience", "2010" },
			{ "3", "Kasa Nuovo", "My loving heart", "1799" },
			{ "4", "Petrov", "Addicted to murders", "1970" },
			{ "5", "Super-Cousine", "Dishes of fresh rats", "2005" }, 
			{ "1", "Ivanov", "I am very clever", "2013" },
			{ "2", "Ivanov", "Getting rid of consience", "2010" },
			{ "3", "Kasa Nuovo", "My loving heart", "1799" },
			{ "4", "Petrov", "Addicted to murders", "1970" },
			{ "5", "Super-Cousine", "Dishes of fresh rats", "2005" } ,
			{ "1", "Ivanov", "I am very clever", "2013" },
			{ "2", "Ivanov", "Getting rid of consience", "2010" },
			{ "3", "Kasa Nuovo", "My loving heart", "1799" },
			{ "4", "Petrov", "Addicted to murders", "1970" },
			{ "5", "Super-Cousine", "Dishes of fresh rats", "2005" } ,
			{ "1", "Ivanov", "I am very clever", "2013" },
			{ "2", "Ivanov", "Getting rid of consience", "2010" },
			{ "3", "Kasa Nuovo", "My loving heart", "1799" },
			{ "4", "Petrov", "Addicted to murders", "1970" },
			{ "5", "Super-Cousine", "Dishes of fresh rats", "2005" } };

	TableFrame() {
		this.setTitle("Table Demo");
		this.setLocation(100, 100);
		this.setSize(700, 200);
		this.add(panel);
		JTable table = new JTable(tableData, columnNames);
		JScrollPane pane = new JScrollPane(table);
		panel.add(pane);

	}

}
