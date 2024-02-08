package com.mkpits.inheritance;

public class AddDemo 

{
  int x,y;
  
  public void getData(int x,int y)
  {
	this.x=x;
	this.y=y;
	  
  }
  public void addData()
  {
	int z = x + y;
	System.out.println("Addition of z :" +z);
	
  }
	
}
