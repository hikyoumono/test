package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class a7 extends JFrame implements ActionListener{
JPanel panel;
CardLayout layer;
	public static void main(String[] args) {
		a7 frame = new a7();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,500,500);
		frame.setTitle("sakusei");
		frame.setVisible(true);
	}
	a7(){
		//page1
		JPanel scene1 = new JPanel();
		scene1.setBackground(Color.BLUE);
		scene1.add(new JButton("butoon"));

		//page2
		JPanel scene2 = new JPanel();
		scene2.setBackground(Color.RED);
		scene2.add(new JLabel("page2"));

		//matomeru
		this.panel = new JPanel();
		this.layer = new CardLayout();
		this.panel.setLayout(this.layer);

		this.panel.add(scene1, "menue");
		this.panel.add(scene2, "view");

		JButton button2 = new JButton("mmenue");
		button2.addActionListener(this);
		button2.setActionCommand("menue");

		JButton button3 = new JButton("view");
		button3.addActionListener(this);
		button3.setActionCommand("view");

		//button's Panel
		JPanel kotei = new JPanel();
		kotei.add(button2);
		kotei.add(button3);

		getContentPane().add(this.panel,BorderLayout.CENTER);
		getContentPane().add(kotei,BorderLayout.PAGE_END);
	}

public void actionPerformed(ActionEvent e){
	String cmd = e.getActionCommand();
	layer.show(this.panel,cmd);
}
}
