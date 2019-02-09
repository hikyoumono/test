package test;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.CardLayout;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Arrays;

public class a5 extends JFrame {
    public String[] PanelNames = { "First", "Second", "Third" };
    JPanel fp = new a6(this, PanelNames[0]);
    JPanel sp = new SecondPanel(this, PanelNames[1]);
    JPanel tp = new ThirdPanel(this, PanelNames[2]);
    public JPanel[] jps = { fp, sp, tp };
    private final CardLayout layout = new CardLayout();//カードレイアウト

    private static final int VERTICAL = 768;
    private static final int HORIZONTAL = 1024;

    public a5() {
        super("Test");
        setBounds(100, 100, 300, 250);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowClosing());
        setSize(HORIZONTAL, VERTICAL);
        // CardLayoutを使用。
        Container contentPane = getContentPane();
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(layout);
        for (JPanel panel : jps){
            mainPanel.add(panel, panel.getName());
        }
        contentPane.add(mainPanel);

        setResizable(false);
        setVisible(true);
    }

    class WindowClosing extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            int ans = JOptionPane.showConfirmDialog(a5.this, "本当に終了しますか?");
            if (ans == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }

    // changeKey=>changePanelにメソッド名を変更して、引数を1個に
    public void changePanel(String str) {
        int index = Arrays.asList(PanelNames).indexOf(str);
        layout.show(jps[index].getParent(), jps[index].getName());
    }
}
