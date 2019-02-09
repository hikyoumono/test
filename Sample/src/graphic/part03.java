package graphic;

	import javax.swing.*;
	import java.awt.*;

	public class part03 extends JPanel{

	public part03(){
	setBackground(Color.RED);
	JLabel jl = new JLabel("この世界の、<br>何人が気付いているいるだろうか");
	jl.setFont(new Font(null,Font.BOLD,100));
	add(jl);
	}

}
