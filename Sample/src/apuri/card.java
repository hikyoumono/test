package apuri;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class card {
	static int status;

	public static void main(String[] args) throws IOException {


		int yoko = 0;
		int tate = 0;





	}

	public static void card(int yoko, int tate, int xscope, int yscope, int status) throws IOException {
		File cfile = new File("card");
		BufferedImage cbf = ImageIO.read(cfile);
		BufferedImage cbb = cbf.getSubimage(yoko * xscope, tate * yscope, yoko, tate);
		int ckakudai1 = yoko * 3;
		int ckakudai2 = tate * 3;
		Image cbo = cbb.getScaledInstance(25, 50, Image.SCALE_DEFAULT);
		ImageIcon cii = new ImageIcon(cbo);

		JPanel jpcard = new JPanel();
		game gg = new game();
		jpcard.setSize(ckakudai1, ckakudai2);
		gg.jpg.add(jpcard);

		JButton cjb = new JButton(cii);
		cjb.setSize(ckakudai1, ckakudai2);
		jpcard.add(cjb);

	}

}
