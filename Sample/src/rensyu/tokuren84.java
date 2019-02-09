package rensyu;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class tokuren84 {
	

	public static void kensi(JLabel player1) throws IOException {
		File file = new File("monster.jpg");
		BufferedImage bfimg = ImageIO.read(file);
		BufferedImage img = bfimg.getSubimage(32, 48, 32, 48);
		ImageIcon play1 = new ImageIcon(img);
		player1 = new JLabel(play1);
		player1.setSize(384, 384);
		
	}

	public static void heeler() throws IOException {
		File file = new File("monster.jpg");
		BufferedImage bfimg = ImageIO.read(file);
		BufferedImage img = bfimg.getSubimage(32, 48, 32, 48);
		ImageIcon player2 = new ImageIcon(img);
	}

	public static void murabito1() throws IOException {
		File file = new File("monster.jpg");
		BufferedImage bfimg = ImageIO.read(file);
		BufferedImage img = bfimg.getSubimage(32, 48, 32, 48);
		ImageIcon player3 = new ImageIcon(img);
	}

	public static void murabito2() throws IOException {
		File file = new File("monster.jpg");
		BufferedImage bfimg = ImageIO.read(file);
		BufferedImage img = bfimg.getSubimage(32, 48, 32, 48);
		ImageIcon player4 = new ImageIcon(img);
	}

}
