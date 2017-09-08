fun main(args:Array<String>){
	
	println("sum of 3 and 5 is " + sum(3,5));
	
	println("autosum of 3 and 5 is " + autoSum(3,5));
	
	
	unitSum(3,5)
	
	
	//一次赋值（只读）的局部变量
	
	val a:Int = 1;//立即赋值
	
	val b =2//自动推断出‘Int’类型
	
	val c:Int//如果没有赋初始值类型不能省略
	
	c = 3//明确赋值
	
	println("一次性赋值变量 a=" + a  +",b = " + b +",c = " + c);
	
	//可变变量
	
	var x = 5
	
	x +=1
	
	println("可变变量 x = " + (++x));
	
	
	str(3,5);
	
	
	println("max of 3 and 5 is " + maxOf(3,5));
	
	println(getStrLen(5))
}

//带有两个 Int 参数、返回 Int 的函数
fun sum(a:Int,b:Int) :Int{
	return a + b;
}

//将表达式作为函数体、返回值类型自动推断的函数：
fun autoSum(a:Int,b:Int) = a+b;

fun unitSum(a:Int,b:Int){
	println("sum of $a and $b is ${a + b}")
}


//字符串模板
fun str(a:Int,b:Int):Unit{
	var x = a;
	
	var s1 = "x is $a"
	
	var y = b;
	
	var s2 = "a + b is ${x + y}"
	
	println(s1);
	
	x = b;
	

	var s3 = "${s1.replace("is","was")},but now is $x"
		
	println(s2);
	
	println(s3);
	
}


//条件语句

fun maxOf(a:Int,b:Int) :Int{
	if(a > b){
		return a;
	}
	return b;
}

//使用可空值及 null 检测
//当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引用可为空。
fun getStrLen(obj:Any):Int?{
	
	if(obj is String){
		return obj.length
	}
	
	// jajaja
	return null;
}



