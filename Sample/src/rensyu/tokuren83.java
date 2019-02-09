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

public class tokuren83 {

	public static void main(String[] args)throws IOException{


	//フレームを作成
	JFrame jf = new JFrame();
	jf.setBounds(300, 100, 1000, 2000);
	//横位置、縦位置、横大きさ、縦大きさ
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	//パネルを作成
	JPanel jp = new JPanel();
	jp.setBackground(Color.BLACK);
	jf.add(jp);


	//ラベルを作成パネルに張り付け
	JLabel jl = new JLabel("魔王が世界を滅ぼそうとしています");
	jl.setFont(new Font(Font.SERIF, Font.BOLD, 50));
	jl.setForeground(Color.BLUE);
	jp.add(jl);

	//ミニパネル作成
	JPanel jpChild = new JPanel();
	jpChild.setBackground(Color.RED);
	jp.add(jpChild);

	JLabel jlChild = new JLabel("トンズラ  LV99  HP99/99");
	jlChild.setFont(new Font(Font.SERIF, Font.BOLD, 25));
	jlChild.setForeground(Color.WHITE);
	jpChild.add(jlChild);



	File file = new File("monster.jpg");
	BufferedImage buff = ImageIO.read(file);
	BufferedImage buff2 = buff.getSubimage(96,192,32,48);

	//↓JLabelがIconって後ろについた奴しか読み込まないんだよなぁ
	ImageIcon ii = new ImageIcon(buff2);

	JLabel img = new JLabel(ii);
	img.setSize(384, 384);
	jp.add(img);



	}
}


