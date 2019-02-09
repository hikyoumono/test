package apuri;

import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class game {
	JPanel jpg;

	game() {

	}

	public static void main(String[] args) throws IOException {

		// ゲームの主なフレーム
		JFrame jfg = new JFrame();
		jfg.setBounds(10, 0, 950, 1100);
		jfg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		// メインパネル
		JPanel jpg = new JPanel();
		jpg.setBounds(10, 0, 950, 1100);
		jpg.setBackground(Color.GREEN);
		jfg.add(jpg);

		// ゲームパネル
		name.player();

		// カード配布メソッド呼び出し
		rule.manage();

		for (int i = 0; i < 10; i++) {

			// プレイヤーカード選択メソッド
			rule.select();

			// CPUカード選択メソッド呼び出し
			rule.cpuselect();
		}
		jfg.setVisible(true);
	}

	public static void hyouzi(Color color1, Color color2, String mozi, int aaa, JPanel jpg) {
		JPanel jpm = new JPanel();
		jpm.setBounds(10, 0, 950, 1200);
		jpm.setBackground(color1);
		jpg.add(jpm);

		JLabel jlm = new JLabel(mozi);
		jlm.setForeground(color2);
		jlm.setFont(new Font(null, Font.BOLD, aaa));
		jpm.add(jlm);

	}

	public static void botan(Color bcolor, String nyuryoku, JPanel jpg) {
		JPanel jpa = new JPanel();
		jpa.setSize(600, 300);
		jpa.setBackground(bcolor);

		JButton jbt = new JButton(nyuryoku);
		jbt.setSize(600, 300);
		jpa.add(jbt);

	}

}
