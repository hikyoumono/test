package pro;

public class Person {
public String name= null;
public int age=0;

private String name2=null;
private int age2 = 0;

public Person(String name,int age){
this.name=name;
this.age=age;
}
public Person(String name){
	this.name=name;
	this.age=0;
}
public Person(int age){
	this.name="名前なし";
	this.age=0;
}
public Person(int age,String name){
	this.name="name";
	this.age=age;
}



public Person(){

}

public void talk(){
	System.out.println(this.name + "が話す");
}
public void walk(){
	System.out.println(this.name + "が歩く");
}
public void run(){
	System.out.println(this.name + "が走る");
}



//セッターゲッター
public String getName(){
	return this.name=name;
}
public void setName(String name){
	this.name=name;
}

}
