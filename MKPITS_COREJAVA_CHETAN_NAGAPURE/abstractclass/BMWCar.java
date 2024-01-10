package com.mkpits.abstractclass;

public class BMWCar extends car 
{

	@Override
	public void engine() 
	{
		System.out.println("BMW-250");
	}

	@Override
	public void wheels()
	{
		 System.out.println("CEAT");

	}

	@Override
	public void stering()
	{
		System.out.println("Power");
	}

	@Override
	public void light() 
	{
		System.out.println("LED");
	}

	@Override
	public void gear() 
	{
		System.out.println("Automatic");
	}

}
