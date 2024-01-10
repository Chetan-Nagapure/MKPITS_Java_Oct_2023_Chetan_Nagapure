package com.mkpits.methods;

public class ThisDemo {
	
	int pincode, citycode;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ThisDemo td=new ThisDemo(440013, 712);
		td.getData();
		
		Details details=new Details("chetan", 120, 440013, 712);
		System.out.println(details.getName());
		
		details.setName("MKPITS");
		System.out.println(details.getName());
		
		

	}
	private void getData() 
	{
		System.out.println("pincode is-"+pincode +"city code is-"+ citycode);
		
	}
	ThisDemo(int pincode, int citycode){
		this.pincode=pincode;
		this.citycode=citycode;
	}


}
