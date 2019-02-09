package rensyu;

import java.util.ArrayList;
import java.util.Iterator;

public class tokuren26 {

	public static void main(String[] args) {
		
		ArrayList<String> ikitai = new ArrayList<String>();
		ikitai.add("イタリア");
		ikitai.add("カナダ");
		ikitai.add("台湾");
		
		String place = ikitai.get(2);
		System.out.println(place);
		
		int placeAll = ikitai.size();
		System.out.println(placeAll);
		
		System.out.println("ループここから");
		
		for(int i = 0; i < ikitai.size(); i++){
			String placeList = ikitai.get(i);
			System.out.println(placeList);
		}
			//.sort(null)で並び替え
		ikitai.sort(null);
		for(int c = 0; c < ikitai.size(); c++){
			String placeC = ikitai.get(c);
			System.out.println(placeC);
		}
		System.out.println();
		
		
		
		//拡張for文
		   //かなり便利だと思う
			for(String place3 : ikitai){
				System.out.println(place3);
		}
			
			System.out.println("イテレーターiterator");
			Iterator<String> it = ikitai.iterator();
			
			while(it.hasNext()){
				String place3 = it.next();
				System.out.println(place3);
			}
	}
	
	
	
	
	

}
