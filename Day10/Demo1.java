/*
 ͨ��instanceof �ؼ��� 
 ǿ������ת��
ʹ�ã�
����  instanceof �ࡣ  �ж�һ�������Ƿ�����ĳ�����͡�
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
	   if(fa instanceof son){   // ����  instanceof �ࡣ  �ж�һ�������Ƿ�����ĳ�����͡�
	       son S=(son)fa;     //ǿ��ת�� 
		   S.work();   //�����������з���
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
   System.out.println("����1�ڹ��� weidan ");
   }
}
class son2 extends father
{

  void study(){
   System.out.println("����2��ѧϰ");
  }
}