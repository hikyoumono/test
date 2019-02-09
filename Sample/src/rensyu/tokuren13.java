package rensyu;

public class tokuren13 {
	public String employeename;
	public String divisionname;
	public int vitality;

	public void introduce() {
		vitality = vitality - 10;
		System.out.println("私の名前は" + employeename + "です");
		System.out.println("私の部署は" + divisionname + "です");

	}
	public void greeting(){
		vitality = vitality - 10;
		System.out.println("おはよう");
	}
	public void report(){
		vitality = vitality - 10;
		System.out.println("仕事した");
	}

}
