fun main(args: Array<String>) {
   var str=emptyArray<String>()
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
	for ( (key,value) in MapStr) 
		println("$key $value")
}


