import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDemo {
 
	public static void main(String[] args) {
		
		Stream<Integer> streamInt = Stream.of(1,2,4,5,7,8,9,10,11,13);
		List<Integer> list = streamInt.collect(Collectors.toList());
		System.out.println(list);
		
		streamInt = Stream.of(1,2,4,5,7,8,9,10,11,13);
		Map<Integer, Integer> map = streamInt.collect(Collectors.toMap(i -> i, i -> i+1));
		System.out.println(map);
		
		streamInt = Stream.of(1,2,4,5,7,8,9,10,11,13);
		boolean is =streamInt.anyMatch(i -> i==1);
		System.out.println(is);
		
		streamInt = Stream.of(1,2,4,5,7,8,9,10,11,13);
		List<Integer> list1 = streamInt.filter(i -> i >10).collect(Collectors.toList());
		list1.forEach(p -> System.out.println(p+ ""));
		
		
	}
}
