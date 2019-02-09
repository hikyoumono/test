package test;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class JavaLesson7_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		BigDecimal num1 = new BigDecimal("0.7");
		BigDecimal num2 = new BigDecimal("0.11");
		BigDecimal result = num1.add(num2);
		System.out.println("足し算の結果" + result);
		
		result = num1.subtract(num2);
		System.out.println("引き算の結果" + result);
		
		result = num1.multiply(num2);
		System.out.println("掛け算の結果" + result);
		
		result = num1.divide(num2,1,RoundingMode.HALF_UP);
		System.out.println("割り算の結果" + result);
		
		result = num1.remainder(num2);
		System.out.println("余剰の結果" + result);

	}

}
