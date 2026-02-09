package com.collections;

import java.util.ArrayList;
import java.util.Objects;

import com.collections.Driver;
import com.collections.exceptions.DriverNotFoundException;

public class TestDriver {
	public static void main(String[] args) {
		
		Driver driver1 = new Driver(101, "Punith", "Car", 500.0);
		Driver driver2 = new Driver(101, "Punith", "Car", 500.0); // same values
		Driver driver3 = new Driver(102, "Praveen", "Auto", 225.0);
		Driver driver4 = new Driver(103, "Mahesh", "Lorry", 100.0);
		Driver driver5 = new Driver(104, "Hari", "Auto", 300.0);
		Driver driver6 = new Driver(105, "Ramesh", "Car", 450.0);
		Driver driver7 = new Driver(106, "Suresh", "Lorry", 900.0);
		Driver driver8 = new Driver(107, "Kiran", "Car", 600.0);
		Driver driver9 = new Driver(108, "Arjun", "Auto", 275.0);
		Driver driver10 = new Driver(109, "Vijay", "Lorry", 1000.0);// maximum distance travelled driver

		ArrayList<Driver> driverArray = new ArrayList<>();
		driverArray.add(driver1);
		driverArray.add(driver2);
		driverArray.add(driver3);
		driverArray.add(driver4);
		driverArray.add(driver5);
		driverArray.add(driver6);
		driverArray.add(driver7);
		driverArray.add(driver8);
		driverArray.add(driver9);
		driverArray.add(driver10);

//		driverArray.add(new Driver(104, "Hari", "Auto", 300.0));

//		System.out.println(driverArray);

		System.out.println("------------printAllDriverDetails()-----------");

		TravelService ts = new TravelServiceImpl();
		ts.printAllDriverDetails(driverArray);

		System.out.println("------------printDriverDetails()-----------");

		ts.printDriverDetails(driver4);

		System.out.println("------------isCarDriver()-----------");

		System.out.println(ts.isCarDriver(driver1));
		System.out.println(ts.isCarDriver(driver3));
		System.out.println(ts.isCarDriver(driver4));

		int id = 115;
		Driver d1 = ts.retriveByDriverId(driverArray, id);
		if (Objects.isNull(d1)) {
			try {
				throw new DriverNotFoundException("Cannot find driver with id : "+id);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(d1);
		}
		
		
		System.out.println("--------------retriveCountOfDriver()----------------");
		Integer count = ts.retriveCountOfDriver(driverArray, "Car");
		System.out.println("Count : "+count);
		
		System.out.println("--------------categoryWiseDrivers()----------------");
		ArrayList<Driver> categoryList = ts.retriveDriverByCategory(driverArray, "Auto");
		ts.printAllDriverDetails(categoryList);
		
		System.out.println("--------------retriveMaximumDistanceTravelledDriver()----------------");
		Driver maxDistanceDriver = ts.retriveMaximumDistanceTravelledDriver(driverArray);
		System.out.println(maxDistanceDriver);
	}
}
