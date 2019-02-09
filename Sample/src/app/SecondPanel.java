package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SecondPanel extends JFrame implements ActionListener {
	JPanel panel;
	CardLayout layer;

	public static void main(String args[]) {
		SecondPanel frame = new SecondPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 20, 1000, 700);
		frame.setTitle("直観力トレーニング");
		frame.setVisible(true);
	}

	SecondPanel() {
		// scene1
		JPanel scene1 = new JPanel();
		JPanel titlesPanel = new JPanel();
		JLabel title = new JLabel("直観力テスト");
		title.setFont(new Font(Font.SERIF, Font.BOLD, 50));
		titlesPanel.setPreferredSize(new Dimension(500, 100));
		titlesPanel.add(title, BorderLayout.NORTH);

		scene1.add(titlesPanel);

		JButton jb = new JButton("直観力テストスタート");
		jb.setPreferredSize(new Dimension(200, 50));
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.add(jb);

		scene1.add(buttonsPanel, BorderLayout.CENTER);

		// scene2
		JPanel scene2 = new JPanel();
		scene2.setBackground(Color.BLUE);
		JPanel questionsPanel = new JPanel();
		Random rand = new Random();
		int random = rand.nextInt();
		question(random);

		// matomeru
		this.panel = new JPanel();
		this.layer = new CardLayout();
		this.panel.setLayout(this.layer);

		this.panel.add(scene1, "menue");
		this.panel.add(scene2, "view");

		// ボタン用のパネル
		jb.addActionListener(this);
		jb.setActionCommand("view");

		// カードレイアウトに追加
		getContentPane().add(this.panel);

	}

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		layer.show(this.panel, cmd);
	}

	public void question(int random){
int[] array1 = {0,1,2,3,4,5,6,7,8,9,10,11,12};

		if(random == array1[0]){

		}else if(random == array1[1]){

		}else if(random == array1[2]){

		}else if(random == array1[3]){

		}else if(random == array1[4]){

		}else if(random == array1[5]){

		}else if(random == array1[6]){

		}else if(random == array1[7]){

		}else if(random == array1[8]){

		}else if(random == array1[9]){

		}else if(random == array1[10]){

		}else if(random == array1[11]){

		}else if(random == array1[12]){

		}
	}
}



