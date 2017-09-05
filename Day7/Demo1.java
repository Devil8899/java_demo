
/*
java是 面向对象的语言： "万物皆对象": 任何事物都可以使用类进行描述。
构造函数的作用： 给对应的对象进行初始化。
构造函数的定义的格式：
	修饰符  函数名(形式参数){
		函数体...
	}

构造函数要注意的细节：
	1. 构造函数 是没有返回值类型的。
	2. 构造函数的函数名必须要与类名一致。
	3. 构造函数并不是由我们手动调用的，而是在创建对应的对象时，jvm就会主动调用到对应的构造函数。
	4. 如果一个类没有显式的写上一个构造方法时，那么java编译器会为该类添加一个无参的构造函数的。
	5. 如果一个类已经显式的写上一个构造方法时,那么java编译器则 不会再为该类添加 一个无参 的构造方法。
	6. 构造函数是 可以在一个类中以函数重载 的形式存在多个 的。


疑问：创建对象时，jvm就会调用到对应的构造方法，那么我们以前没有学构造方法，那么
以前创建对象时，jvm是否 也会调用构造方法呢？如果有？构造方法从何而来呢？
				
			会调用， java编译器在编译的 时候给加上去的。

jdk提供了一个java开发工具(javap.exe)给我们进行反编译的。


javap 反编译工具的使用格式：
		
		javap -c -l -private 类名

疑问： java编译器添加 的无参构造方法的权限修饰符是 什么？
	   与类的权限修饰是一致的。


构造函数与普通 函数的区别：	
	1. 返回值类型的区别：
		1. 构造函数是没有返回值类型 的，
		2. 普通函数是有返回值类型的，即使函数没有返回值，返回值类型也要写上void。
	2. 函数名的区别：
		1. 构造函数的函数名必须要与类名一致，
		2. 普通函数的函数名只要符合标识符的命名规则即可。
	3. 调用方式的区别：
		1. 构造函数是 在创建对象的时候由jvm调用的。
		2. 普通函数是由我们使用对象调用的，一个对象可以对象多次普通 的函数，
	4. 作用上的区别：
		1. 构造函数 的作用用于初始化一个对象。
		2. 普通函数是用于描述一类事物的公共行为的。


*/

class Demo1 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
      Body b=new Body();   //初始化对象  调用无参构造
      Body b1=new Body("1",25); 

	}
}

class Body
{
   String Id;
   int  Age;
   Body () {
    System.out.print("我是无参构造函数，对象初始化时自动调用 \r\n");
   }

   Body(String id,int age){
	 Id=id;
	 Age=age;
     System.out.print("我是有参的构造函数，用户ID="+Id+",用户年纪"+Age);
   }
}
