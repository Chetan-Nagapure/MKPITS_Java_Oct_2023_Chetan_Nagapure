package com.mkpits.methods;

public class ThisKeyword 
{
int a,b;
String name;


ThisKeyword(int a,int b)

{
	this.a=a;
    this.b=b;
    System.out.println("parameterised constructor");
    
}


ThisKeyword (String name)
{
	this.name = name;
}

void add() 
{
	int c=a+b;
	System.out.println("Addition of"+ a +"and"+ b + "="+ c);
}

//void mul()
//{
//	int c=a*b;
//	System.out.println("Multiplication of"+ a + "and" + b + "=" +c);
//}


	
public static void main(String[] args) 
	{
     ThisKeyword td=new ThisKeyword(10, 20);
     td.add();
     
//     ThisKeyword tn=new ThisKeyword(12, 22);
//     tn.mul();
     ThisKeyword tn=new ThisKeyword("Chetan");
     System.out.println(tn.name);
     
	}

}
