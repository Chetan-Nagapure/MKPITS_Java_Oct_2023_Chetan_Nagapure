package com.mkpits.interface1;

public class MainBank
{

	public static void main(String[] args) 
	{
		SBIBank b=new SBIBank();
		float a = b.rateofinterest();
		System.out.println(a);
		
		PNBBank p=new PNBBank();
		float c =p.rateofinterest();
		System.out.println(c);

	}

}
