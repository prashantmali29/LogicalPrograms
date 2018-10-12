import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;




public class Test12{

	public static void main(String[] args) {
		Integer n  =15;
		
		List<String> valueList = new ArrayList<String>();
		
		for(Integer i = 1; i< n; i++){
			for(Integer j = n-1; j > 0; j-- ){
				if( i < j){
					List<Character> list1 = j.toString().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
					if(list1.contains(i.toString())){
						String value =  ""+i+"="+j+"";
						valueList.add(value);
					}
				}
			}
		}
		for(String str :valueList){
			System.out.println(str);
		}
		

}
}
