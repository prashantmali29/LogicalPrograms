
public interface DefaultMethod {

	default public String display(){
		System.out.println("inside display");
		return "hello";
	}
	
	default public String show(){
		System.out.println("inside show");
		return "show";
	}
	
	static void disp(){
		System.out.println("inside static disp");
	}
}
