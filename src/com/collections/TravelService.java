package com.collections;

import java.util.ArrayList;

public interface TravelService {
	
	void printAllDriverDetails(ArrayList<Driver> driverArray);

	void printDriverDetails(Driver driver);

	Boolean isCarDriver(Driver driverObj);

	Driver retriveByDriverId(ArrayList<Driver> driverArray, Integer id);

	Integer retriveCountOfDriver(ArrayList<Driver> driverArray, String category);

	ArrayList<Driver> retriveDriverByCategory(ArrayList<Driver> driverArray, String category);

	Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> driverArray);
	
}
