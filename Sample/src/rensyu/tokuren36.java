package rensyu;

import java.io.FileWriter;  //ファイルに書き込む処理
import java.io.IOException; //メソッドの横についている
import java.io.Writer;      //FileWriterとセット

public class tokuren36 {

	public static void main(String[] args) throws IOException {
		
		String file = "test01.txt";
		Writer out = new FileWriter(file);
		
		out.write("test");
		out.write("だよ");
		out.close();
		System.out.println("ファイル処理終了");

	}

}
