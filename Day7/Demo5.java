/*

构造函数：


构造函数的作用： 初始化对应的对象。

构造函数的格式：
	
	修饰符  函数名(形式参数){
		函数体
	}

构造函数要注意的事项：
	1. 构造函数是没有返回值类型的。
	2. 构造函数的函数名是必须与类名一致。
	3. 构造函数不是由我们手动调用的，是我们在创建了对应的对象时，jvm会根据你创建的对象传递的参数调用
	对应 的对象。
	4. 如果一个类没有显示写上一个构造函数的时候，那么java编译器会为该类添加一个无参 的构造函数。
	5. 如果一个类已经显示写上一个构造函数的时候,那么java编译器则不会再为该类添加一个无参 的构造函数。
	6. 构造函数是可以以函数重载的形式存在多个。

构造代码块：

构造代码块的作用：给对象进行统一的初始化。

构造代码块 的格式：
		{
			代码；
		}

构造代码块是在创建了代码块所属类的对象时调用一次。


this关键字：

this关键字代表了所属函数的调用者对象。

this关键字的作用：
	1.  一个类中存在同名的成员变量与局部变量时，在方法的内部默认是访问局部 变量的，可以通过this关键字指定访问成员变量 的数据。
	2.  this关键字还可以在构造函数中调用另外一个构造函数初始化对象，

this关键字调用构造函数要注意的事项：
	1. this关键字调用其他 的构造函数时，必须要是在第一个语句。
	2. this关键字调用构造函数时不能出现相互调用，因为是一个死循环。	
	3. 如果在方法的内部访问一个变量时，该变量只存在于成员变量中，局部没有没有，这时候java编译器会为该变量的前面添加this关键字。

static（静态、修饰符）
	

	static修饰成员变量时：static修饰成员变量时,那么该成员变量的数据就是一个共享的数据.
	
		静态成员变量的访问方式：
			
				方式一： 使用对象进行访问。
						对象.属性名
				方式二：可以使用类名进行访问。
						类名.属性名
		注意：
			1. 非静态成员变量不能类名直接访问，只能使用对象进行访问。
			2. 千万不要为了方便访问成员变量而使用static修饰，一定要是该数据是共享数据 时才使用static修饰。

*/


/*static 和C#有点小区别  调用方式有区别*/
class Demo5 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Student stu=new Student();
		//调用方式
		System.out.println(Student.Country);  
	    System.out.println(stu.Country);  //美国
		stu.Country="china";
		System.out.println(stu.Country); //china
		stu.name="liyang";
		stu.goSchool();
        //再次打印 内存中的地址已经指向了china 
        System.out.println(Student.Country);   //china

	}
}

class Student
{
   static String Country="美国";   //静态变量
   String name;
   
   void goSchool(){
      System.out.print("学生"+this.name+this.Country);
   }



}
