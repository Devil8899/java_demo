package cn.other;
import java.io.*;
import java.util.Properties;
/*
properties 类测试
需求： 使用properties实现本软件只能 运行三次，超过了三次之后就提示购买正版，退jvm.

*/
public class Demo5 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO 自动生成的方法存根
		File file = new File("D:\\liuz\\JAVADemo\\count.properties");
		if(!file.exists()){
			//如果配置文件不存在，则创建该配置文件
			file.createNewFile();
		}
		
		//创建Properties对象。
		Properties properties = new Properties();
		//把配置文件的信息加载到properties中
		properties.load(new FileInputStream(file));  //字节流读取  如果有中文使用字符流
		FileOutputStream fileOutputStream = new FileOutputStream(file);

		int count = 0; //定义该变量是用于保存软件的运行次数的。
		//读取配置文件的运行次数
		String value = properties.getProperty("count");
		if(value!=null){
			count = Integer.parseInt(value);
		}
		
		//判断使用的次数是否已经达到了三次，
		if(count==3){
			System.out.println("你已经超出了试用次数，请购买正版软件！！");
			System.exit(0);
		}

		count++;
		System.out.println("你已经使用了本软件第"+count+"次");
		properties.setProperty("count",count+"");
		//使用Properties生成一个配置文件
		properties.store(fileOutputStream,"runtime");
		
	}

}
