package rensyu;

	import java.io.File;
	import java.awt.image.BufferedImage;
	import javax.imageio.ImageIO;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.KeyEvent;
	import java.awt.image.BufferedImage;
	import java.io.IOException;

	public class tokuren99 extends JPanel{

		tokuren100 player = new tokuren100();

	public tokuren99(){
	setBackground(Color.RED);
	JLabel jl = new JLabel("<html>この世界の何人が気付いているだろうか<br>金は所詮金なのか<br>    あるいは...</html>");
	jl.setForeground(Color.BLACK);
	jl.setFont(new Font(null,Font.BOLD,30));
	add(jl);


	try{
	File file = new File("img_money1.jpg");//画像でかすぎて泣いた
	player.buff1= ImageIO.read(file);
	player.buff1= player.buff1.getSubimage(100,100,500,500);

	}catch(IOException e){
	System.out.println("画像見つからない");
	}

	}

	protected void processKeyEvent(KeyEvent e){
    player.move(e);
	repaint();
	}

	protected void paintComponent(Graphics g){
	super.paintComponent(g);
	requestFocusInWindow();
	g.setColor(Color.YELLOW);
	g.fillRect(0,300,1500,200);
	g.drawImage(player.buff1,player.x,100 + player.y,null);
	}




}
