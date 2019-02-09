package EconomicBomb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MainPart {

	public static void main(String[] args) throws IOException{
		
		try{
		File kensaku = new File("C:\\Users\\Owner\\Downloads\\indices_I101.csv");
		//eclipseではバックスラッシュ（￥）が2ついることがある
		FileReader yomikomi = new FileReader(kensaku);
		BufferedReader ukewatasi = new BufferedReader(yomikomi);
		
		//読み込み箇所　今回は最後までスキャン
		String line ="";
		while ((line = ukewatasi.readLine()) != null){
			
		//1行のデータの要素に分割
		StringTokenizer bunkatu = new StringTokenizer(line, ",");
		while (bunkatu.hasMoreTokens()){
			
			System.out.println(bunkatu.nextToken() + "\t");
		}
		System.out.println("**********");
		System.out.println();
		}
		ukewatasi.close();
	}catch(IOException ex){
		//エラー時の動き
		ex.printStackTrace();
		
	}
	}

}
