# 🔐 User Login System

A simple Java console-based system for validating user login credentials and updating passwords securely.

## 📦 Features
- User login with username and password
- Password validation logic
- Option to change password after login
- No direct access to credentials (encapsulation)

## 🧠 Concepts Used
- Encapsulation (`private` fields)
- `Scanner` for user input
- Conditional logic and flow control
- Methods for validation and password updates

## 🛠️ Tech Stack
- Java (Core OOP)
- Console-based interaction

## 📁 File Structure
UserLoginSystem/
├── UserLoginSystem.java
└── README.md

## 🧪 Sample Output
Enter Username : Vishva
Enter Password : 12345678
Login Successful

Do you want to Change Password ?(yes/no) : yes
Enter Old_Password : 12345678
Enter New_Password : vishva123
Password Changed

Do you want to Login ?(yes/no) : yes
Enter Username : Vishva
Enter Password : vishva123
Login Successful

## 🏃 How to Run
```bash
javac UserLoginSystem.java
java UserLoginSystem
