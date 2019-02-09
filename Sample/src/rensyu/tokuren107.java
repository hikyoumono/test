package rensyu;

import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class tokuren107 extends javax.swing.JApplet{
static tokuren105 ss;
static tokuren106 m_tup;

public void init(){
    m_tup = new tokuren106();
    MyPanel();
    getContentPane().add(m_tup);
}


public void MyPanel(){
m_tup.setBackground(Color.RED);
//JLabel jl = new JLabel("aa");
//add(jl);
try {
File file = new File("img_money.jpg");
ss = new tokuren105(file, 100, 100, 100, 100);

}catch(IOException e){
e.printStackTrace();
}
}

public void wmKeyDown(int code){
ss.move(code);
repaint();
}

public static void wmPaint(){
    whatcolor(Color.ORANGE);
    fillRect(100,100,100,100);
    draw(ss);
    //next71
}

public static void draw(tokuren105 s){
    m_tup.draw(s);
}
public static void fillRect(int x,int y, int width, int height){
    m_tup.fillRect(x, y, width , height);
}
public static void whatcolor(Color c){
    m_tup.whatcolor(c);
}
}