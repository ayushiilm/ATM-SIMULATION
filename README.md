# ATM Simulation System

This **ATM Simulation** project is a console-based application designed to replicate the essential functionality of an Automated Teller Machine (ATM). Developed in **Java** with **DBMS integration**, it allows users to securely perform basic banking operations such as **balance inquiry**, **cash withdrawal**, and **deposit**. With a focus on realistic and secure interactions, the project incorporates features like **user authentication** and **transaction validation** to ensure a user experience similar to real-world ATMs.

## Project Features

- **User Authentication**: Secure login with PIN verification to authenticate users before performing transactions.
- **Balance Inquiry**: Allows users to view their current balance in real-time, retrieved directly from the database.
- **Cash Deposit and Withdrawal**: Ensures secure and accurate balance updates with each transaction, including checks to prevent overdrafts.
- **Error Handling and Security**: Incorporates exception handling, PIN hashing, and database query protection to safeguard user data.

## Technologies Used

- **Java**: Core application logic and object-oriented programming for ATM operations.
- **JDBC (Java Database Connectivity)**: Facilitates database interaction, allowing secure storage and retrieval of user information and account balances.
- **SQL Database**: A structured database system stores user details and balances for persistent data management.

## How It Works

1. **User Login**: Users enter their account number and PIN, which are verified with the database for authentication.
2. **Transaction Options**: Once logged in, users can check their balance, make deposits, or withdraw cash.
3. **Data Management**: Each transaction updates the user's account balance in real-time using secure SQL queries to maintain data integrity.
4. **Session Management**: The application includes session timeouts and error handling for invalid inputs or failed transactions.

This project demonstrates the integration of Java and SQL for a practical application, focusing on secure transactions, data integrity, and error handling. Future enhancements could include a graphical user interface, support for multi-threading, and additional banking services.
