package rensyu;
import java.io.IOException;
public class tokuren92 {
	tokuren92(){

	}



	public static void main(String[] args)throws IOException{

	tokuren88.putJousyou();
	putCommand();
	}


	public static void level(){
	if(gameseisaku.lv < 40){
	putGameOver();
	}else{
	putGameClear();
	}
	}

	public static void putGameOver(){
	tokuren88.put(gameseisaku.name +"は負けてしまった");
	}

	public static void putGameClear(){
		tokuren88.put(gameseisaku.name + "は勝った");
	}

	public static void putCommand()throws IOException{
	if(gameseisaku.hp <= 0){
		System.out.println("GameOverなんだよなぁ( ##'ω')");
return;//コマンドラインを抜ける処理
	}
	System.out.println("1.魔王倒す");
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



