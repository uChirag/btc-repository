package com.cru.mobilelist;

public class Mobile {
	private String brandName;
	private String modelName;
	private double cost;
	private String screenSize;
	private String batteryLife;
	private String storageSpace;
	private int cameraPixels;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public String getBatteryLife() {
		return batteryLife;
	}
	public void setBatteryLife(String batteryLife) {
		this.batteryLife = batteryLife;
	}
	public String getStorageSpace() {
		return storageSpace;
	}
	public void setStorageSpace(String storageSpace) {
		this.storageSpace = storageSpace;
	}
	public int getCameraPixels() {
		return cameraPixels;
	}
	public void setCameraPixels(int cameraPixels) {
		this.cameraPixels = cameraPixels;
	}
	
	public Mobile(String brandName, String modelName, double cost, String screenSize, String batteryLife,
			String storageSpace, int cameraPixels) {
		super();
		this.brandName = brandName;
		this.modelName = modelName;
		this.cost = cost;
		this.screenSize = screenSize;
		this.batteryLife = batteryLife;
		this.storageSpace = storageSpace;
		this.cameraPixels = cameraPixels;
	}
	
	@Override
	public String toString() {
		return "Mobile \n[brandName=" + brandName + ", modelName=" + modelName + ", cost=" + cost + ", screenSize="
				+ screenSize + ", batteryLife=" + batteryLife + ", storageSpace=" + storageSpace + ", cameraPixels="
				+ cameraPixels + "]\n";
	}

}
