
public class String2 {

	public static void main(String[] args) {
		String str="alaayysssssksass";
	    String[] splitString=str.split("");
	    int count=1;
	    String finalString="";
	    for(int i=0;i<= str.length()-1;i++)
	        {
	            if( i !=str.length()-1 && splitString[i].equals(splitString[i+1]))
	            {
	                ++count;

	            }
	            else
	            {
	                if(count != 1){
	                finalString+=splitString[i]+count;
	                }else{
	                finalString+=splitString[i]	;
	                }
	                count=1;
	            }   

	        }
	    System.out.println(finalString);}
	}

