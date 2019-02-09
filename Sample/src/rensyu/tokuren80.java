package rensyu;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class tokuren80 {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setBounds(100,100,100,100);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel jl = new JLabel("hello");
		jl.setFont(new Font(null,0,15));
		jl.setForeground(Color.blue);
		jf.add(jl);

	}

}
