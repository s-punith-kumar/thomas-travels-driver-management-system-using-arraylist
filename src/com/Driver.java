package com;

public class Driver {
	private int driverId;
	private String driverName;
	private String category;
	private double totalDistance;

	public Driver() {
	}

	public Driver(int driverId, String driverName, String category, double totalDistance) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.category = category;
		this.totalDistance = totalDistance;
	}
	
	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	

	public double getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}

	@Override
	public boolean equals(Object obj) {
		Driver  driver = (Driver)obj;
		return this.getDriverId() == driver.getDriverId() && this.getDriverName().equals(driver.getDriverName()) && this.getCategory().equals(driver.getCategory()) && this.getTotalDistance() == driver.getTotalDistance();
	}
	
	@Override
	public String toString() {
		return "Driver [ Id : "+getDriverId()+" , Driver Name : "+getDriverName()+" , Category : "+getCategory()+" , Distance : "+getTotalDistance()+" ]";
	}

}
