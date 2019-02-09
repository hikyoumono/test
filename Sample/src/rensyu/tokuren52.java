package rensyu;

public class tokuren52 {

	public static void main(String[] args) {
		for (int i = 0; /* 0から始める */i < 5; /* 5回繰り返し */ i++/* 繰り返しの回数を数える */) {
			System.out.println("i = " + i);
		}
		for (int m = 0; m < 5; m++) {
			System.out.println(m);
			if (m == 2) {
				System.out.println("離脱");
				break;
			}
		}
		System.out.println();

		for (int t = 0; t < 5; t++) {
			if (t == 2)
				break;
			System.out.println(t);
		}
			
			System.out.println();
		
			for(int abc = 0; abc < 5; abc++){
				if(abc == 2) continue;
				System.out.println(abc);
			}
	}
}
