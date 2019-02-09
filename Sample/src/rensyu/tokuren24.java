

package rensyu;

//ArrayList
//順番に並んだデータのこと

import java.util.ArrayList;

public class tokuren24 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("アイルランド");
		al.add("スペイン");
		al.add("ナポリ(笑)");
		al.add("リスボン");
		al.add("ヨセミテ国立公園");
		
		//データを取得　後、ArrayListはcastするの忘れない
		String place = (String)al.get(2);
		System.out.println(place);
		
		System.out.println("ループはここから");
		//全部出力
		for(int i = 0; i < al.size(); i++){
			String placeList = (String)al.get(i);
			System.out.println(placeList);
			//al.size()はalクラスの全部という意味
		}
	}

}
