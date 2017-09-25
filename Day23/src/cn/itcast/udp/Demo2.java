package cn.itcast.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//接收端   先启动接收端  接收请求
/*
 接收端的使用步骤
 	1. 建立udp的服务  监听一个端口
 	2. 准备空 的数据 包接收数据。  
 	3. 调用udp的服务接收数据。
 	4. 关闭资源
 
 */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		//建立udp的服务 ，并且要监听一个端口。
		DatagramSocket  socket = new DatagramSocket(9090);
		
		//准备空的数据包用于存放数据。
		byte[] buf = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length); // 1024
		//调用udp的服务接收数据
		System.out.println("____________等待接收__________________");
		socket.receive(datagramPacket);
		//receive是一个阻塞型的方法，没有接收到数据包之前会一直等待。 数据实际上就是存储到了byte的自己数组中了。
		System.out.println("接收端接收到的数据："+ new String(buf,0,datagramPacket.getLength(),"UTF-8")); 
		// getLength() 是获取数据包存储了几个字节。
		//关闭资源
		socket.close();
		
	}
	
}
