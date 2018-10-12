
public class ReverseArray {

	public static int[] reverse(int[] array){
		int j = array.length;
		for(int i =0; i< array.length/2; i++){
		 int temp = array[i];
		 array[i] = array[j-1-i];
		 array[j-1-i] = temp;
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		int []array = {1,2,3,4,5,6,7};
		array = reverse(array);
		for(int i =0; i< array.length; i++){
			System.out.println(array[i]);
		}
	}
}
