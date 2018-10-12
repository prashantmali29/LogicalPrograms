import java.util.LinkedList;


public class TestLinkedList {

	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("ABC");
		list.add("ABC1");
		list.add("ABC2");
		list.add("ABC4");
		
		list.get(0);
		System.out.println(list.get(0));
		System.out.println(list.offer("123"));
	}
}
