/*


���ʣ� �������Ϣ��ͨ��printStackTrace������ӡ��������ô�쳣����Ӻζ����أ� 
	Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo10.div(Demo10.java:10)
        at Demo10.main(Demo10.java:5)
	
jvm���е�a/b�������ʱ�򣬷���bΪ0������Ϊ0��������ʵ������������
�������������jvmһ�����������ֲ����������ʱ����ôjvm�ͻ����ϴ���
һ����Ӧ���쳣���󣬲��һ��������쳣���� ��printStackTrace�ķ�����������


�쳣�Ĵ�����

	 ��ʽһ��������

	  �������ĸ�ʽ��  try-catch������Ĵ����������ִ��
			
			try{
				���ܷ����쳣�Ĵ��룻

			}catch(������쳣���� ������){
				�����쳣�Ĵ���....
			}
	
		
		������Ҫע���ϸ�ڣ�
			1. ���try���д�������쳣�����˴���֮����ôtry-catch������Ĵ����������ִ�С�
			2. ���try���г����쳣�Ĵ��룬��ô��try���г����쳣�������Ĵ����ǲ���ִ���ˡ�
			3. һ��try������ǿ��Ը��ж��catch��ģ�Ҳ����һ��try����Բ�������쳣�����͡�
			4. һ��try����Բ�������쳣������,���ǲ�����쳣���ͱ����С������в��񣬷�����뱨����


����һ : �쳣�Ĵ����о�û�ж�����ã���Ϊ�������һ��������?
		�쳣�����ǳ����ã�ֻ��������������Ŀǰ���Ӵ���֪ʶ��̫���ھ��޶��ѡ�

����Ҫ
���ʶ��� �Ժ󲶻��� ��ʱ���Ƿ���ǲ���Exception���ɣ�
	���ģ���Ϊ��������ʵ������������ͬ���쳣���͵�ʱ�����������в�ͬ �Ĵ�����ʽ��
	����Ҫ�ֿ���ͬ���쳣���ʹ�����*******************************************************
*/


class Demo7 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
        
        int arr[]=null;
       // SumData(10,0,arr[]);   //����Ϊ0 ���쳣
       SumData(10,0,arr);
	}


	public static  void SumData(int a, int b, int  arr[]){
	 int c=0;
	  /*
	  c=a/b;
	  System.out.println(c);
      */
    
	  try
	  {
		  c=a/b;
	      System.out.println(c+"______");       //��һ�䲻��ִ�� ��Ϊ��һ���Ѿ��쳣�� 
		  System.out.println(arr.length);
	  }  //�����쳣���� �������� Exception  ���������н���
	  catch (ArithmeticException e)   //�쳣���� ArithmeticException    ���try���д�������쳣�����˴���֮����ôtry-catch������Ĵ����������ִ�С�
	  { 
		  System.out.println(e.toString());
		  System.out.println("________________________________________");
		  e.printStackTrace();
	  }
	  /*
	  catch(NullPointerException e){  //��ָ���쳣
	   System.out.println(e.toString());  
	  }*/
	  catch(Exception e){          //  һ��try����Բ�������쳣������,���ǲ�����쳣���ͱ����С������в��񣬷�����뱨����
	  System.out.println("���Ǹ����쳣"); 
	  }
	  c=3;                           //try-catch������Ĵ����������ִ�С�
	  System.out.println(c);
	  System.out.println("�ҿ��Լ���ִ��~~~");
	}
}