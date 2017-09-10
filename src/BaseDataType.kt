fun main(args: Array<String>) {
	println("haha");
	testDataType1()
}


//Type   Bit width
//Double   64
//Float    32
//Long     64
//Int      32
//Short    16
//Byte      8

//数值常量字⾯值有以下⼏种:
//⼗进制: 123
//Long 类型⽤⼤写 L 标记: 123L
//⼗六进制: 0x0F
//⼆进制: 0b00001011
//注意: 不⽀持⼋进制
//Kotlin 同样⽀持浮点数的常规表⽰⽅法:
//默认 double：123.5 、123.5e10
//Float ⽤ f 或者 F 标记: 123.5f

//你可以使⽤下划线使数字常量更易读：
//val oneMillion = 1_000_000
//val creditCardNumber = 1234_5678_9012_3456L
//val socialSecurityNumber = 999_99_9999L
//val hexBytes = 0xFF_EC_DE_5E
//val bytes = 0b11010010_01101001_10010100_10010010
fun testDataType1() {
	val oneMillion = 1_000_000
	val creditCardNumber = 1234_5678_9012_3456L
	val hexBytes = 0xFF_EC_DE_5E

	printO(oneMillion);
	printO(creditCardNumber);
	printO(hexBytes);


	val a: Int = 100
	
	printO("a === a: ${a === a}")
	
	printO("a == a: ${a == a}")
	
	val boxedA : Int? = a
	
	val anthorBoxedA :Int? = a
	
	val b :Int = 100
	
	printO("a === b: ${a === b}")
	
	printO("a == b: ${a == b}")
	
	printO("boxedA === anthorBoxedA:${boxedA === anthorBoxedA}")
	
	printO("boxedA == anthorBoxedA:${boxedA == anthorBoxedA}")
	
	testDataType2()
}


//每个数字类型⽀持如下的转换:
//toByte(): Byte
//toShort(): Short
//toInt(): Int
//toLong(): Long
//toFloat(): Float
//toDouble(): Double
//toChar(): Char
fun testDataType2(){
	val a:Int? = 1
	//由于不同的表⽰⽅式，较⼩类型并不是较⼤类型的⼦类型。
	//val b :Long=a 报错
	val c :Byte = 1
	//val d : Int  = c 报错
	
	//我们可以显式转换来拓宽数字
	
	val d :Int = c.toInt();
	
	printO(d)
	
	//缺乏隐式类型转换并不显著，因为类型会从上下⽂推断出来，⽽算术运算会有重载做适当转换
	val l = 1L + 3
	
	printO(l)


//这是完整的位运算列表（只⽤于 Int 和 Long ）：
//shl(bits) ‒ 有符号左移 (Java 的 << )
//shr(bits) ‒ 有符号右移 (Java 的 >> )
//ushr(bits) ‒ ⽆符号右移 (Java 的 >>> )
//and(bits) ‒ 位与
//or(bits) ‒ 位或
//xor(bits) ‒ 位异或
//inv() ‒ 位⾮

	val x = (1 shl 2) and 0x000FF000

	printO(x)
	
	
	//字符⽤ Char 类型表⽰。它们不能直接当作数字
	
	//val char : Char  = 1; 报错
	
	//字符字⾯值⽤单引号括起来: '1' 。 特殊字符可以⽤反斜杠转义。 ⽀持这⼏个转义序列：\t 、 \b 、\n 、\r 、\' 、\" 、\\ 和 \$ 。 编码其他字符要⽤
//Unicode 转义序列语法：'\uFF00'
	
	val char : Char = '1'
	
	printO(char)
	
	val char2 : Char = 'a'
	printO(char2)
	printO(char2.toInt())
}

//我们可以显式把字符转换为 Int 数字

fun decimalDigitValue(c:Char) : Int{
	if(c !in '0'..'9'){
		throw IllegalArgumentException("out of range");
	}
	
	return c.toInt() 
}




fun printO(obj: Any) {
	println(obj)
}













