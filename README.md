# 🔐 Password Manager (Java + JDBC + Swing)

## 📌 Project Description

This is a desktop-based Password Manager application built using **Java Swing** and **JDBC**.
It allows users to securely store, manage, and retrieve credentials such as website names, usernames, and passwords.

The project demonstrates strong understanding of **database connectivity, CRUD operations, and GUI development**.

---

## 🚀 Features

* 🔐 User Login System (Authentication)
* ➕ Add new credentials
* 📋 View all saved passwords
* ✏️ Update existing records
* ❌ Delete credentials
* 🔍 Search by website
* 🖥️ GUI using Java Swing
* 🗄️ MySQL Database integration using JDBC

---

## 🛠 Tech Stack

* Java (Core Java)
* Swing (GUI)
* JDBC (Database Connectivity)
* MySQL

---

## 📸 Screenshots

### 🔐 Login Screen

![Login](screenshots/login.png)

### 📊 Dashboard

![Dashboard](screenshots/dashboard.png)

### ➕ Add Password

![Add](screenshots/add.png)

### 📋 View Data

![View](screenshots/view.png)

### 🔍 Search Data

![Search](screenshots/search.png)

---

## 🗄️ Database Setup

Run the following SQL queries in MySQL:

```sql
CREATE DATABASE password_manager;

USE password_manager;

CREATE TABLE users (
    username VARCHAR(100),
    password VARCHAR(100)
);

INSERT INTO users VALUES ('admin', 'admin');

CREATE TABLE passwords (
    id INT PRIMARY KEY AUTO_INCREMENT,
    website VARCHAR(100),
    username VARCHAR(100),
    password VARCHAR(100)
);
```

---

## ▶️ How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/amisha-15/PasswordManager-java.git
```

2. Open project in IntelliJ IDEA

3. Configure database in `DBConnection.java`:

```java
jdbc:mysql://localhost:3306/project
username: root
password: amisha@15
```

4. Run:

```
LoginFrame.java
```

---

## 📂 Project Structure

```
src/
 ├── DBConnection.java
 ├── PasswordManager.java
 ├── LoginFrame.java
 ├── DashboardFrame.java
 ├── AddFrame.java
 ├── ViewFrame.java
 ├── UpdateFrame.java
 ├── DeleteFrame.java
 └── SearchFrame.java
```

---

## 💡 Key Concepts Used

* JDBC (Connection, PreparedStatement, ResultSet)
* CRUD Operations
* Exception Handling
* Java Swing GUI
* Event Handling

---

## 🔮 Future Improvements

* 🔐 Password Encryption (Security Enhancement)
* 🎨 Advanced UI Design
* 📤 Export data to CSV
* 🔍 Search with partial match
* 🧑‍💻 Multi-user support

---

## 👩‍💻 Author

Amisha Pawar

---

## 🔗 GitHub Repository

https://github.com/amisha-15/PasswordManager-java
