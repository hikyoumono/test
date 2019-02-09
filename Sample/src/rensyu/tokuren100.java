package rensyu;

	import java.awt.image.BufferedImage;
	import java.awt.*;
	import java.awt.event.KeyEvent;
	public class tokuren100{
	BufferedImage buff1;
	static int x,y;
	public tokuren100(){

	}

	public tokuren100(int x, int y, BufferedImage buff1){
	this.x=x;
	this.y=y;
	this.buff1=buff1;
	}


	protected static void move(KeyEvent e){
	if(e.getID() == KeyEvent.KEY_PRESSED){
	System.out.println("キー" + e.getKeyCode() + "が押されています");
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



}
