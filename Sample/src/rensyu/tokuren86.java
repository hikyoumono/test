package rensyu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Font;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.awt.Image;
import java.awt.GridLayout;

public class tokuren86 {
	static BufferedImage buff;
	static JPanel jp;

	public static void main(String[] args) throws IOException {

		// フレームを作成
		JFrame jf = new JFrame();
		jf.setBounds(300, 100, 1000, 2000);
		// 横位置、縦位置、横大きさ、縦大きさ
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// パネルを作成
		jp = new JPanel(new GridLayout(3, 2));
		jp.setBackground(Color.BLACK);
		jf.add(jp);


		JPanel jpl = new JPanel(new GridLayout(2,5));
		jpl.setBackground(Color.BLACK);
		jp.add(jpl);

		// ラベルを作成パネルに張り付け
		JLabel jl = new JLabel("<html>魔王が世界を滅ぼ<br>そうとしています</html>");
		jl.setFont(new Font(Font.SERIF, Font.BOLD, 50));
		jl.setForeground(Color.BLUE);
		jp.add(jpl);

		// ミニパネル作成
		JPanel jpChild = new JPanel();
		jpChild.setBackground(Color.RED);
		jp.add(jpChild);

		JLabel jlChild = new JLabel("トンズラ  LV99  HP99/99");
		jlChild.setFont(new Font(Font.SERIF, Font.BOLD, 25));
		jlChild.setForeground(Color.WHITE);
		jpChild.add(jlChild);

		File file = new File("monster.jpg");
		buff = ImageIO.read(file);

		int x = 32;
		int y = 48;

		putMonster(1, 0, x, y);
		putMonster(4, 0, x, y);
		putMonster(7, 0, x, y);
		putMonster(4, 4, x, y);


		jf.setVisible(true);
	}

	public static void putMonster(int cx, int cy, int x, int y) {
		BufferedImage buff2 = buff.getSubimage(x * cx, y * cy, x, y);
		int kakudai1 = x * 5;
		int kakudai2 = y * 5;
		Image buff3 = buff2.getScaledInstance(kakudai1, kakudai2, Image.SCALE_DEFAULT);

		ImageIcon ii = new ImageIcon(buff3);
		JLabel img = new JLabel(ii);
		img.setSize(kakudai1, kakudai2);
		jp.add(img);
	}

}
