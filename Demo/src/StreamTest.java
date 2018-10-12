import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public class StreamTest {
	
	static int  counter;
	static void  wasCalled(){
		counter++;	
	}

	public static void main(String[] args) {
		
		
		
		
		
		/*List<String> list = Arrays.asList("abc1", "abe3", "abd3");
		List<String> list1 = list.stream().skip(1)
		  .map(element -> element.substring(0, 3)).sorted().collect(Collectors.toList());
		
		List<String> list2 = list.stream().skip(1)
				 .collect(Collectors.toList());
		for(String st :list2){
			System.out.println(st);
		}*/
		
		List<String> list = Arrays.asList("abc1", "abe3", "abd3");
		counter = 0;
		Stream<String> stream = list.stream().filter(element -> {
		    wasCalled();
		    return element.contains("2");
		});
		
		System.out.println(counter);
		
		int  count = (int) list.stream().filter(element -> {
		    return element.contains("2");
		}).count();
	
		list.forEach(System.out ::println);
		System.out.println(count);
	}
}
