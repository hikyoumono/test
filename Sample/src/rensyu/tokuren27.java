

//HashMap
package rensyu;

import java.util.HashMap;//セットでグループを作っていくスタイル
                          //二人一組になって～みたいな

public class tokuren27 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		//Hashmap<型,型> 名前 = new HashMap<型,型>();
		hm.put("GK", "中村");
		hm.put("DF", "岩波");
		hm.put("MF", "南野");
		hm.put("FW", "浅野");
		
		String member = hm.get("FW");
		System.out.println(member);
		
		int size = hm.size();
		System.out.println(size);
		
		//keySetはHashMap特別
		for(String key : hm.keySet()){
			String value = hm.get(key);
			System.out.println(key + ":" + value);
		}
	}

}