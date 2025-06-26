# 💼 Account Management System

A simple Java project that simulates basic banking operations using **inheritance** and **encapsulation**. It includes two types of accounts: `SavingsAccount` and `CurrentAccount`, both inheriting from a base class `BankAccount`.

## 💡 Features
- Deposit and withdraw money from bank accounts.
- Interest calculation for savings accounts.
- Overdraft handling for current accounts.
- Demonstrates hierarchical inheritance.
- Clean output with structured account details.

## 🧪 Classes Used
- `BankAccount` (Base class)
- `SavingsAccount` (Child)
- `CurrentAccount` (Child)

## 🛠️ Technologies Used
- Java
- OOP Concepts (Encapsulation, Inheritance)
- Method Overriding

## 📁 File Structure
AccountManagementSystem/
├── AccountManagementSystem.java
└── README.md

## Sample Output
Money Deposited Rs.5000.0 on Account 2216171
Intrest of Rs.2750.0 Added to Account 2216171

     Account Details
---------------------------
Account Number : 2216171
Account Balance : 57750.0
---------------------------

Money Deposited Rs.4000.0 on Account 2216171
Money Withdrawl Rs.60000.0 on Account 2216171

Over Draft Limit : 24000.0

     Account Details
---------------------------
Account Number : 2216171
Account Balance : -10000.0
---------------------------

## 🚀 How to Run
```bash
javac AccountManagementSystem.java
java AccountManagementSystem


