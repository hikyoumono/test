package rensyu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class tokuren98 extends JPanel {
	static int x;

	tokuren98() {
		setBackground(Color.BLUE);
		JLabel jl = new JLabel("いい体制がない");
		jl.setFont(new Font(null, Font.BOLD, 300));
		jl.setForeground(Color.BLUE);
		add(jl);

	}

	protected void processKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			System.out.println("echo お");
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				x += 32;
				repaint();
			}
		}

	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		requestFocusInWindow();

		g.setColor(Color.BLUE);
		g.fillRect(200, 100, 500, 500);

	}

}
