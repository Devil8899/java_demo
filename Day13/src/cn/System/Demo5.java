package cn.System;

import java.util.Random;

/*
�������
Random


*/
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Random random = new Random();
		int randomNum = random.nextInt(10)+1; //���� �� ���������0-10֮��
		int num=  random.nextInt(11);         //���� �� ���������0-10֮��
		System.out.println("�������"+ num);
		
		//�������ϰ
		char[] car={'��','��','A','B','C'};
		System.out.println(car.length);  //���鳤��Ϊ5
		StringBuilder buid=new StringBuilder();
		Random rd=new Random();  //�������
		for (int i = 0; i < 4; i++) {
			int num2=rd.nextInt(car.length); //0-4֮��һ�������
			buid.append(car[num2]);   //ͨ���������������ȡֵ ����ѭ��4��
		}
		  System.out.println(buid.toString());
		}
	
		
	}

