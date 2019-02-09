package java;

import javax.swing.*;

import test.a7;

import java.awt.*;
import java.awt.event.*;

public class first extends JFrame{

public static void main(String args[]){
	first frame = new first();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBounds(100,100,500,500);
	frame.setTitle("sakusei");
	frame.setVisible(true);


	}
first(){
	JPanel scene1 = new JPanel();
	scene1.add(new JLabel("直観力テスト"));


}


public void change(JPanel panel) {
    getContentPane().removeAll();

    super.add(panel);//画面追加
    validate();//更新
    repaint();//再描画
}



}

