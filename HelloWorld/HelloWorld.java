package com.alien;

class Test{//一个类
	public int a;//公有成员变量a
}

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello,world!");
		//System.out.println("My name is:"+args[0]);
		
		HelloWorld.test1();
		HelloWorld.test2();
		HelloWorld.test3();
		HelloWorld.test4();
		HelloWorld.test5();
	}
	
	public static void test1() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		int 变量1 = 10;
		int 变量2 = 10;
		int 计算结果 = 变量1 * 变量2;
		System.out.println(计算结果);
		
		//定义一个整形变量
		int num=46;
		System.out.println(num*2);
	}
	
	public static void test2(){
		int maxValue=Integer.MAX_VALUE;
		long max=maxValue+1;//超出范围了，要用long
		System.out.println(max);
		
		//大类型转换为小类型
		long x=999999999;
		int y=(int)x;//需要进行强转
		System.out.println(y);
	}
	
	public static void test3(){
		//滴滴笔试题
		System.out.println(1l);
		System.out.println(11+1l);
		
		int tmp=20; // 定义一个整型变量但并未赋值
		//tmp=10;
		System.out.println(tmp) ;
	}
	
	public static void test4(){
		Test test=new Test();//定义了一个Test类的对象test
		System.out.println(test.a);
	}
	
	public static void test5(){
		byte num=10;//10是一个int类型的，转成byte应该要进行强转，但是10在byte类型的范围内，所以这里没有强转
		System.out.println(num);
		
		int num1=20;
		byte num2=(byte)num1;
		System.out.println(num2);
		
		byte data = (byte)300;
		System.out.println(data);
	}
}

