fun main(args:Array<String>){
	
	println("sum of 3 and 5 is " + sum(3,5));
	
	println("autosum of 3 and 5 is " + autoSum(3,5));
	
	
	unitSum(3,5)
	
	
	//һ�θ�ֵ��ֻ�����ľֲ�����
	
	val a:Int = 1;//������ֵ
	
	val b =2//�Զ��ƶϳ���Int������
	
	val c:Int//���û�и���ʼֵ���Ͳ���ʡ��
	
	c = 3//��ȷ��ֵ
	
	println("һ���Ը�ֵ���� a=" + a  +",b = " + b +",c = " + c);
	
	//�ɱ����
	
	var x = 5
	
	x +=1
	
	println("�ɱ���� x = " + (++x));
	
	
	str(3,5);
	
	
	println("max of 3 and 5 is " + maxOf(3,5));
	
	println(getStrLen(5))
}

//�������� Int ���������� Int �ĺ���
fun sum(a:Int,b:Int) :Int{
	return a + b;
}

//�����ʽ��Ϊ�����塢����ֵ�����Զ��ƶϵĺ�����
fun autoSum(a:Int,b:Int) = a+b;

fun unitSum(a:Int,b:Int){
	println("sum of $a and $b is ${a + b}")
}


//�ַ���ģ��
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


//�������

fun maxOf(a:Int,b:Int) :Int{
	if(a > b){
		return a;
	}
	return b;
}

//ʹ�ÿɿ�ֵ�� null ���
//��ĳ��������ֵ����Ϊ null ��ʱ�򣬱����������������ͺ���� ? ����ʶ�����ÿ�Ϊ�ա�
fun getStrLen(obj:Any):Int?{
	
	if(obj is String){
		return obj.length
	}
	
	// jajaja
	return null;
}



