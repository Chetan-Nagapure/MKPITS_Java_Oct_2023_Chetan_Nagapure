package com.mkpits.methods;

public class MethodOverloading 
{

	//When more than one method are defined using same name but by passing different types & different no. of arguments it is called method overloading.
	
	public static void main(String[] args) 
	{
      MethodOverloading m=new MethodOverloading();
      m.getData();
      System.out.println(m.getData(4));
      System.out.println(m.getData("chetan"));
      m.getData("Nagapure", 01);
 
      System.out.println(m.getData("1234567891","chetannagapure5473@gmail.com","chetan@123"));
   m.getData(2, "chetan");

	}
	public void getData()
	{
		System.out.println("This is method overloading");
		
	}
	public int getData(int a ) 
	{
		int b=a*a;
		return b;
	}
	public void getData(int b ,String Name) 
	{
		System.out.println(b);
		System.out.println(Name);
	
		
	}
	public static String getData(String firstName)
	{
		return firstName;
	}
	private static void getData(String lastName, int id)
	{
		System.out.println(lastName);
		System.out.println(id);
	}
	private static String getData(String mobile, String email, String passward)
	{
		String details=mobile + " \n"+email+" \n"+passward;
		
		return details;
	}

}


