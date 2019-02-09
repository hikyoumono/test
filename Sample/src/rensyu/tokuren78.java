package rensyu;




public class tokuren78{


tokuren78(){

}


public static void putJousyou(){
put("魔王と出会ったったww");
status();
}

public static void status(){

put("------------------------------");
System.out.println("  name " + tokuren77.name + " Lv " + tokuren77.lv + "  HP " + tokuren77.hp + " " + tokuren77.gold + "G");
put("------------------------------");
}

public static void yadoya()throws java.io.IOException{
System.out.println("宿屋に泊まる");
tokuren77.gold -=5;
tokuren77.hp = tokuren77.lv * 2;
System.out.println("レベル" + tokuren77.lv);
System.out.println("残りhp"+ tokuren77.hp);
tokuren77.putCommand();
}




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

tokuren77.lv += d;
int d2 = (int)(d * 1.75);
tokuren77.hp -= d2;
put(tokuren77.name + "は" + d2 + "ポイントのダメージを受けた");
put("レベルが" + tokuren77.lv + "になった");
put("レベルが上がったのでhpが" + tokuren77.hp + "になった");
put("残りhp"+ tokuren77.hp);
tokuren77.putCommand();
}

}



