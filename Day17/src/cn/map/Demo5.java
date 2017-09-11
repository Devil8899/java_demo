package cn.map;

import java.util.HashMap;

/*
˫�м��ϣ�
-------------| Map  �����ʵ����Map�ӿڵļ����࣬�߱����ص㣺 �洢�����ݶ����Լ�ֵ�Ե���ʽ���ڵģ��������ظ���ֵ�����ظ���
----------------| HashMap  �ײ�Ҳ�ǻ��ڹ�ϣ��ʵ�� �ġ�
HashMap�Ĵ洢ԭ����
	��HashMap����Ԫ�ص�ʱ�����Ȼ���ü���hashCode�����õ�Ԫ�� �Ĺ�ϣ��ֵ��Ȼ�󾭹�����Ϳ��������
	Ԫ���ڹ�ϣ���еĴ洢λ�á� 
	���1�� ��������λ��Ŀǰû���κ�Ԫ�ش洢����ô��Ԫ�ؿ���ֱ�����ӵ���ϣ���С�
	
	���2�������� ��λ��Ŀǰ�Ѿ�����������Ԫ�أ���ô������ø�Ԫ�ص�equals���������λ���ϵ�Ԫ�ؽ��бȽ�
	�����equals�������� ����false����ô��Ԫ���������洢�����equals�������ص���true����ô��Ԫ�ر���Ϊ
	�ظ�Ԫ�أ����ʴ洢��

----------------| TreeMap
----------------| Hashtable 

*/
class Person{
	
	int id;
	
	
	String name;


	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return  "[��ţ�"+this.id+" ������"+ this.name+"]";
		
	}	
	
	@Override
	public int hashCode() {   //��дhashCode
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {  //��дequals ���� ��Ϊ��Ƚ�
		Person p = (Person) obj;
		return this.id== p.id;
	}
}


public class Demo5 {
	
	public static void main(String[] args) {
	
		HashMap<String,String> Hmap=new HashMap<String,String>();
		Hmap.put("mobile", "huawei");
		Hmap.put("car", "BMW");
		//�����������ͬ������ô�����ӵ����ݵ�ֵ��ȡ��֮ǰ ��ֵ��
		Hmap.put("mobile", "xiaomi");
		System.out.println("���ϵ�Ԫ��"+Hmap);
		
		
        //�Զ������
		//ֵ�����ظ�  �����������ظ�
		HashMap<Person, String> map = new HashMap<Person, String>();
		map.put(new Person(110,"shanghai"), "001");   
		map.put(new Person(220,"Beijing"), "002");
		map.put(new Person(330,"nanjing"), "003");
		map.put(new Person(110,"shanghai"), "007"); 
		
		//�����������ͬ������ô�����ӵ����ݵ�ֵ��ȡ��֮ǰ ��ֵ��
		System.out.println("���ϵ�Ԫ�أ�"+ map);
		
		
		
	}
	
}