package com.collections;

public class Driver {

	
	private Integer driverId;
	private String driverName;
	private String category;
	private Double totalDistance;
	
	public Driver() {
	}
	
	
	
	public Driver(Integer driverId, String driverName, String category, Double totalDistance) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.category = category;
		this.totalDistance = totalDistance;
	}



	public Integer getDriverId() {
		return driverId;
	}



	public void setDriverId(Integer driverId) {
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



	public Double getTotalDistance() {
		return totalDistance;
	}



	public void setTotalDistance(Double totalDistance) {
		this.totalDistance = totalDistance;
	}



	@Override
	public String toString() {
		return "driverId : " + driverId + ", driverName : " + driverName + ", category : " + category
				+ ", totalDistance : " + totalDistance ;
	}
	
	

}
