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
	this.name="���O�Ȃ�";
	this.age=0;
}
public Person(int age,String name){
	this.name="name";
	this.age=age;
}



public Person(){

}

public void talk(){
	System.out.println(this.name + "���b��");
}
public void walk(){
	System.out.println(this.name + "������");
}
public void run(){
	System.out.println(this.name + "������");
}



//�Z�b�^�[�Q�b�^�[
public String getName(){
	return this.name=name;
}
public void setName(String name){
	this.name=name;
}

}
