package com.mkpits.Constructor;

public class ConstructorObject 
{

	int pincode,id;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      ConstructorObject object=new ConstructorObject();
     object.getMember();
     
     ConstructorObject object2=new ConstructorObject(440013,123);
     object2.getMember();
     
     ConstructorObject object3=new ConstructorObject(object);
     object3.getMember();
     
	}
	public void getMember() 
	{
	 System.out.println("Id is:"+id + "pincode is:"+pincode);	
	}
	public ConstructorObject()
	{
		pincode= 440013;
		id= 123;
		System.out.println("constructor with no argument");
	}
	public ConstructorObject(int p,int i)
	{
		pincode =p;
		id =i;
		System.out.println("parameterised constructor");
		
	}
	public ConstructorObject(ConstructorObject o)
	{
		System.out.println("constructor with object");
		pincode=o.pincode;
		id=o.id;
	}

}
