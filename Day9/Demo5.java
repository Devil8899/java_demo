/*
Ŀǰ��̬����²��ܷ����������еĳ�Ա��

�����Ҫ�����������еĳ�Ա����ô��Ҫ��������ǿ��ת��.


�����������͵�ת��
	
	С��������-------->�����������      �Զ�����ת��

	����������--------->С��������       ǿ������ת��     С��������  ������ = ��С�������ͣ�����������;


�����������͵�ת��
	
	С��������--------->����������     �Զ�����ת����

	����������--------->С��������      ǿ������ת��

����ת����������⣺ java.lang.ClassCastException�� ǿ������ת��ʧ�ܡ�

*/


class Demo5 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");

      int i=100;
	  byte st=(byte)i;   //��������ǿ����������ת��
	  System.out.println(st);  
      father fa=new son();  //��̬ ����ָ���������
	  //�����������еķ���
	  son s1=(son)fa;   //ǿ������ת��
	  s1.print();
	}
}
class father
{

}
class son extends father
{
    void print(){
	 System.out.println("����һ�������print����");
	}

}