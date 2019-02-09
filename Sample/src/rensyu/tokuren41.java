package rensyu;

public class tokuren41 {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 20;
		method1(num1, num2);

		int result;
		result = method2(num1, num2);
		System.out.println(result + "method2");

	}

	public static void method1(int num1, int num2) {
		int result2 = num1 + num2;
		System.out.println(result2);
		int result3 = result2 + 540;
		System.out.println(result3 + "method1");
	}

	public static int method2(int num1, int num2) {
		int result = num1 + 1 + num2;
		return result;

	}

}
