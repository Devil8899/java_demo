package cn.itcast.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
File��: ��������һ���ļ������ļ��еġ�

ͨ��File�������ǿ��Զ�ȡ�ļ������ļ��е��������ݣ����������Ҫ��ȡ�ļ����������ݣ���ô������Ҫʹ��IO��������

IO����Input Output��

IO��������⣺ ����豸���豸֮������ݴ������⡣  �ڴ�--->Ӳ��   Ӳ��--->�ڴ�
IO�����ࣺ
	����ǰ������ݵ����򻮷֣�		
		������
		�����
		
	������մ����ĵ�λ���֣�
	
		�ֽ���: �ֽ�����ȡ�ö����ļ��ж��������ݣ���ȡ�����������ݲ��ᾭ���κεĴ�����
		�ַ����� �ַ�����ȡ�����������ַ�Ϊ��λ�� �� �ַ���Ҳ�Ƕ�ȡ�ļ��еĶ��������ݣ����������Щ����������ת���������� ʶ����ַ���  
				�ַ��� = �ֽ��� + ����
				
�����ֽ�����
--------| InputStream ���������ֽ����Ļ���  ������
------------| FileInputStream  ��ȡ�ļ����ݵ������ֽ���   һ����û������� ����������ȡ���� Ч�ʽϸ�
			
ʹ��FileInputStream��ȡ�ļ����ݵĲ��裺
	1. �ҵ�Ŀ���ļ�
	2. �������ݵ�����ͨ����
	3. ��ȡ�ļ��е����ݡ�
	4. �ر� ��Դ.			 
*/
public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		readTest1();
//		readTest2();
//		readTest3();
		readTest4();
	}

	// 1. ��ȡ�ķ�ʽһȱ�ݣ� �޷���ȡ����һ���ļ� ������.
	public static void readTest1() throws IOException {
		// 1. �ҵ�Ŀ���ļ�
		File file = new File("D:\\liuz\\JAVADemo\\a.txt");
		// �������ݵ�����ͨ����
		FileInputStream fileInputStream = new FileInputStream(file);
		// ��ȡ�ļ��е�����
		int content = fileInputStream.read();
		// read() ÿ��ֻ�ܶ�ȡһ���ֽڵ����ݣ��Ѷ�ȡ�����ݷ��ء����ص���2��������
		System.out.println("�����������ǣ�" + (char) content);
		// �ر���Դ ʵ���Ͼ����ͷ���Դ��
		fileInputStream.close();
	}

	// ��ʽ2 �� ʹ��ѭ����ȡ�ļ�������
	public static void readTest2() throws IOException {
		long startTime = System.currentTimeMillis();
		// �ҵ�Ŀ���ļ�
		File file = new File("D:\\liuz\\JAVADemo\\a.txt");
		// �������ݵ�����ͨ��
		FileInputStream fileInputStream = new FileInputStream(file);
		// ��ȡ�ļ�������
		int content = 0; // �����ñ������ڴ洢��ȡ��������
		while ((content = fileInputStream.read()) != -1) {
			System.out.print((char) content);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// �ر���Դ
		fileInputStream.close();
		/* ��ϰʱ����÷� */
		long endTime = System.currentTimeMillis();
		System.out.println("��ȡ��ʱ���ǣ�" + (endTime - startTime)); // 446
		System.out.println("��ʱ����" + new Date(endTime - startTime).getSeconds());

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy��-MM��dd��-HHʱmm��ss��");
		Date date = new Date(startTime);
		System.out.println(formatter.format(date));
		System.out.println(formatter.format(new Date(endTime)));
	}

	
	
	// ��ʽ3��ʹ�û��� ���� ��ȡ�� ȱ�㣺 �޷���ȡ����һ���ļ������ݡ� 12G
	public static void readTest3() throws IOException {
		// �ҵ�Ŀ���ļ�
		File file = new File("D:\\liuz\\JAVADemo\\a.txt");
		// �������ݵ�����ͨ��
		FileInputStream fileInputStream = new FileInputStream(file);
		// ���������ֽ����飬��ȡ�ļ������ݡ�
		byte[] buf = new byte[1024]; // �൱�ڳ�������Ĺ��ﳵ�� ÿ�ζ�ȡ1024���ֽڵ����� ʹ��2���ƽ��д洢
		int length = fileInputStream.read(buf);
		// ���ʹ��read��ȡ���ݴ����ֽ����飬��ô�����Ǵ洢���ֽ������еģ�
		// ����ʱ��read�����ķ���ֵ�Ǳ�ʾ���Ǳ��ζ�ȡ�˼����ֽ����ݵ��ֽ������С�
		System.out.println("length:" + length);
		System.out.println("__________________________________________");
		// ʹ���ֽ����鹹���ַ���
		String content = new String(buf, 0, length);
		System.out.println("���ݣ�" + content);
		// �ر���Դ
		fileInputStream.close();
	}

	
	//��ʽ4��ʹ�û����������ѭ��һ���ȡ��28
		public static void readTest4() throws IOException{
			System.out.println("readTest4_____________________________________");
			long startTime = System.currentTimeMillis();
			//�ҵ�Ŀ���ļ�
			File file = new File("D:\\liuz\\JAVADemo\\a.txt");
			//�������ݵ�����ͨ��
			FileInputStream fileInputStream = new FileInputStream(file);
			//���������������ѭ����ȡ�ļ������ݡ�
			int length = 0; //����ÿ�ζ�ȡ�����ֽڸ�����
			byte[] buf = new byte[1024];
			//�洢��ȡ��������    �������� �ĳ���һ����1024�ı�����  1024 1kb
			//��Ϊ�������Ĵ�����λ��  �����ϻ�������Խ��Ч��Խ��
			//ѭ������
			while((length = fileInputStream.read(buf))!=-1){ 
				// read���������ȡ�����ļ���ĩβ����ô�᷵��-1��ʾ��
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(new String(buf,0,length));
				
			}
			//�ر���Դ
			fileInputStream.close();
			long endTime = System.currentTimeMillis();
			System.out.println("��ȡ��ʱ���ǣ�"+ (endTime-startTime)); //446
		}
}