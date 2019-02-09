package pro;

public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//(演習1)
		Person taro = new Person();
		taro.name="太郎";
		taro.talk();
		taro.walk();
		taro.run();

		Robot ai = new Robot();
		ai.name="aibo";
		ai.talk();
		Robot as = new Robot();
		as.name="asimo";
		as.walk();
		Robot pe = new Robot();
		pe.name="pepper";
		pe.run();
		System.out.println();

		//(演習2)
		Person tarou = new Person();
		taro.name="tarou";
		taro.age=18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println();

		Person saburo = new Person("name");
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		Person whoareyou = new Person(25);
		System.out.println(whoareyou.name);
		System.out.println(whoareyou.age);

		Person hanako = new Person("hanako",17);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}

}
