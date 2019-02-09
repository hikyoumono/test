package apuri;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.IOException;

public class gamegamen {

	public static void main(String[] args) throws IOException {
		JFrame gjf = new JFrame();
		gjf.setBounds(50, 50, 50, 50);
		gjf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// メインパネル
		JPanel gjp1 = new JPanel();
		gjp1.setBounds(10, 0, 100, 100);
		gjp1.setBackground(Color.WHITE);
		gjf.add(gjp1);

		gjf.setVisible(true);
	}

}
