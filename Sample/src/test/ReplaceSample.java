package test;

public class ReplaceSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String str = "100＄";
		String sub = str.replaceAll("＄","円");
		System.out.println(sub);

	}

}
