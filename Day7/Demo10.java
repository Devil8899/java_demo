/*


instanceof 关键字

instanceof关键字的作用：判断一个对象是否属于指定的类别。

instanceof关键字的使用前提：判断的对象与指定的类别必须要存在继承或者实现的关系。

instanceof关键字的使用格式：
		
		对象  instanceof 类别

instanceof关键字的作用： 目前没用。但是后天我们学习 到了多态之后就非常有用。
一般我们做强制类型转换之前都会使用该关键字先判断一把，然后在进行转换的。


*/


class Demo10 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
        School sch=new School();
		System.out.println(sch instanceof School);  //true
        System.out.println(new School() instanceof School);// true

	}
}


class School
{
   String name;
  

}