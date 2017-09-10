fun main(args:Array<String>){
	println("hello world! kotlin")
	
	println("max of 3 and 5 is " + maxOf1(3,5))
	
	println("max of 3 and 5 is " + maxOf2(3,5))
	
	fortest1()
	println()
	fortest2()
	
	whileTest1()
	
	
	printWhenTest(1);
	
	printWhenTest("hello");
	printWhenTest("haha");
	printWhenTest(100L);
	printWhenTest(1.2);
	
	
	rangetest(0)
	rangetest(1)
	rangetest(5)
	rangetest(10)
	rangetest(100)
}


fun printWhenTest(obj:Any):Unit{
	println("whenTest $obj result is ${whenTest(obj)}")
}

//if 语句
fun maxOf1(a :Int,b:Int) = if(a > b) a else b

fun maxOf2(a :Int,b:Int) :Int{
	if(a > b)
		return a
	 else
		return b
}

//for循环
fun fortest1() : Unit{
	val items = listOf("goolge","apple","microsoft")
	for(item in items){
		
		print(item+"  ")
	}
}


fun fortest2() : Unit{
	val items = listOf("goolge","apple","microsoft")
	for(index in items.indices){
		
		println("item at $index is ${items[index]}" )
		
	}
}

fun whileTest1() :Unit{
	
	val items = listOf("goolge","apple","microsoft");
	
	var index = 0;
	
	while(index < items.size){
		
		println("item at $index is-----> ${items[index]}")
		
		index++
	}
	
}

//when 表达式
fun whenTest(obj :Any):String = when(obj){
	1           -> "one"
	"hello"     ->"hello"
	is Long     ->"Long"
	!is String  ->"Not a String"
	else        ->"unknown"  
}

//区间
fun rangetest(a :Int): Unit{
	val b = 9
	if(a in 1..b+1){
		println("$a is in 1 and ${b + 1}")
	}else{
		println("$a is not in 1 and ${b + 1}")
	}
}




























