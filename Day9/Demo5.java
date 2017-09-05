/*
目前多态情况下不能访问子类特有的成员。

如果需要访问子类特有的成员，那么需要进行类型强制转换.


基本数据类型的转换
	
	小数据类型-------->大的数据类型      自动类型转换

	大数据类型--------->小数据类型       强制类型转换     小数据类型  变量名 = （小数据类型）大数据类型;


引用数据类型的转换
	
	小数据类型--------->大数据类型     自动类型转换。

	大数据类型--------->小数据类型      强制类型转换

类型转换最场景的问题： java.lang.ClassCastException。 强制类型转换失败。

*/


class Demo5 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");

      int i=100;
	  byte st=(byte)i;   //基本类型强制数据类型转换
	  System.out.println(st);  
      father fa=new son();  //多态 父类指向子类对象
	  //调用子类特有的方法
	  son s1=(son)fa;   //强制类型转换
	  s1.print();
	}
}
class father
{

}
class son extends father
{
    void print(){
	 System.out.println("这是一个子类的print方法");
	}

}
