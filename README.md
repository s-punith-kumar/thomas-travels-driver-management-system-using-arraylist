📌 Project Overview

The Thomas Travels – Driver Management System is a console-based Java application that manages driver information such as:

Driver ID

Driver Name

Vehicle Category (Car / Auto / Lorry)

Total Distance Travelled

All data is stored and processed using ArrayList of custom Driver objects, instead of arrays, to enable dynamic data handling and real-world flexibility.

🛠️ Technologies & Concepts Used

Core Java

Collections Framework

ArrayList

ListIterator

Wrapper Classes

Integer, Double

Interfaces & Implementation

Custom Exception Handling

OOPS Principles

Encapsulation

Abstraction

Loose Coupling

🧩 Project Structure
com.collections
│
├── Driver.java
├── TravelService.java
├── TravelServiceImpl.java
├── TestDriver.java
│
└── exceptions
    └── DriverNotFoundException.java

⚙️ Key Functionalities

Display all driver details

Display a specific driver

Check if a driver belongs to Car category

Retrieve driver by Driver ID

Count drivers based on category

Retrieve drivers category-wise

Identify the maximum distance travelled driver

Handle invalid driver lookups using custom exceptions

🚨 Exception Handling

Custom exception: DriverNotFoundException

Thrown when a driver with a given ID does not exist

Provides meaningful error messages instead of abrupt program termination

Improves robustness and user experience

🧠 Design Highlights

Interface-based design (TravelService) for better abstraction

Loose coupling between logic and implementation

Wrapper classes used for collection compatibility

ArrayList enables dynamic growth and easy data manipulation

Code is modular, readable, and maintainable

▶️ How to Run the Project

Clone the repository:

git clone https://github.com/s-punith-kumar/thomas-travels-driver-management-system-using-arraylist


Open the project in any Java IDE (Eclipse / IntelliJ)

Run the TestDriver.java file

Observe the console output for different driver operations

📈 Future Enhancements

Replace ArrayList with HashMap for faster lookup

Add file handling or database integration

Convert to a REST API using Spring Boot

Add unit testing (JUnit)

Improve sorting and searching logic

🙌 Acknowledgements

This project was developed as part of the AI Powered Java Full Stack Course under the guidance of:

Fayaz S (Trainer)

Krishna Mantravadi

Upendra Gulipilli

👤 Author

Punith Kumar
Java & Full Stack Learner
GitHub: https://github.com/s-punith-kumar
