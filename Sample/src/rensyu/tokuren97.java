package rensyu;
import javax.swing.*;
import java.awt.*;

public class tokuren97 extends JPanel{

	tokuren97(){
		
		setBackground(Color.RED);
		JLabel jl = new JLabel("この世界の何人が気付いているだろうか");
		jl.setFont(new Font(Font.SERIF,Font.BOLD,100));
		jl.setForeground(Color.YELLOW);
		add(jl);
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(100,100,100,100);
	}
	
	
}
