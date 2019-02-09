package app;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ThirdPanel extends JPanel implements ActionListener{
	    private final String str;
	    private final MainFrame frame; // インスタンス変数でMainFrameの参照を保持
	    public ThirdPanel(MainFrame f, String s){
	        str = s;
	        frame = f;
	        this.setName(s);//固定文字列ではなく、コンストラクタで渡された文字列に変更
	        //setLocationRelativeTo(null);
	        setLayout(null);

	        JLabel titleLabel = new JLabel(s);//固定文字列ではなく、コンストラクタで渡された文字列に変更

	        titleLabel.setBounds(270, 100, 512, 100);

	        titleLabel.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 64));
	        titleLabel.setHorizontalTextPosition(JLabel.CENTER);

	        JButton buttonOne = new JButton("One");
	        buttonOne.setBounds(256, 350, 512, 50);
	        buttonOne.addActionListener(this);
	        buttonOne.setActionCommand("One");

	        JButton buttonTwo = new JButton("Two");
	        buttonTwo.setBounds(256, 400, 512, 50);
	        buttonTwo.addActionListener(this);
	        buttonTwo.setActionCommand("Two");

	        JButton buttonThree = new JButton("Three");
	        // setBounds の引数y 4050=> 450
	        buttonThree.setBounds(256, 450, 512, 50);
	        buttonThree.addActionListener(this);
	        buttonThree.setActionCommand("Three");

	        JButton buttonFour = new JButton("Four");
	        buttonFour.setBounds(256, 500, 512, 50);
	        buttonFour.addActionListener(this);
	        buttonFour.setActionCommand("Four");

	        JButton buttonFive = new JButton("Five");
	        buttonFive.setBounds(256, 550, 512, 50);
	        buttonFive.addActionListener(this);
	        buttonFive.setActionCommand("Five");

	        add(titleLabel);
	        add(buttonOne);
	        add(buttonTwo);
	        add(buttonThree);
	        add(buttonFour);
	        add(buttonFive);

	    }


	    @Override
	    public void actionPerformed(ActionEvent e) {
	        String cmd = e.getActionCommand();
	        System.out.println(cmd);
	}

}

