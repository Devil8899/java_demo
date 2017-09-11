package generic;

import java.util.ArrayList;
import java.util.Arrays;

/*
 ���� ��дһ������ �Ĺ�����
 
 ************************************�����ࣺ
 
������Ķ����ʽ��
	
	class ����<�����Զ��巺��>{
	
	}
 
������Ҫע������
 	1. �������Զ��巺�͵ľ���������������ʹ�ø����ʱ�򴴽�����ʱ��ȷ���ġ�
 	2. ���һ�����������Ѿ��������Զ��巺�ͣ����ʹ�ø��ഴ������ ��ʱ��û��ָ�� ���͵ľ����������ͣ���ôĬ��ΪObject����
 	3.�������Զ��巺�Ͳ��������ھ�̬�ķ����������̬�ķ�����Ҫʹ���Զ��巺�ͣ���ô��Ҫ�ڷ������Լ�����ʹ�á�
 
 
 
 */

class MyArrays<T>{
	

	//Ԫ�ط�ת
	public void reverse(T[] arr){
		for(int startIndex = 0, endIndex = arr.length-1 ; startIndex<endIndex ; startIndex++,endIndex--){
			T temp  = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
		
	}
	
	//
	public String toString(T[] arr){
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < arr.length ; i++){
			if(i==0){
				sb.append("["+arr[i]+",");
			}else if(i==arr.length-1){
				sb.append(arr[i]+"]");
			}else{
				sb.append(arr[i]+",");
			}
		}
		return sb.toString();
	}
	
	
	public static <T>void print(T[] t){
		
    
	System.out.println("����һ������"+Arrays.toString(t)); 	
	}
	
	
}



public class Demo3 {
	
	public static void main(String[] args) {
		Integer[] arr = {10,12,14,19};
		
		MyArrays<Integer> tool = new MyArrays<Integer>();
		tool.reverse(arr);
		System.out.println("�����Ԫ�أ�"+tool.toString(arr));
		
		MyArrays<String> tool2 = new MyArrays<String>();
		String[] arr2 = {"aaa","bbb","ccc"};
		tool2.reverse(arr2);
				
		
		ArrayList<String> list = new ArrayList<String>();
		//���þ�̬�ķ���
		new MyArrays<Integer>().print(arr);
		
		
	}
	
}