package clock;
/*import java.time.LocalDateTime;
public class Display {
	
	
	public static void art(){
	LocalDateTime ldt = LocalDateTime.now();
	System.out.println(ldt);
	}
}
*/
import java.awt.*;
import javax.swing.*;

class GUI24 extends JPanel{

	JButton jb1,jb2,jb3,jb4,jb5;

    public GUI24(){
    //ボタンの作成
    	JButton j1 = new JButton("jb1");
		JButton j2 = new JButton("jb2");
		JButton j3 = new JButton("jb3");
		JButton j4 = new JButton("jb4");
		JButton j5 = new JButton("jb5");


    //レイアウトの指定
    setLayout(new BorderLayout());
    //JPanelの配置

    add(jb1,BorderLayout.NORTH);
    add(jb2,BorderLayout.CENTER);
    add(jb3,BorderLayout.SOUTH);
    add(jb4,BorderLayout.EAST);
    add(jb5,BorderLayout.WEST);
	
 }

public static void main(String[] args){
	
}



}