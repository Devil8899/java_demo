/*
 通过instanceof 关键字 
 强制类型转换
使用：
对象  instanceof 类。  判断一个对象是否属于某种类型。
*/

class Demo1 
{
	public static void main(String[] args) 
	{
	  	//System.out.println("Hello World!");
        father fa=new son();
		printInfo(fa);
	
        father fn=new son2();
		printInfo(fn);
	}
    public static void printInfo(father fa){
	   if(fa instanceof son){   // 对象  instanceof 类。  判断一个对象是否属于某种类型。
	       son S=(son)fa;     //强制转换 
		   S.work();   //调用子类特有方法
	   } else if(fa instanceof son2){
	     son2 S1=(son2)fa;
		 S1.study();
	   }
	
	
	}
}

class father
{

}

class son extends father
{
   void work(){
   System.out.println("儿子1在工作 weidan ");
   }
}
class son2 extends father
{

  void study(){
   System.out.println("儿子2在学习");
  }
}
