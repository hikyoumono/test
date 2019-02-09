package EconomicBomb;

public class MreniamPlan {

	public static void main(String[] args) {

System.out.println(1);
		int sum =0;
		for(int i=1;true;i++){
			sum = 0;
			for(int h=1; h<=i; h++){
				 if(i % h==0){
				 sum++;
				 }
			}
			if(sum == 2){
				System.out.println(i);

				 }


	}
		}
		}

