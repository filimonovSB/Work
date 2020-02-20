import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class T3 {

	public static void main(String[] args) {
		String str="";
		for (String s : args) 
		{
			str=str+s+" ";
		}
		String[] result=str.split(" ");
		Arrays.sort(result);
		Map<String,Integer> uniq = new HashMap<String,Integer >();
		for(String i:result)
		{
			if(uniq.containsKey(i))
			uniq.put(i,1);			
		}
		for(Map.Entry<String,Integer > item : uniq.entrySet())
		{
			System.out.printf("%s %d \n", item.getKey(), item.getValue());
		}
	}

}
