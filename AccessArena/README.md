# Access Arena - Stadium Management System

A comprehensive Stadium Management System built using Java for the front end and MySQL for the backend. This system manages various aspects of a stadium, including user management, match scheduling, ticket booking, and food ordering.

## Features

The system is divided into five main modules:

1. **User**
2. **Admin**
3. **Matches**
4. **Booking**
5. **Food**

### User Module

- **Registration and Login:** Users can register for a new account or log in if they already have an account.
- **Profile Management:** Users can update and delete their profiles.
- **Match Selection:** Users can select from available matches.
- **Seat Selection:** Users can choose from available seats and proceed to payment.
- **Ticket Generation:** A ticket with all booking details and seat number is generated.
- **Food Pre-order:** Users can pre-order food items from the available menu.
- **Bill Generation:** A final bill for the selected food items is generated.

### Admin Module

- **Login:** Admins can log in using a default password.
- **Employee Management:** Admins can view, update, and search for employee details.
- **Match Management:** Admins can add, update, and delete matches.
- **Stadium Management:** Admins can manage stadium details and alter the price of each stand.
- **Food Management:** Admins can manage the food menu, including adding, updating, and deleting items, and search via different operations.
- **Booking Status:** Admins can view the booking status and user details.

### Matches Module

- Users can select from available matches.
- Proceed to choose seat categories.
- Confirm seat selection and proceed with payment.

### Booking Module

- Print ticket with booking details and seat number.
- Option for users to pre-order food at the stadium.
- Generate final bill for food items ordered.

### Food Module

- Admin can manage food menu (add, update, delete items).
- Users can pre-order food from the available menu.
- Print bill for food items ordered.

## Object-Oriented Programming (OOP) Concepts Used

### 1. Encapsulation

Encapsulation is used to keep the data safe from outside interference and misuse. In this project, data members (fields) of classes like `User`, `Admin`, `Match`, `Booking`, and `Food` are kept private, and public getter and setter methods are provided to access and update the data.

### 2. Inheritance

Inheritance allows one class to inherit the fields and methods of another class. In this project, `User` and `Admin` classes might inherit from a common base class `Person` to reuse the common properties like name, email, etc.

### 3. Polymorphism

Polymorphism allows methods to do different things based on the object it is acting upon. Method overriding is used in this project to allow subclasses like `User` and `Admin` to provide specific implementations of methods that are defined in their superclass.

### 4. Abstraction

Abstraction is used to hide the complex implementation details and show only the essential features of the object. Abstract classes and interfaces might be used in this project to define the structure without providing the implementation details.

## Installation

1. Ensure you have Java and MySQL installed on your system.
2. Clone this repository to your local machine.
   ```sh
   git clone 
3. Set up the MySQL database using the provided SQL scripts in the database folder.
4. Open the project in your preferred Java IDE.
5. Update the database connection details in the configuration files.
   
### Contributing

Contributions are welcome! Please fork this repository and submit a pull request for any enhancements or bug fixes.

