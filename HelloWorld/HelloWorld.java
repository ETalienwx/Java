package com.alien;

class Test{//һ����
	public int a;//���г�Ա����a
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
		
		int ����1 = 10;
		int ����2 = 10;
		int ������ = ����1 * ����2;
		System.out.println(������);
		
		//����һ�����α���
		int num=46;
		System.out.println(num*2);
	}
	
	public static void test2(){
		int maxValue=Integer.MAX_VALUE;
		long max=maxValue+1;//������Χ�ˣ�Ҫ��long
		System.out.println(max);
		
		//������ת��ΪС����
		long x=999999999;
		int y=(int)x;//��Ҫ����ǿת
		System.out.println(y);
	}
	
	public static void test3(){
		//�εα�����
		System.out.println(1l);
		System.out.println(11+1l);
		
		int tmp=20; // ����һ�����ͱ�������δ��ֵ
		//tmp=10;
		System.out.println(tmp) ;
	}
	
	public static void test4(){
		Test test=new Test();//������һ��Test��Ķ���test
		System.out.println(test.a);
	}
	
	public static void test5(){
		byte num=10;//10��һ��int���͵ģ�ת��byteӦ��Ҫ����ǿת������10��byte���͵ķ�Χ�ڣ���������û��ǿת
		System.out.println(num);
		
		int num1=20;
		byte num2=(byte)num1;
		System.out.println(num2);
		
		byte data = (byte)300;
		System.out.println(data);
	}
}

