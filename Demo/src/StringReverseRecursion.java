
public class StringReverseRecursion {

	public static void main(String[] args) {
		String str = "Prashant";
		String reverse = reverseString(str);
		System.out.println(reverse);
	}

	private static String reverseString(String str) {
		if(str.length() == 0 || str == null) return str ;
		else
		return reverseString(str.substring(1))+str.charAt(0);
	}
}
