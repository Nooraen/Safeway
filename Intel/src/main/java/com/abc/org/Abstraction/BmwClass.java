package com.jagadeesh.corejava.Abstraction;

public class BmwClass extends CarClass{


	public void carMeliage(){
		
		System.out.println("this is car milage");
		
	}
	public void carModel(){
		System.out.println("this is car model");
		
	}
	
	public static void main(String args){
		BmwClass ob=new BmwClass();
		ob.start();
		ob.stop();
		ob.carMeliage();
		ob.carModel();
	}

}
