package com.mkpits.interface1;

public class MainAnimal1 
{

	public static void main(String[] args) 
	{
		Cow c=new Cow();
		c.animalsounds();
		c.sleep();
		
		System.out.println();
		
		Dog d=new Dog();
		d.animalsounds();
		d.sleep();
	}

}
