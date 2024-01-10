package com.mkpits.methods;

public class MethodWithNonReturnTypeArgument {
 public static void main(String[] args) 
 
 {
	MethodWithNonReturnTypeArgument m=new MethodWithNonReturnTypeArgument();
	m.getItems(234, 5675);//Argument //calling method
	
}
 private void getItems(int itemCode, int price) //parameter //called method
 {
	 price = price + 1234;
	 System.out.println("itemCode :-" +itemCode+ "price:- Rs" +price);
 }
}
