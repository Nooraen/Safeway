package com.jagadeesh.corejava.Abstraction;

public abstract class CarClass extends VehicleClass {
	
	public  void start(){
		System.out.println("start vehicle");
	}
	public  void stop(){
		System.out.println("stop vehicle");
	}
	
	public abstract void carMeliage();
	public abstract void carModel();

}
