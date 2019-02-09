package clock;

import java.awt.*;
import javax.swing.*;

public class home extends JPanel {

	JButton jb1, jb2, jb3, jb4, jb5;

	public home() {
		JButton jb1 = new JButton("jb1");
		JButton jb2 = new JButton("jb2");
		JButton jb3 = new JButton("jb3");
		JButton jb4 = new JButton("jb4");
		JButton jb5 = new JButton("jb4");

		// レイアウトの指定
		setLayout(new BorderLayout());
		// JPanelの配置

		add(jb1, BorderLayout.NORTH);
		add(jb2, BorderLayout.CENTER);
		add(jb3, BorderLayout.SOUTH);
		add(jb4, BorderLayout.EAST);
		add(jb5, BorderLayout.WEST);

	}

	public static void main(String[] args) {

	}

}
