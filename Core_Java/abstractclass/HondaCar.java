package com.mkpits.abstractclass;

//subclass
public  class HondaCar extends car 
{
    @Override
	public void engine()
	{
		System.out.println("Honda H-tech 120");

	}

	@Override
	public void wheels() 
	{
		System.out.println("MRF");
	}

	@Override
	public void stering() 
	{
		System.out.println("power");

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
