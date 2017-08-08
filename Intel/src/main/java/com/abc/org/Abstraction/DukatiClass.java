package com.jagadeesh.corejava.Abstraction;

public class DukatiClass extends BikeClass {

	public void bikeModel(){
		System.out.println("this is bikemodel");
	}
	public void bikeMilage(){
		System.out.println("this is bikemilage");
	}
	
     public static void main(String args[]){
    	 DukatiClass obj=new DukatiClass();
    	 obj.start();
    	 obj.stop();
    	 obj.bikeModel();
    	 obj.bikeMilage();
    	
    	 
     }
}
