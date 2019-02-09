package graphic;
import javax.swing.*;
import java.awt.*;
public class part01 extends JPanel{

	part01(){
		
		setBackground(Color.RED);

		JLabel jl = new JLabel("この世界の　何人が気付いているだろうか");
		jl.setForeground(Color.GREEN);
		jl.setFont(new Font(null,Font.BOLD,200));
		add(jl);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(100,100,100,100);

	}
	
	public static void main(String[] args){
		
		
		
	}
}
