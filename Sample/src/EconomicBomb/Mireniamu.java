package EconomicBomb;

public class Mireniamu {
	
	public static int database(int i, int result){
		//データ
		result *= i;
		return result;
		
	}
	
	public static void calc(int i,int result){
		//約数　データの展開
		for(int h=1; h<=result; h++){
			 if(result % h == 0){
			 
			 }
			 }
		
		
		//最大公約数
		int tmp;
		int x =i;
		int y =i;
		while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
            
            
        }

	}

	public static void main(String[] args) {
		
		int result =1;

		System.out.println(1);
		for(int i =2;true;i++){
			if(Math.sqrt(i)*10%10!=0){
				database(i,result);
				calc(i,result);
				System.out.println(i);
			}else{

			}

			}
		}

}


