package rensyu;

public class tokuren88 {


tokuren88(){

}

public static void putJousyou(){
put("魔王と出会ったったww");
status();
}

public static void status(){

put("------------------------------");
put("  name " + gameseisaku.name + " Lv " + gameseisaku.lv + "  HP " + gameseisaku.hp + " " + gameseisaku.gold + "G");
put("------------------------------");
}
//20行目
public static void yadoya()throws java.io.IOException{
put("宿屋に泊まる");
gameseisaku.gold -=5;
gameseisaku.hp = gameseisaku.lv * 2;
put("レベル" + gameseisaku.lv);
put("残りhp"+ gameseisaku.hp);
gameseisaku.putCommand();
}

//30行目


public static void put(String str){
System.out.println(str);
}




public static void syugyou()throws java.io.IOException{
java.util.Random  r = new java.util.Random();
int               d = r.nextInt(15);


int e = r.nextInt(3) + 1;
put("敵が" + e + "匹現れた");
for (int tekinokazu=0;tekinokazu < e;tekinokazu++){
System.out.print("●");
}

gameseisaku.lv += d;
int d2 = (int)(d * 1.75);
gameseisaku.hp -= d2;
put(gameseisaku.name + "は" + d2 + "ポイントのダメージを受けた");
put("レベルが" + gameseisaku.lv + "になった");
put("レベルが上がったのでhpが" + gameseisaku.hp + "になった");
put("残りhp"+ gameseisaku.hp);
gameseisaku.putCommand();
}

}





