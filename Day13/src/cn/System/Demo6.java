package cn.System;
/*
进程 ：  正在执行的程序称作为一个进程。  进程负责了内存空间的划分。

问题： windows号称是多任务的操作系统,那么windows是同时运行多个应用程序吗？
	
	从宏观的角度： windows确实是在同时运行多个应用程序。
	
	从微观角度： cpu是做了一个快速切换执行的动作，由于速度态度，所以我感觉不到在切换 而已。

线程： 线程在一个进程 中负责了代码的执行，就是进程中一个执行路径，

多线程： 在一个进程中有多个线程同时在执行不同的任务。

疑问 ：线程负责了代码 的执行，我们之前没有学过线程，为什么代码可以执行呢？
	运行任何一个java程序，jvm在运行的时候都会创建一个main线程执行main方法中所有代码。

一个java应用程序至少有几个线程？
	至少有两个线程， 一个是主线程负责main方法代码的执行，一个是垃圾回收器线程,负责了回收垃圾。

多线程的好处：
	1. 解决了一个进程能同时执行多个任务的问题。
	2. 提高了资源的利用率。

多线程 的弊端：
	1. 增加cpu的负担。
	2. 降低了一个进程中线程的执行概率。
	3. 引发了线程安全 问题。
	4. 出现了死锁现象。
	
如何创建多线程：
	
	创建线程的方式：
	
		方式一：
			1. 自定义一个类继承Thread类。
			2. 重写Thread类的run方法 , 把自定义线程的任务代码写在run方法中
				疑问： 重写run方法的目的是什么？  
			   每个线程都有自己的任务代码，jvm创建的主线程的任务代码就是main方法中的所有代码, 自定义线程的任务代码就写在run方法中，自定义线程负责了run方法中代码。	
			3. 创建Thread的子类对象，并且调用start方法开启线程。
				
			注意：	一个线程一旦开启，那么线程就会执行run方法中的代码，run方法千万不能直接调用，直接调用run方法就相当调用了一个普通的方法而已
				并没有开启新的线程。
			
*/

public class Demo6 {

	public static void main(String[] args) {
		//创建了自定义的线程对象。
		xiancheng d = new xiancheng();
		//调用start方法启动线程
		d.start();
		// TODO Auto-generated method stub
		for(int i  = 0 ; i < 50 ; i++){   //同时运行  可以看到Main和线程相互快速切换
			System.out.println("main线程："+i);
		}
		
	}

}

class xiancheng extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int i  = 0 ; i < 50 ; i++){
			System.out.println("自定义线程："+i);
		}
		
	}
	
	
	
}

