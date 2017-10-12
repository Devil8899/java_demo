package cn.itcast.list;

import java.util.Arrays;

/*
 �ڴ�й¶
 
���󣺱�дһ����ʹ������ģ���ջ�Ĵ洢��ʽ��  

��ջ�洢�ص㣺 �Ƚ����������ȳ���


ע�⣺ ����ʹ�õĶ���Ӧ�ò�Ҫ�ñ���ָ��ö���Ҫ�øö��󾡿�ı����������ڻ��ա�
�ø�λ�ò��� ������ָ���Ķ���,�����������ڸϿ���ո�������

 */
class StackList{
	
	Object[] elements;
	
	int index = 0 ; //��ǰ������ֵ
	
	public StackList(){
		this.elements = new Object[3];
	}
	
	//��������
	public void add(Object o){
		//����Ԫ��֮ǰӦ��Ҫ�ȼ���Ƿ��������á�
		ensureCapcity();
		elements[index++] = o;
	}
	
	
	//��ջ: ɾ�����ϵ�Ԫ�أ����ҷ��ء�
	public Object pop(){
		int tempIndex = --index;
		Object o = elements[tempIndex];
		elements[tempIndex] = null; //�ø�λ�ò��� ������ָ���Ķ���,�����������ڸϿ���ո�������
		return o;
	}
	
	
	//��鵱ǰ������ʹ�ù��á�
	public void ensureCapcity(){
		if(index==elements.length){
			//����һ���µĳ���
			int newLength =	elements.length*2;
			elements = Arrays.copyOf(elements, newLength);
		}
	}
	
	//��ȡ��ǰ��Ԫ�� ����
	public int size(){
		return index;
	}

}





public class Demo1 {

	public static void main(String[] args) {
		StackList list = new StackList();
		list.add("admin");
		list.add("jerry");
		list.add("tom");
		list.add("eason");
	
		int size = list.size();
		for(int i = 0 ; i<size ; i++){
			System.out.println(list.pop());
		}
		
		
		
	}
	
}