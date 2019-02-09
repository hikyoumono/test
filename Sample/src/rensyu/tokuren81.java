package rensyu;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class tokuren81 {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setBounds(100,100,500,300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel jl = new JLabel("JAVA応用練習中");
		jl.setFont(new Font(Font.SERIF,Font.BOLD,50));
		//スタイル、太さ、大きさ
		jl.setForeground(Color.blue);
		jf.add(jl);

	}

}
