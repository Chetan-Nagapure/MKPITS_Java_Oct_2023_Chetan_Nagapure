package com.mkpits.abstractclass;

import com.mkpits.abstractclass.OuterClass.InnerClass;

public class CallInnerOuter 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		OuterClass outerclass=new OuterClass();
		OuterClass.InnerClass innerclass=outerclass.new InnerClass();
		System.out.println(outerclass.x + innerclass.y);
		System.out.println(innerclass.z);
		
	}

}
