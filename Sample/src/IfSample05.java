
public class IfSample05 {

	public static void main(String[] args){
		
		int scoreSansu = 80;
		int scoreKokugo = 80;
		
		if(scoreSansu >=60 && scoreKokugo >=60){
			System.out.println("合格してます！");
		}else if(scoreSansu >= 60 || scoreKokugo >=60){
			System.out.println("算数か国語どちらか赤点");
		}else{
			System.out.println("赤点です。補講に来なさい");
		}
	}
}
