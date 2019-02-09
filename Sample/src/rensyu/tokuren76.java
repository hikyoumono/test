package rensyu;

public class tokuren76 {

/*cd javapro*/
static String name ="すけさん";
static int lv = 1;
static int hp = 50; //hp
static int gold = 50;

public static void main(String[] args)throws java.io.IOException{

putJousyou();
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
put(name +"は負けてしまった");
}

public static void putGameClear(){
put(name + "は勝った");
}

public static void putCommand()throws java.io.IOException{
if(hp <= 0){
put("GameOverなんだよなぁ( ##'ω')");
return;
}
put("1.魔王倒す");
put("2.修行する");
put("3.宿屋に泊まる");
inputCommand();

}


public static void inputCommand()throws java.io.IOException{
int c = System.in.read();

if(c == '1'){
put("魔王が現れた");
level();
}else if(c =='2'){
java.util.Random  r = new java.util.Random();
int               d = r.nextInt(15);


lv += 25;
hp -= d;
put(name + "は" + d + "ポイントのダメージを受けた");
put("レベルが" + lv + "になった");
put("レベルが上がったのでhpが" + hp + "になった");
put("残りhp"+ hp);
putCommand();
}else if(c == '3'){
yadoya();
}else{
inputCommand();
}
}

public static void putJousyou(){
put("魔王と出会ったったww");
status();
}

public static void status(){
put("------------------------------");
System.out.println("  name " + " Lv " + lv + "  HP " + hp + " " + gold + "G");
put("------------------------------");
}

public static void yadoya()throws java.io.IOException{
System.out.println("宿屋に泊まる");
gold -=5;
hp = lv * 2;
System.out.println("レベル" + lv);
System.out.println("残りhp"+ hp);
putCommand();
}

public static void put(String str){
System.out.println(str);
}

}



