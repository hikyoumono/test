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
import java.awt.Dimension;

public class tokuren94 {

	public static void main(String[] args) throws IOException {

		// フレームを作成
		JFrame jf = new JFrame();
		jf.setBounds(100, 100, 1000, 2000);
		// 横位置、縦位置、横大きさ、縦大きさ
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 親パネルを作成
		JPanel jp = new JPanel(new GridLayout(4, 1));
		jp.setBackground(Color.BLACK);
		jf.add(jp);

		// ステータスパネル
		JPanel jpChild = createPanel(Color.BLACK);
		jp.add(jpChild);

		// モンスターパネル
		JPanel jpo = new JPanel(new GridLayout(1, 3));
		jpo.setBackground(Color.BLACK);
		jpo.setPreferredSize(new Dimension(500, 500));

		jp.add(jpo);

		// コマンドパネル
		JPanel jpl = new JPanel();
		jpl.setBackground(Color.BLACK);
		jp.add(jpl);

		// ステータスラベル
		JLabel jlChild = new JLabel("トンズラ  LV99  HP99/99");
		jlChild.setFont(new Font(Font.SERIF, Font.BOLD, 25));
		jlChild.setForeground(Color.WHITE);
		jpChild.add(jlChild);

		File file = new File("monster.jpg");
		BufferedImage buff = ImageIO.read(file);

		int x = 32;
		int y = 48;

		putMonster(buff, jpo, 1, 0, x, y);
		putMonster(buff, jpo, 4, 0, x, y);

		// コマンドラベル
		JLabel jl = new JLabel("敵が現れた");
		jl.setFont(new Font(Font.SERIF, Font.BOLD, 50));
		jl.setForeground(Color.WHITE);
		jpl.add(jl);

		jf.setVisible(true);
	}

	public static void putMonster(BufferedImage buff, JPanel jpo, int cx, int cy, int x, int y) {
		BufferedImage buff2 = buff.getSubimage(x * cx, y * cy, x, y);
		int kakudai1 = x * 5;
		int kakudai2 = y * 5;
		Image buff3 = buff2.getScaledInstance(kakudai1, kakudai2, Image.SCALE_DEFAULT);

		// モンスターラベル
		ImageIcon ii = new ImageIcon(buff3);
		JLabel img = new JLabel(ii);
		img.setSize(kakudai1, kakudai2);
		jpo.add(img);

	}

	public static JPanel createPanel(Color c) {
		JPanel jp = new JPanel();
		jp.setBackground(c);
		return (jp);

		// https://gyazo.com/4582d94f2107bf49c28e0dcba5ac10e1
		// https://gyazo.com/8da63d40abc1c31b5c2add66a2821a18

	}

}