
public class IfSample04 {
	
	public static void main(String[] args){
		
		int score =59;
		if(score >=60 && score <=79){
			System.out.println("合格してます！");
		}else if(score >=80 && score <= 99){
			System.out.println("よくできました");
		}else if(score ==100){
			System.out.println("満点です");
		}else{
			System.out.println("赤点です補講に来なさい");
		}
	}

}
