
public interface DeafaultMethod1 {
	
	default public String display(){
		System.out.println("inside display");
		return "hello";
	}
}
