package com.mkpits.abstractclass;

//Main class
public class CarMain
{

	public static void main(String[] args) 
	{
		HondaCar h=new HondaCar();
		h.engine();
		h.stering();
		
		System.out.println();
		
		BMWCar b=new BMWCar();
		b.gear();
		b.light();
	
	}

}
