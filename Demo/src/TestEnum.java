import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class TestEnum {

	public static void main(String[] args) {

		int []array = {1,3,2,5,6,8,};
		int max = 0;
		int location = 0;
		int location1 = 0;
		List<Integer> small =  new ArrayList<Integer>();
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i = 0; i < array.length ; i++){
			if((max == 0) && (array[i] < array[i+1])){
				max = array[i+1];
				location = i+1;
				continue;
			}
			if( max != 0 && max > array[i]){
				small.add(array[i]);
				map.put(i, array[i]);
			}
			if( max != 0 && max < array[i] && small.size() == 0){
				max = array[i];
				location = i;
				continue;
			}
		}

		for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
			location1 = entry.getKey();
			break;
		}

		int temp = array[location];
		array[location] = array[location1];
		array[location1] = temp;
		for(int i = 0; i < array.length ; i++){
			System.out.println(array[i]);
		}
		boolean iSorted = true;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] >array[i + 1]) {
				iSorted = false; // It is proven that the array is not sorted.
			}
		}
		System.out.println(iSorted);
	}
}
