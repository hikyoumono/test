package apuri;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.JButton;
import java.awt.Image;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.IOException;

public class homegamen {

	public static void main(String[] args)throws IOException {
		JFrame jf = new JFrame();
		jf.setBounds(10, 0, 1300, 800);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// メインパネル
		JPanel jp1 = new JPanel(new GridLayout(2, 1));
		jp1.setBounds(100, 100, 100, 100);
		jp1.setBackground(Color.WHITE);
		jf.add(jp1);

		// 大富豪と表示するためだけのパネル
		JPanel jp2 = new JPanel();
		jp2.setBounds(100, 100, 300, 300);
		jp2.setBackground(Color.GREEN);
		jp1.add(jp2);

		// スタートパネル
		JPanel jp3 = new JPanel();
		jp3.setPreferredSize(new Dimension(500,500));
		jp1.add(jp3);

		JLabel jl1 = new JLabel("大富豪");
		jl1.setFont(new Font(Font.SERIF, Font.BOLD, 150));
		jl1.setForeground(Color.BLUE);
		jp2.add(jl1);

		jf.setVisible(true);

		//スタートとボタン
		File file = new File("daihugou");
		BufferedImage bb = ImageIO.read(file);
		BufferedImage bf = bb.getSubimage(30,30,30,30);              //トリミング
		Image bo = bf.getScaledInstance(25,50,Image.SCALE_DEFAULT);  //拡大
		ImageIcon ic = new ImageIcon(bo);
		scene(ic ,jp3);

	}
		public static void scene(ImageIcon ic,JPanel jp3){
		JButton jlb = new JButton(ic);
		jlb.setSize(20,20);
		jp3.add(jlb);
		}





}
