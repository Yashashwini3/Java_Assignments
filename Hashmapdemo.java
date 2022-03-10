package p3;

import java.util.HashMap;

public class Hashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "yashashwini";
		System.out.println(s.length());
		
		HashMap<Character,Integer> charCountMap = new HashMap();
		System.out.println(charCountMap);
		char[] ch = s.toCharArray();
		
		for(char c: ch) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			}else {
				charCountMap.put(c, 1);
			}
			
		}
		System.out.println(charCountMap);

	}

}
