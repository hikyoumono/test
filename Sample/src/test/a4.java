package test;
import javax.swing.*;
import java.awt.CardLayout;
import java.awt.BorderLayout;

public class a4 extends JFrame{

  public static void main(String[] args){
    a4 frame = new a4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  a4(){
    JButton button = new JButton("Button");
    JLabel label = new JLabel("Label");
    JTextField text = new JTextField("", 10);

    JPanel p = new JPanel();
    p.setLayout(new CardLayout());

    p.add(button, "button");
    p.add(label, "label");
    p.add(text, "text");

    getContentPane().add(p, BorderLayout.CENTER);
  }
}