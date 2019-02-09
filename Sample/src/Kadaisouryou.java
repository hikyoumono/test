
public class Kadaisouryou {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int juryou = 5;
				
		if(juryou >=10){
			System.out.println("1200円");
		}else if(juryou >=5 && juryou<10){
			System.out.println("900円");
		}else if(juryou >= 3 && juryou <5){
			System.out.println("500円");
		}else if(juryou >= 1 && juryou <3){
			System.out.println("400円");
		}else if(juryou >=0 && juryou <1){
		    System.out.println("250円");
		}else{
			System.out.println("入力データエラーです");
		}

	}

}
