package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener {
	JPanel panel;
	CardLayout layer;

	public static void main(String args[]) {
		MainFrame frame = new MainFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 20, 1000, 700);
		frame.setTitle("直観力トレーニング");
		frame.setVisible(true);
	}

	MainFrame() {

		// scene1
		JPanel scene1 = new JPanel();
		JPanel titlesPanel = new JPanel();
		JLabel title = new JLabel("直観力テスト");
		title.setFont(new Font(Font.SERIF, Font.BOLD, 50));
		titlesPanel.setPreferredSize(new Dimension(100, 300));
		titlesPanel.add(title);
		scene1.add(titlesPanel);

		getContentPane().add(titlesPanel, BorderLayout.PAGE_START);

		// scene2
		JPanel scene2 = new JPanel();
		scene2.setBackground(Color.BLUE);

		// matomeru
		this.panel = new JPanel();
		this.layer = new CardLayout();
		this.panel.setLayout(this.layer);

		this.panel.add(scene1, "menue");
		this.panel.add(scene2, "view");

		JPanel buttonsPanel = new JPanel();
		JButton jb = new JButton("直観力テストスタート");
		jb.setPreferredSize(new Dimension(200, 50));
		jb.addActionListener(this);
		jb.setActionCommand("view");

		buttonsPanel.add(jb);
		scene1.add(buttonsPanel);
		getContentPane().add(buttonsPanel, BorderLayout.CENTER);
		this.panel.add(scene1, "menue");

	}

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		layer.show(this.panel, cmd);
	}
}