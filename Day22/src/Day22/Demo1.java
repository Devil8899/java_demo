package Day22;
/*复习
 File 类
  
 字节流

输入字节流：
-----------| InputStream  所有输入字节流的基类  抽象类
-----------------| FileInputStream 读取文件数据的输入字节流  实现类
-----------------| BufferedInputStream  缓冲输入字符流       该类出现的目的是为了提高读取文件 数据的效率。 这个类其实只不过是在内部维护了一个8kb的字节数组而已。

输出字节流：
-----------| OutputStream 所有输出字节流的基类。  抽象类。
----------------| FileOutputStream 向文件输出数据的输出字节流  
----------------| BufferedOutputStream 缓冲输出字节流   该类出现的目的也是为了提高向文件写数据的效率。 这个类的也只不过是在内部维护了一个8kb的字节数组而已。

字符流 :  字符流 = 字节流  + 编码（解码）

输入字符流:
---------| Reader   所有输入字符流的基类。  抽象类。
----------------| FileReader 读取文件数据的输入字符流。 
----------------| BufferedReader 缓冲输入字符流           该类出现的目的是为了提高读取文件数据的效率与拓展FileReader的(readLine)功能。  这个类的也只不过是在内部维护了一个8kb的字符数组而已。


输出字符流:
---------| Writer 所有输出字符流的基类。  抽象类
----------------| FileWriter 向文件输出数据的输出字符流  
----------------| BufferedWriter 缓冲输出字符流        该类出现的目的是为了提高写文件数据的效率与拓展FileWriter的(newLine)功能.
  
  字节流不能直接写入和读取汉字    使用 byte[]数组   字节数组
 字符流可以直接读取和写入汉字     使用char[]数组    字符数组
  
  
  */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
