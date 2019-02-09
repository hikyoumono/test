package rensyu;

public class tokuren53 {

	public static void main(String[] args) {
		//拡張for文
		int[] array = {10,20,30,40,50};

		for(int i:array){
			System.out.println("array表示" + i);
		}

		for(int y = 1;y < 10;y++){
			for(int x = 1;x < 10; x++){
				System.out.print(y * x + "\t");

			}
			System.out.println();
		}
		
		
		System.out.println();
		for(int y = 1;y < 10;y++){
			for(int i = 1;i < 100;i++){
				System.out.print(y * i + "\t");

			}
			System.out.println();
		}

	}

}
