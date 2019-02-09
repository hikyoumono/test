package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstPanel extends JFrame implements ActionListener{
JPanel panel;
CardLayout layer;

public static void main(String args[]){
	FirstPanel frame = new FirstPanel();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBounds(100,20,1000,700);
	frame.setTitle("直観力トレーニング");
	frame.setVisible(true);
}

FirstPanel(){


//scene1
JPanel scene1 = new JPanel();
JPanel titlesPanel = new JPanel();
JPanel buttonsPanel = new JPanel();
JLabel title = new JLabel("直観力テスト");
title.setFont(new Font(Font.SERIF,Font.BOLD,50));
titlesPanel.setPreferredSize(new Dimension(100,300));

JButton jb = new JButton("直観力テストスタート");
jb.setPreferredSize(new Dimension(200,50));
jb.addActionListener(this);
jb.setActionCommand("view2");

titlesPanel.add(title);
buttonsPanel.add(jb);
scene1.add(titlesPanel);
scene1.add(buttonsPanel);

getContentPane().add(titlesPanel,BorderLayout.PAGE_START);
getContentPane().add(buttonsPanel,BorderLayout.CENTER);


//scene2
JPanel scene2 = new JPanel();
scene2.setBackground(Color.BLUE);


//matomeru
this.panel = new JPanel();
this.layer = new CardLayout();
this.panel.setLayout(this.layer);

this.panel.add(scene1,"view1");
this.panel.add(scene2,"view2");


}
public void actionPerformed(ActionEvent e){
	String cmd = e.getActionCommand();
	layer.show(this.panel,cmd);
}
}