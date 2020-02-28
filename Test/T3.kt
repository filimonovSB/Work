fun main(args: Array<String>) {
   var str=emptyArray<String>()
   var str2=emptyArray<String>()
   for ( s in args) 
	{
		str=str+s
	}
	str.sort()
	for (i in str) 
	{
	 if (!str2.contains(i))
        	str2+=i;
	}		
	for (i in str2) 
	{
    	 println(i)
	}		
}


