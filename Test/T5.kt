fun main(args: Array<String>) {
   var str=emptyArray<String>()
 	var a=emptyArray<words>()
  	val MapStr= mutableMapOf("" to 0)
  	for ( s in args) 
	{
		str=str+s;
	}
	str.sort()
	for (i in str) 
	{
    	if(MapStr.containsKey(i))
    		MapStr+=i to MapStr.getValue(i)+1
    	else
   			MapStr.put(i,1)
	}	
	MapStr.remove("")
	for (i in MapStr)
		a+=words(i.key,i.value)
	for ( r in 1..(a.size-1)) 
		{

			for ( j in 0..(a.size-1-r) )
				if(a[j].count < a[j+1].count)
				{
					var temp=a[j]
					a[j] = a[j+1];
					a[j+1] = temp;
				}

		}
	for ( i in a) 
		println("${i.word} ${i.count}")

}	
class words(w:String,c:Int)
{
	
	var word:String
	var count:Int
	init{
		word=w
		count=c
	}


}
