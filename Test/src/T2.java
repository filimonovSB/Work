import java.util.Arrays;

public class T2 {

	public static void main(String[] args) {
		String str="";
		for (String s : args) {
           	str=str+s+" ";
        }
		String[] result=str.split(" ");
		Arrays.sort(result);
		for(String i:result)
		{
			System.out.println(i);
		}
		
	}

}
