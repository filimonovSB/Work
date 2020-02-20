import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class T4 {

	public static void main(String[] args) {
		String str="";
		for (String s : args) 
		{
			str=str+s+" ";
		}
		String[] result=str.split(" ");
		Arrays.sort(result);
		Map<String,Integer> word_count = new HashMap<String,Integer >();
		for(String i:result)
		{
			if(word_count.containsKey(i))
				{int temp=word_count.get(i);
				 temp++;
				 word_count.put(i, temp);
				}
			else
				
				word_count.put(i,1);
			
		}
		for(Map.Entry<String,Integer > item : word_count.entrySet()){
	        
	           System.out.printf("%s %d \n", item.getKey(), item.getValue());
	       }
		
	}

}
