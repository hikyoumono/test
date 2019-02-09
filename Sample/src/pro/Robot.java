package pro;

public class Robot {
public String name;
public void talk(){
	System.out.println(this.name + "は話す");
}
public void walk(){
	System.out.println(this.name + "は歩く");
}
public void run(){
	System.out.println(this.name + "は走る");
}
}
