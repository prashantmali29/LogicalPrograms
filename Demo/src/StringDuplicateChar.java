import java.util.HashMap;
import java.util.Set;


public class StringDuplicateChar {

	public static void main(String[] args) {
		duplicateString("abcde bfcj Abcde");
	}

	private static void duplicateString(String str) {
		String[] chars = str.split(" ");
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(String str1 : chars){
			for(int i=0; i< str1.length()-1; i++){
				if(map.containsKey(str1.charAt(i))){
					map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
				}else{
					map.put(str1.charAt(i), 1);
				}
			}
		}
		Set<Character> word = map.keySet();
		for(Character str2 : word){
			if(map.get(str2) > 1){
				System.out.println(str2+" : "+map.get(str2));
			}
		}


	}
}
