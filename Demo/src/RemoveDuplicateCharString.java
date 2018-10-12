import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class RemoveDuplicateCharString {

	public static void main(String[] args) {
		String str = "ABC CDE ABC EFGH";
		String []strArray = str.split(" ");
		Map<String, Integer>  map = new HashMap<String, Integer>();
		
		
		for(int i=0; i<strArray.length; i++){
			if(!map.containsKey(strArray[i])){
				map.put(strArray[i], 1);
			}else{
				map.put(strArray[i], map.get(strArray[i])+1);
			}
		}
		Set<String> word = map.keySet();
		for(String str1 : word){
			if(map.get(str1) > 1){
			   System.out.println("Duplicate String found is:"+str1 +" and count is: "+map.get(str1) );
			}
		}
	}
}
