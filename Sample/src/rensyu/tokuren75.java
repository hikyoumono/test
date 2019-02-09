package rensyu;
import java.util.Scanner;

public class tokuren75{

static String name = "hikyoumono";
static int keikenti =0;
static int level =1;
static String a;


public static void main(String[] args)throws java.io.IOException{

atack();
System.out.println(a);
if(a == "0"){
maousen();


}else if(a == "1"){
System.out.println("修業を始めた");
keikenti += 50;
if(keikenti == 300){
lvup();
}else if(keikenti >= 200){
lvup();
level +=50;
}else if(keikenti >= 80){
lvup();
level +=50;
}else if(keikenti >= 70){
lvup();
level +=30;
}else if(keikenti == 0){
level +=1;
}
}
else{
System.out.println("エラー");
}

System.out.println("レベルは" + level + "です");
}

public static void lvup(){
System.out.println("レベルが上がった");
}

public static void atack()throws java.io.IOException{
	Scanner c = new Scanner(System.in);
System.out.println("1.魔王を倒しに行く");
System.out.println("2.修行する");
String a = c.next();
}


public static void maousen(){
if(level >= 30){
System.out.println(name + "魔王を倒した");
}else if(level < 30){
System.out.println("負けてしまった(´;ω;｀)");
}

}


}


