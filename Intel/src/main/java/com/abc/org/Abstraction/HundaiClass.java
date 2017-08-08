package com.jagadeesh.corejava.Abstraction;

public class HundaiClass extends CarClass{
	
	public void carMeliage(){
       System.out.println("this is car meliage");
	}
	
	public void carModel(){
		System.out.println("this is carmodel");
	}
	
	
	public static void main(String args[]){
		HundaiClass ob=new HundaiClass();
		ob.start();
		ob.stop();
		ob.carMeliage();
		ob.carModel();
}
}
