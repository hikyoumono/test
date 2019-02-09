
public class sample05 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 10;
		sumMethod1(num1, num2);

		int result;
		result = sumMethod2(num1, num2);
		System.out.println(result + "method2");
	}

	public static void sumMethod1(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result + "method1");
	}

	public static int sumMethod2(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}