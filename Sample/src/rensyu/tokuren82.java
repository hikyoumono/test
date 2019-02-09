package rensyu;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class tokuren82 {

	public static void main(String[] args)throws java.io.IOException {
		JFrame jf = new JFrame();
		jf.setBounds(200,200,300,300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel jp = new JPanel();
		jp.setBackground(Color.blue);
		jf.add(jp);

		JLabel jl = new JLabel("ハラダ");
		jl.setForeground(Color.red);
		jl.setFont(new Font(Font.SERIF,Font.BOLD,30));
		jp.add(jl);

		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.BLACK);
		jp.add(jp2);

		JLabel jl2 = new JLabel("スタート");
		jl.setForeground(Color.WHITE);
		jl.setFont(new Font(null,Font.BOLD,25));
		jp2.add(jl2);

		File f = new File("akagi.jpg");
		BufferedImage bui = ImageIO.read(f);
		ImageIcon ll = new ImageIcon(bui);
		JLabel bufo = new JLabel(ll);
		jp.add(bufo);

		JLabel img = new JLabel(new ImageIcon("akagi.jpg"));
		img.setBounds(0, 0, 350, 350);
		jp.add(img);


	}

}
