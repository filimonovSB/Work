fun main(args: Array<String>) {
   var str=emptyArray<String>()
   	for ( s in args) 
	{
		str=str+s
	}
	str.sort()
			
	for (i in str) 
	{
    		println(i)
	}		
}


