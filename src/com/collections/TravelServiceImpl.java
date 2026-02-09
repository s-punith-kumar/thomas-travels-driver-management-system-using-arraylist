package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

import com.collections.exceptions.DriverNotFoundException;

public class TravelServiceImpl implements TravelService {

	@Override
	public void printAllDriverDetails(ArrayList<Driver> driverArray) {
		ListIterator<Driver> listIterator = driverArray.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}

	@Override
	public void printDriverDetails(Driver driver) {
		System.out.println(driver);
	}

	@Override
	public Boolean isCarDriver(Driver driverObj) {
		Driver driver = driverObj;
		return driver.getCategory().equals("Car");
	}

	@Override
	public Driver retriveByDriverId(ArrayList<Driver> driverArray, Integer id) {
		ListIterator<Driver> iterator = driverArray.listIterator();

		while (iterator.hasNext()) {
			Driver driver = iterator.next();
			if (driver.getDriverId() == id) {
				return driver;
			}
		}
		return null;
	}

	@Override
	public Integer retriveCountOfDriver(ArrayList<Driver> driverArray, String category) {
		ListIterator<Driver> iterator = driverArray.listIterator();
		Integer count = 0;
		while (iterator.hasNext()) {
			Driver driver = iterator.next();
			if (driver.getCategory().equals(category))
				count++;
		}
		return count;
	}

	@Override
	public ArrayList<Driver> retriveDriverByCategory(ArrayList<Driver> driverArray, String category) {

		ArrayList<Driver> categoryList = new ArrayList<>();

		ListIterator<Driver> iterator = driverArray.listIterator();
		while (iterator.hasNext()) {
			Driver driver = iterator.next();
			if (driver.getCategory().equals(category)) {
				categoryList.add(driver);
			}
		}

		return categoryList;
	}

	@Override
	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> driverArray) {
		
		Driver maxDistanceDriver = null;
		Driver driver1 = null;
		Driver driver2 = null;
		for(int i=0;i<driverArray.size()-1;i++) {
			driver1 = driverArray.get(i);
			driver2 = driverArray.get(i+1);
			if(driver1.getTotalDistance() > driver2.getTotalDistance()) {
				maxDistanceDriver = driver1;
			} else if(driver1.getTotalDistance() < driver2.getTotalDistance()) {
				maxDistanceDriver = driver2;
			}
		}
		return maxDistanceDriver;
	}

}
