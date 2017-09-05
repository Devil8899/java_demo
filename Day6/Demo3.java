/*
 封装对象属性
权限修饰符：权限修饰符就是控制变量可见范围的。

public :  公共的。 public修饰的成员变量或者方法任何人都可以直接访问。

private ： 私有的， private修饰的成员变量或者方法只能在本类中进行直接访问。

封装的步骤：
	1. 使用private修饰需要被封装的属性。
	2. 提供一个公共的方法设置或者获取该私有的成员属性。
			 命名规范：
				set属性名();
				get属性名(); 

疑问： 封装一定要提供get或者set方法吗？ 在IDE中可以使用快捷键封装
		不一定， 根据需求而定的。

规范 ： 在现实开发中一般实体类的所有成员属性（成员变量）都要封装起来。

实体类：实体类就是用于描述一类 事物的就称作为实体类。


工具类(Arrays数组的工具类):


封装的好处：
	1. 提高数据的安全性。
	2. 操作简单。 
	3. 隐藏了实现。
*/

class Demo3 
{
	public static void main(String[] args) 
	{
          person P1=new person();
		  P1.name="sandy";
		  P1.Setsex("女");

		System.out.println("姓名"+P1.name+"性别"+P1.Getsex()+"年龄"+P1.age);
	}
}

class person
{
    public String name;
	private String Sex;   //实例化时无法访问 赋值,取值。
    public int  age;      //默认值是0
	//so easy  通过Set() get() 方法来操作
    /*设置值方法*/
	public void Setsex(String s){
	   //可以对赋值进行逻辑判断
	   if(s=="男" || s=="女"){
	     Sex=s;
	   }else Sex="男"; 
	}
   
   /*返回值方法*/
   public String Getsex(){
      return Sex;
   }



}
