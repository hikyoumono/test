package rensyu;

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tokuren48 {
	public static void main(String[] args){
		JFrame frame = new JFrame("おみくじ");
		frame.setBounds(200,200,200,150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] kuji = {"凶","小吉","吉","中吉","大吉"};
		Random r = new Random();
		int no = r.nextInt(5);
		
		String str = "今日は、" + kuji[no] + "です";
		frame.add(new JLabel(str,JLabel.CENTER));
		frame.setVisible(true);
		
		
	}

}
