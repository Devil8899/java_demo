package cn.other;

import java.io.*;
/*
转换流:

输入字节流的转换流：InputStreamReader 是字节流通向字符流的桥
	InputStreamReader

输出字节流的转换流：
	OutputStreamWriter   可以把输出字节流转换成输出字符流 。  
	

转换流的作用：
	1. 如果目前所 获取到的是一个字节流需要转换字符流使用，这时候就可以使用转换流。  字节流----> 字符流
	2. 使用转换流可以指定编码表进行读写文件。
	

*/
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Demo8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	
	//使用输入字节流的转换字符流指定码表进行读取文件数据
	public static void readTest2() throws IOException{
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		//创建字节流的转换流并且指定码表进行读取
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");
		char[] buf = new char[1024];  //因为是字符流 所以这里使用字符数组
		int length = 0;
		while((length = inputStreamReader.read(buf))!=-1){
			System.out.println(new String(buf,0,length));
		}
		
	}
	
	
	
	
	
	//使用输出字节流的转换流指定码表写出数据
	public static void writeTest2() throws IOException{
		File file = new File("F:\\a.txt");
		//建立数据的输出通道
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		//把输出字节流转换成字符流并且指定编码表。
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
		outputStreamWriter.write("新中国好啊");
		//关闭资源
		outputStreamWriter.close();
		
	}
	
	
	//输出字节流转成输出字符流
	public static void writeTest() throws IOException{
		File file = new File("F:\\a.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		//把输出字节流转换成输出字符流。
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		
		outputStreamWriter.write("大家好");
		outputStreamWriter.close();
		
	}
	
	
	
	//读取
	public static void readTest() throws IOException{
		InputStream in = System.in; //获取了标准的输入流。
       //System.out.println("读到 的字符："+ (char)in.read());  //read()一次只能读取一个字节。
		//需要把字节流转换成字符流。
		InputStreamReader inputStreamReader = new InputStreamReader(in);
		//使用字符流的缓冲类
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line = null;
		while((line = bufferedReader.readLine())!=null){
			System.out.println("内容："+ line);
		}
		
		
	}

}
