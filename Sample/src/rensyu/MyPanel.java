package rensyu;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;

public class MyPanel extends JPanel {

	public MyPanel() {
		// 継承してるからJPanel jp = new JPanel();
		// jp.setBackground(Color.RED)とか要らないんだよなぁ
		setBackground(Color.WHITE);
		JLabel jl = new JLabel("ポケモン文句");
		jl.setFont(new Font(Font.MONOSPACED, Font.BOLD, 100));
		add(jl);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.orange);
		g.fillRect(200, 100, 500, 500);

	}

}
