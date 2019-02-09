package rensyu;



public class tokuren77 {

/*cd javapro*/
static String name ="すけさん";
static int lv = 1;
static int hp = 50; //hp
static int gold = 50;

tokuren77(){

}

tokuren77(String name,int lv, int hp, int gold){
this.name = name;
this.lv = lv;
this.hp = hp;
this.gold = gold;
}



public static void main(String[] args)throws java.io.IOException{

tokuren78.putJousyou();
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
	tokuren78.put(name +"は負けてしまった");
}

public static void putGameClear(){
	tokuren78.put(name + "は勝った");
}

public static void putCommand()throws java.io.IOException{
if(hp <= 0){
	tokuren78.put("GameOverなんだよなぁ( ##'ω')");
return;
}
tokuren78.put("1.魔王倒す");
tokuren78.put("2.修行する");
tokuren78.put("3.宿屋に泊まる");
inputCommand();

}


public static void inputCommand()throws java.io.IOException{
int c = System.in.read();

if(c == '1'){
	tokuren78.put("魔王が現れた");
level();
}else if(c =='2'){
	tokuren78.syugyou();
}else if(c == '3'){
	tokuren78.yadoya();
}else{
	inputCommand();
}
}


}



