/*
异常

异常的体系：
----------| Throwable    是所有异常或者错误类的父类  有两个子类 Error  Exception
--------------|Error     错误   错误一般是用于jvm或者是硬件引发的问题，所以我们一般不会通过代码去处理错误的。
--------------|Exception 异常   是需要通过代码去处理的。

如何区分错误与异常呢：
	如果程序出现了不正常的信息，如果不正常的信息的类名是以Error结尾的，那么肯定是一个错误。
	如果是以Exception结尾的，那么肯定就是一个异常。


Throwable常用的方法：
	toString()  返回当前异常对象的完整类名+病态信息。
	getMessage() 返回的是创建Throwable传入的字符串信息。
	printStackTrace() 打印异常的栈信息。

*/

class Demo6 
{
	public static void main(String[] args) 
	{
		
		//创建了一个Throwable对象。
		Throwable t = new Throwable("头晕，感冒..");
		String info = t.toString();
		String message = t.getMessage();
		System.out.println("toString: "+ info);  // java.lang.Throwable  包名+类名 = 完整类名
		System.out.println("message: "+ message);
		
		test();
	}

	public static void test(){
		//
		Throwable t = new Throwable();
		t.printStackTrace();
	}
}
