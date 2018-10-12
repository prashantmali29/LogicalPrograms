



public class Test {
	
	public   String s1 = "ABC";
	
	public static int i = 2;
	
	public  int i1 = 2;
	
	Test (){
		i = i +1;
		i1 = i1 +1;
	}
	
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		Test t4 = new Test();
		//t4.disp("S");
	}
	
	
	public void disp(String s){
	  System.out.println("");
	}
	
}
