package app;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.text.*;

public class test extends JFrame{
int count = 0;
JLabel l = new JLabel();
Timer time = new Timer();


	public static void main(String args[]){
		test t = new test();
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t.setSize(1000, 1000);;

        t.setVisible(true);

    }
	public test(){

		JPanel jp = new JPanel();

		count = 10;
        l.setText(Integer.toString(count));
		   time.schedule(new set(), 5000l, 1000l);
		   jp.add(l);
add(jp);
	}

	class set extends TimerTask{

	public void run(){
		 if (count > 0) {
             count --;
             l.setText(Integer.toString(count));
         } else {
             time.cancel();
         }

	}
}
}