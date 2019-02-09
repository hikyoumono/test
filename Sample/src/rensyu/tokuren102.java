package rensyu;

import java.io.File;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import java.io.IOException;
public class tokuren102{
static BufferedImage buff1;
static int x,y;

public tokuren102(){

}

public tokuren102(int x, int y, BufferedImage buff1){
this.x=x;
this.y=y;
this.buff1=buff1;
}




public tokuren102(File file, int x, int y)throws IOException{
BufferedImage buff1= ImageIO.read(file);
buff1= buff1.getSubimage(100,100,x,y);
}


protected static void move(KeyEvent e){
if(e.getID() == KeyEvent.KEY_PRESSED){
//	int code = e.getKeyCode();
wmKeyDown(e.getKeyCode(), e);
	//System.out.println("キー" + code + "が押されています");
}
}

public static void wmKeyDown(int code, KeyEvent e){
	if(e.getKeyCode() == KeyEvent.VK_RIGHT){
x +=30;

}else if(e.getKeyCode() == KeyEvent.VK_LEFT){
x -=30;

}else if(e.getKeyCode() == KeyEvent.VK_DOWN){
y +=30;

}else if(e.getKeyCode() == KeyEvent.VK_UP){
y -=30;
}

}


}