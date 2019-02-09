package rensyu;

import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;


public class tokuren105	{
BufferedImage m_bi;
    int x;
    int y;
public tokuren105(BufferedImage bi){
m_bi = bi;
}
public tokuren105(BufferedImage bi, int x, int y, int w, int h){
m_bi = bi.getSubimage(x, y, w, h);
}
public tokuren105(File file, int x, int y, int w, int h)throws IOException{
BufferedImage bi = ImageIO.read(file);
m_bi = bi.getSubimage(x, y, w, h);
}

public void draw(Graphics g){
g.drawImage(m_bi,x,y,null);
}



public void move(int kc){
if(kc == KeyEvent.VK_RIGHT){
    x +=32;
}
else if(kc == KeyEvent.VK_LEFT){
    x -=32;
}
else if(kc == KeyEvent.VK_UP){
    y -=32;
}
else if(kc == KeyEvent.VK_DOWN){
    y +=32;
}
}

}