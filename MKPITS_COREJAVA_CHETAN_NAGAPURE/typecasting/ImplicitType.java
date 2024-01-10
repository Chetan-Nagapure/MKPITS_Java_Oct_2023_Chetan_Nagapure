package com.mkpits.typecasting;

public class ImplicitType {
	//smaller datatype converted into larger datatype
	//ex.int (4byte) value converted to long (8byte)
public static void main(String[] args) 

{
	int x=20;
	long y= (long)x;
	System.out.println(y);
	getByteInt();
	getShortlong();
	getshort();
}

public static void getByteInt()
{
	byte num1=10; //byte datatype=1
	byte num2=20;
	
	int num3=num1 + num2;
	System.out.println("sum="+num3);
}

public static void getShortlong() 
{
	short num1=123;
	short num2=234;
	
	long num3=num1 * num2;
	System.out.println("mul="+num3);
	
}

//short to short not converted in implicit
public static void getshort()
{
	short num1=01;
	short num2=02;
	
	int num3= num1 + num2;
	System.out.println("sum" +num3);
	
}


}
