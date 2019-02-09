package test;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Color;


public class a{
static JButton button1;
	public static void main(String[] args) throws InterruptedException{
		GameWindow gw = new GameWindow("テストウィンドウ",400,300);
		gw.setVisible(true);
		gw.change(new Scene1());
		Thread.sleep(1000);





	}
}






class GameWindow extends JFrame{
	private Thread th = null;

	public GameWindow(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width,height);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	//画面切り替え用メソッド
	public void change(JPanel panel) {
		getContentPane().removeAll();

		super.add(panel);//画面追加
		validate();//更新
		repaint();//再描画
	}

}


class Scene1 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillRect(0,0,400,300);

		JButton button1 = new JButton("View1");
		add(button1);

		g.setColor(Color.BLACK);
		g.drawString("タイトル画面", 170, 50);
	}
}



class Scene2 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(0,0,400,300);

		g.setColor(Color.WHITE);
		g.drawString("ゲーム画面", 170, 50);
	}
}



class Scene3 extends JPanel{
	public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.drawImage();
	g.fillRect(0,0,400,300);
	}
}



class Scene4 extends JPanel{
	public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.drawImage();
	g.fillRect(0,0,400,300);
	}
}
