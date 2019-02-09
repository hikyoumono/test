package rensyu;

import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.*;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class tokuren101 extends JPanel {

	tokuren102 player = new tokuren102();

	public tokuren101() {
		setBackground(Color.RED);
		JLabel jl = new JLabel("<html>この世界の何人が気付いているだろうか<br>金は所詮金なのか<br>    あるいは...</html>");
		jl.setForeground(Color.BLACK);
		jl.setFont(new Font(null, Font.BOLD, 30));
		add(jl);

		try {
			File file = new File("img_money1.jpg");// 画像でかすぎて泣いた
			player = new tokuren102(file, 500, 500);

		} catch (IOException e) {
			System.out.println("画像見つからない");

		}

	}

	protected void processKeyEvent(KeyEvent e) {
		tokuren102.move(e);
		repaint();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		requestFocusInWindow();
		g.setColor(Color.YELLOW);
		g.fillRect(0, 300, 1500, 200);
		g.drawImage(tokuren102.buff1, tokuren102.x, 100 + tokuren102.y, null);
	}

}
