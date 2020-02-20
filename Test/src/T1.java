

public class T1 {

	public static void main(String[] args) {
		
		String str="";
		for (String s : args) 
		{
			str=str+s+" ";
		}
		String[] result=str.split(" ");
		for(String i:result)
		{
			System.out.println(i);
		}
	}
	
}
