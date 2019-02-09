package rensyu;

public class tokuren89 {
	
	
	/*cd javapro*/
	/*static String name ="すけさん";
	static int lv = 1;
	static int hp = 50; //hp
	static int gold = 50;

	gameseisaku(){

	}

	gameseisaku(String name,int lv, int hp, int gold){
	this.name = name;
	this.lv = lv;
	this.hp = hp;
	this.gold = gold;
	}



	public static void main(String[] args)throws java.io.IOException{

	tokuren88.putJousyou();
	putCommand();
	}



	public static void level(){
	if(lv < 40){
	putGameOver();
	}else{
	putGameClear();
	}
	}

	public static void putGameOver(){
		tokuren88.put(name +"は負けてしまった");
	}

	public static void putGameClear(){
		tokuren88.put(name + "は勝った");
	}

	public static void putCommand()throws java.io.IOException{
	if(hp <= 0){
		tokuren88.put("GameOverなんだよなぁ( ##'ω')");
	return;
	}
	tokuren88.put("1.魔王倒す");
	tokuren88.put("2.修行する");
	tokuren88.put("3.宿屋に泊まる");
	inputCommand();

	}


	public static void inputCommand()throws java.io.IOException{
	int c = System.in.read();

	if(c == '1'){
		tokuren88.put("魔王が現れた");
	level();
	}else if(c =='2'){
		tokuren88.syugyou();
	}else if(c == '3'){
		tokuren88.yadoya();
	}else{
		inputCommand();
	}
	}


	}


*/
}
