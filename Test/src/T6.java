import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str="";
		String[] result;
		if(args.length>0)
		{
			for (String s : args) 
			{
				str=str+s+" ";
			}
			
		}
		else
		{
			
			str = in.nextLine();
		}
		result=str.split(" ");
		Arrays.sort(result);
		Map<String,Integer> word_count = new HashMap<String,Integer >();
		for(String i:result)
		{
			//for(Object)
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
