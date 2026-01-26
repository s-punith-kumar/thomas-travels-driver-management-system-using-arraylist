package com;

public class TestDriver {
	public static void main(String[] args) {

		Driver driver1 = new Driver(101, "Punith", "Car", 500);
		Driver driver2 = new Driver(101, "Punith", "Car", 500); // same values
		Driver driver3 = new Driver(102, "Praveen", "Auto", 225);
		Driver driver4 = new Driver(103, "Mahesh", "Lorry", 800);

		System.out.println(driver1);
		System.out.println(driver1 == driver2);// compares memory addresses only

		System.out.println(driver1.hashCode()); // generates hash code of object
		System.out.println(driver2.hashCode());

		System.out.println(driver1.equals(driver2)); // true // works on logic given in Driver class
		System.out.println(driver1.equals(driver3)); // false

		Travel travel = new Travel();

		System.out.println(travel.isCarDriver(driver1));// true car
		System.out.println(travel.isCarDriver(driver3));// false auto
		System.out.println(travel.isCarDriver(driver4));// false lorry

		System.out.println("--------Retrieve Driver By Id--------");
		// extra driver objects into array
		Driver driver5 = new Driver(104, "Hari", "Auto", 300);
		Driver driver6 = new Driver(105, "Ramesh", "Car", 450);
		Driver driver7 = new Driver(106, "Suresh", "Lorry", 900);
		Driver driver8 = new Driver(107, "Kiran", "Car", 600);
		Driver driver9 = new Driver(108, "Arjun", "Auto", 275);
		Driver driver10 = new Driver(109, "Vijay", "Lorry", 1000);// maximum distance travelled driver

		Driver driverArray[] = new Driver[10];// Added driver objects into driver array
		driverArray[0] = driver1;
		driverArray[1] = driver2;
		driverArray[2] = driver3;
		driverArray[3] = driver4;
		driverArray[4] = driver5;
		driverArray[5] = driver6;
		driverArray[6] = driver7;
		driverArray[7] = driver8;
		driverArray[8] = driver9;
		driverArray[9] = driver10;

		String isDriverExist = travel.retriveByDriverId(driverArray, 108);
		System.out.println(isDriverExist);

		isDriverExist = travel.retriveByDriverId(driverArray, 101);
		System.out.println(isDriverExist);

		isDriverExist = travel.retriveByDriverId(driverArray, 102);
		System.out.println(isDriverExist);

		isDriverExist = travel.retriveByDriverId(driverArray, 103);
		System.out.println(isDriverExist);

		System.out.println("--------Count Of Drivers By Category--------");

		int carDriverCount = travel.retriveCountOfDriver(driverArray, "Car");
		System.out.println("Car Category : " + carDriverCount);

		int autoDriverCount = travel.retriveCountOfDriver(driverArray, "Auto");
		System.out.println("Auto Category : " + autoDriverCount);

		int lorryDriverCount = travel.retriveCountOfDriver(driverArray, "Car");
		System.out.println("Lorry Category : " + lorryDriverCount);

		System.out.println("--------Retrieve Driver Array By Category--------");

		System.out.println("----Car Category----");
		Driver[] categoryDrivers = travel.retriveDriver(driverArray, "Car");
		for (Driver d : categoryDrivers)
			System.out.println(d);

		System.out.println("----Auto Category----");
		categoryDrivers = travel.retriveDriver(driverArray, "Auto");
		for (Driver d : categoryDrivers)
			System.out.println(d);

		System.out.println("----Lorry Category----");
		categoryDrivers = travel.retriveDriver(driverArray, "Lorry");
		for (Driver d : categoryDrivers)
			System.out.println(d);

		System.out.println("----Retrieve Maximum Distance Traveled Driver Object----");
		Driver d = travel.RetriveMaximumDistanceTravelledDriver(driverArray);
		System.out.println(d);

	}
}
