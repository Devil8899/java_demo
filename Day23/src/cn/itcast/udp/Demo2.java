package cn.itcast.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//���ն�   ���������ն�  ��������
/*
 ���ն˵�ʹ�ò���
 	1. ����udp�ķ���  ����һ���˿�
 	2. ׼���� ������ ���������ݡ�  
 	3. ����udp�ķ���������ݡ�
 	4. �ر���Դ
 
 */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		//����udp�ķ��� ������Ҫ����һ���˿ڡ�
		DatagramSocket  socket = new DatagramSocket(9090);
		
		//׼���յ����ݰ����ڴ�����ݡ�
		byte[] buf = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length); // 1024
		//����udp�ķ����������
		System.out.println("____________�ȴ�����__________________");
		socket.receive(datagramPacket);
		//receive��һ�������͵ķ�����û�н��յ����ݰ�֮ǰ��һֱ�ȴ��� ����ʵ���Ͼ��Ǵ洢����byte���Լ��������ˡ�
		System.out.println("���ն˽��յ������ݣ�"+ new String(buf,0,datagramPacket.getLength(),"UTF-8")); 
		// getLength() �ǻ�ȡ���ݰ��洢�˼����ֽڡ�
		//�ر���Դ
		socket.close();
		
	}
	
}