package rensyu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader; //ファイルを読み込む　FileWriterの逆
import java.io.IOException; //なんかファイル使うときついてくる(´;ω;｀)

public class tokuren37 {

	public static void main(String[] args) throws IOException {

		File filePath = new File("test01.txt");
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();

		while (str != null) {
			System.out.println(str);
			str = br.readLine();
		}
		br.close();

	}

}
