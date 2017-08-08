package com.jagadeesh.corejava.Abstraction;

//ABSTRACT IS KEYWORD USED TO WRITE A TEMPLATE (HIDE USEFULL DATA AND DISPLAY NEEDED DATA)
//SYNTAX:---(ABSTRAT CLASS CLASSNAME) USED FOR ONLY CLASSES
//ABSTRACT VARIABLES IS NOT PRESENT
//ABSTRACT METHODS ARE PRESENT----syntax:-->>public abstract void methodName();
//ABSTRACT METHOD IMPLIMENTATION---->>public void display(){
//                                      System.out.println("i am in display  method");
//}
//WE CAN USE NON ABSTRACT METHODS IN ABSTRACT CLASS
//CANNOT CREATE A OBJECT TO ABSTRACT CLASS.SO V HAVE TO EXTEND AND IMPLEMENT ABSTRACT METHODS TO DISPLAY OUTPUT.

abstract class One{
	//abstract int a=1; //Illegal modifier for the field a; only public, protected, private, static, final, transient & volatile are permitted
	float b=12.5f;
	public abstract void display();
	
	public void show(){
		System.out.println("i am in show method");
	}
}

abstract class Two extends One{
	public abstract void display1();
	
}

/*public class Three extends Two{
	
	public void display(){
		
	}
	
}*/

public class AbstractClass {
	
	public static void main(String args[]){
		
		//Two t=new Two();   //Cannot instantiate the type Two
		
		//public void display(){
		//	System.out.println("i am in display method");
		//}
		
	}

}
