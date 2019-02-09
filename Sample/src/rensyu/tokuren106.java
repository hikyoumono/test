package rensyu;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;


public class tokuren106 extends JPanel{
//TUPanel
static Graphics m_g;

protected void processKeyEvent(KeyEvent e){
if(e.getID() == KeyEvent.KEY_PRESSED){
//int code = e.getKeyCode();
wmKeyDown(e.getKeyCode());
}
}

/*
public void wmKeyDown(int code){
ss.move(code);
repaint();
}
*/

protected void paintComponent(Graphics g){
    super.paintComponent(g);
    requestFocusInWindow();

    m_g = g;
    wmPaint();
}

public void wmKeyDown(int code){

}

public static void wmPaint(){

tokuren107.wmPaint();
}

public static void draw(tokuren105 s){
    s.draw(m_g);
}

public static void fillRect(int x,int y, int width, int height){
    m_g.fillRect(x, y, width , height);
}

public static void whatcolor(Color c){
    m_g.setColor(c);
}


}
