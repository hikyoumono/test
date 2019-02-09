package rensyu;

import java.util.ArrayList;

public class tokuren25 {

	public static void main(String[] args) {
		
		
		//<>でまとめてキャストしていくスタイル
		ArrayList<String> yaju = new ArrayList<String>();
		yaju.add("ソノウタウン");
		yaju.add("ミオシティー");
		yaju.add("シダケタウン");
		yaju.add("ナギサシティー");
		yaju.add("ルネシティー");
		
		String place = yaju.get(2);
		System.out.println(place);
		
		int listCount = yaju.size();
		System.out.println(listCount);
		
		System.out.println("ループここから");
		
		for(int i = 0; i < yaju.size(); i++){
			String placeList = yaju.get(i);
			System.out.println(placeList);
		}

	}

}
