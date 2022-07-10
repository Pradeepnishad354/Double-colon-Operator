package com.ref;

public class RefDemo {
	
	public static void main(String[] args) {
		
		System.out.println("learning method reference");
	
		//using lambda expression
	/*WorkInter workInter=()->{
		
		System.out.println("hello");
	};
	workInter.doTask();
	
	}*/
		//provide the implementation of WorkInter
		//static method ko refer
		//ClassName::MethodName
		
	WorkInter  workInter=Stuff::doStuff;
	
	workInter.doTask();
	
	Runnable runnable=Stuff::threadTask;
	
	Thread thread=new Thread(runnable);
	thread.start();
	
	//referring non static method
	//object::methodName
	
	
	Stuff obj=new Stuff();
	Runnable runnable2=obj::printNum;
	Thread thread2=new Thread(runnable2);
	
	thread2.start();
	}

}
