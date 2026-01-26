package com;

public class Travel {
	public boolean isCarDriver(Driver driver) {
		return driver.getCategory().equals("Car");
	}

	public String retriveByDriverId(Driver[] driverArray, int id) {
		for (Driver driver : driverArray) {
			if (driver.getDriverId() == id) {
				return "Driver name is " + driver.getDriverName() + " Belonging to the category " + driver.getCategory()
						+ " traveled " + driver.getTotalDistance() + " KM so far. ";
			}
		}
		return "Driver not found with this id";
	}

	public int retriveCountOfDriver(Driver[] driverArray, String category) {
		int count = 0;

		for (Driver driver : driverArray) {
			if (driver.getCategory().equals(category)) {
				count++;
			}
		}
		return count;
	}

	public Driver[] retriveDriver(Driver[] driver, String category) {
		Driver driverArray[] = new Driver[driver.length];
		int k = 0;
		for (int i = 0; i < driver.length; i++) {
			Driver d = driver[i];
			if (d.getCategory().equals(category)) {
				driverArray[k++] = d;
			}
		}
		return driverArray;
	}

	public Driver RetriveMaximumDistanceTravelledDriver(Driver[] driverArray) {
		int index = -1;
		double maxDistance = 0;
		Driver d = null;
		for (int i = 0; i < driverArray.length; i++) {
			d = driverArray[i];
			if (d.getTotalDistance() > maxDistance) {
				maxDistance = driverArray[i].getTotalDistance();
				index = i;
			}
		}
		return driverArray[index];
	}
}
