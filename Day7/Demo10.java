/*


instanceof �ؼ���

instanceof�ؼ��ֵ����ã��ж�һ�������Ƿ�����ָ�������

instanceof�ؼ��ֵ�ʹ��ǰ�᣺�жϵĶ�����ָ����������Ҫ���ڼ̳л���ʵ�ֵĹ�ϵ��

instanceof�ؼ��ֵ�ʹ�ø�ʽ��
		
		����  instanceof ���

instanceof�ؼ��ֵ����ã� Ŀǰû�á����Ǻ�������ѧϰ ���˶�̬֮��ͷǳ����á�
һ��������ǿ������ת��֮ǰ����ʹ�øùؼ������ж�һ�ѣ�Ȼ���ڽ���ת���ġ�


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