
public class StringReverse {

	
	public static void main(String[] args) {
		
		String demo = "ABCDEF";
		
		String reverse = "";
		
		for(int i = demo.length()-1; i>=0; i--){
			reverse = reverse + demo.charAt(i);
		}
		
		System.out.println(reverse);
		
		
		String demo1 = "PQRST";
		String reverse1 = "";
		
		char[] charArray = demo1.toCharArray();
		
		for(int i = demo1.length()-1; i>=0; i--){
			reverse1 = reverse1 +charArray[i];
		}
		
		System.out.println(reverse1);
	}
}
