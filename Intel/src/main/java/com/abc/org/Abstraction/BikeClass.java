package com.jagadeesh.corejava.Abstraction;

abstract public class BikeClass extends VehicleClass {
	

	public void start(){
		System.out.println("start vehicle");
		
	}
	public void stop(){
		System.out.println("stop vehicle");
	}
	

	public abstract void bikeModel();
	public abstract void bikeMilage();
}
