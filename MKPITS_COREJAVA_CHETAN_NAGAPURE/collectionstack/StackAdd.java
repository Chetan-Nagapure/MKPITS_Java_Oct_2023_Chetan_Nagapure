package com.mkpits.collectionstack;

import java.util.Stack;

public class StackAdd
{
//Adding Element
	public static void main(String[] args) 
	{
		Stack<String> stack1=new Stack<String>();
		
		Stack<String>stack2=new Stack<String>();
		
		//pushing the element
		stack1.push("This");
		stack1.push("is");
		stack1.push("Java");
		
		stack2.push("Programming");
		stack2.push("language");
		
		System.out.println(stack1);
		System.out.println(stack2);
		
	}

}
