# Car Rental System

This project is a simple Car Rental System built using Java OOP concepts. The system allows users to rent cars, generate confirmation slips, and manage car rentals. The project is structured with four main classes: `Car`, `Customer`, `Rental`, and `RentalSystem`.

## Features

- **Rent a Car**: Users can select a car and rent it for a specified number of days.
- **Get Confirmation Slip**: After renting a car, the system generates a confirmation slip with rental details.
- **Java OOP Concepts**: The project is implemented using Object-Oriented Programming principles in Java, including encapsulation, inheritance, and composition.

## Project Structure

### 1. Car Class
- **Attributes**:
  - `id`: Unique identifier for the car.
  - `model`: The model of the car.
  - `company`: The manufacturer of the car.
  - `basePrice`: The base price for renting the car.
  - `isAvailable`: Boolean value indicating whether the car is available for rent.

- **Methods**:
  - Getters and setters for each attribute to enforce encapsulation.

### 2. Customer Class
- **Attributes**:
  - `name`: The name of the customer.
  - `id`: Unique identifier for the customer.

- **Methods**:
  - Basic constructor and getter methods.

### 3. Rental Class
- **Attributes**:
  - `car`: An object of the `Car` class representing the rented car.
  - `customer`: An object of the `Customer` class representing the customer.
  - `days`: The number of days for which the car is rented.

- **Methods**:
  - Constructor and methods to calculate total rental cost and generate confirmation slips.

### 4. RentalSystem Class
- **Purpose**: 
  - The main operational class that manages the rental process. It handles customer requests, car availability, and rental transactions.
