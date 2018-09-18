package pro;

public class Capsule {

	public static void main(String[] args) {
		//演習
		Person taro = new Person("山田太郎",20);
		System.out.println(taro.name);

		System.out.println(taro.name2);

		taro.setName("プライベイト山田");
		String name2 =taro.getName();
		System.out.println(name2);
	}

}
