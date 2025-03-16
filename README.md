# Airline Reservation System

## 📌 Project Overview
The **Airline Reservation System** is a Java-based desktop application that allows users to book flight tickets, view flight details, and manage reservations. It provides an **admin panel** for managing bookings and a **user interface** for customers to reserve seats.

## 🛠 Features
### ✅ **User Module**
- Book a flight ticket by entering details such as seat number, name, age, email, source, and destination.
- View booking confirmation messages.
- Prevent duplicate seat bookings.

### ✅ **Admin Module**
- Secure authentication for admin access.
- Retrieve and display all booked flight details.
- Manage flight bookings efficiently.

## 💻 Technologies Used
- **Java (Swing, AWT)** – GUI development.
- **JDBC (Java Database Connectivity)** – Database operations.
- **Oracle Database** – Data storage.

## 🚀 Installation & Setup
### 1️⃣ **Prerequisites**
Ensure you have the following installed:
- Java JDK (17 or above)
- Oracle Database (or MySQL if adapted)
- JDBC Driver for Oracle/MySQL
- An IDE like IntelliJ IDEA or Eclipse

### 2️⃣ **Clone the Repository**
```sh
$ git clone https://github.com/your-username/airline-reservation-system.git
$ cd airline-reservation-system
```

### 3️⃣ **Database Setup**
1. Open **Oracle SQL Developer** (or MySQL Workbench if applicable).
2. Run the following SQL commands to create the database and tables:
```sql
CREATE TABLE AMS (
    SEATNO INT PRIMARY KEY,
    NAME VARCHAR(50),
    AGE INT,
    EMAIL VARCHAR(100),
    SRC VARCHAR(50),
    DEST VARCHAR(50)
);

CREATE TABLE ADMIN_TABLE (
    ADMIN_ID INT PRIMARY KEY,
    PASSWORD VARCHAR(50)
);

INSERT INTO ADMIN_TABLE VALUES (1, 'admin123');
```

### 4️⃣ **Run the Application**
1. Open the project in your preferred IDE.
2. Compile and run the `Main.java` file:
```sh
$ javac Main.java
$ java Main
```

## 🛠 How It Works
### 🟢 **For Users:**
1. Click on the **User** button.
2. Enter flight details (seat number, name, age, email, source, destination).
3. Click **Submit** to book the flight.
4. Get a confirmation message.

### 🔵 **For Admins:**
1. Click on the **Admin** button.
2. Enter the **password** (default: `admin123`).
3. View all customer flight details.

## 🔥 Future Enhancements
- **Flight schedule management.**
- **Payment gateway integration.**
- **Email notifications for booking confirmation.**
- **User login system with authentication.**

## 📜 License
This project is **open-source** under the **MIT License**.

## 🤝 Contributing
1. Fork the repository.
2. Create a new branch: `git checkout -b feature-branch`
3. Commit your changes: `git commit -m 'Add new feature'`
4. Push to your branch: `git push origin feature-branch`
5. Create a Pull Request.


