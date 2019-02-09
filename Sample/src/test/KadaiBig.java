package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class KadaiBig {

	// 課題1
	public static void main(String[] args) {
		double seisuu = 121;
		double result = Math.sqrt(seisuu);
		BigDecimal result2 = new BigDecimal(result);
		BigDecimal sisyagonyu = result2.setScale(5, BigDecimal.ROUND_HALF_UP);
		System.out.println(sisyagonyu);
		System.out.println();

		// 課題2
		BigDecimal tate = new BigDecimal(30);
		BigDecimal yoko = new BigDecimal(30);
		BigDecimal result01 = tate.multiply(yoko);
		System.out.println(result01);
		System.out.println();

		// 課題4

		BigDecimal r = new BigDecimal(100);
		BigDecimal menseki = r.multiply(r);
		BigDecimal ensyuritu = new BigDecimal(Math.PI);
		BigDecimal menseki2 = menseki.multiply(ensyuritu);

		BigDecimal en = new BigDecimal(2);
		BigDecimal ensyu = r.multiply(ensyuritu).multiply(en);

		System.out.println(ensyu);
		System.out.println(menseki2);

		// 課題3
		BigDecimal tate1 = new BigDecimal(50);
		BigDecimal yoko1 = new BigDecimal(50);
		BigDecimal menseki02 = keisann(tate1, yoko1);
		BigDecimal nn = menseki02;
		System.out.println(nn);
		System.out.println();
	}

	public static BigDecimal keisann(BigDecimal tate1, BigDecimal yoko1) {
		BigDecimal menseki02 = tate1.multiply(yoko1);
		return menseki02;
	}

}
