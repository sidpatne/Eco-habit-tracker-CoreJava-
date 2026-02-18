🌱 Eco Habit Tracker
📌 Project Overview

Eco Habit Tracker is a Core Java Console-Based CRUD Application built using the MVC (Model-View-Controller) architecture.

The application helps users track their eco-friendly habits such as reducing plastic usage, saving water, recycling, etc.

This project demonstrates:

Core Java concepts

OOP principles

MVC design pattern

CRUD operations

Console-based user interaction

🏗️ Architecture Used

The project follows the MVC (Model-View-Controller) pattern:

Model → Represents the data (Habit class)

View → Handles console output display

Controller → Contains business logic and CRUD operations

📁 Project Structure
EcoHabitTracker/
│
├── model/
│   └── Habit.java
│
├── view/
│   └── HabitView.java
│
├── controller/
│   └── HabitController.java
│
└── Main.java

✨ Features

➕ Add a new eco habit

📋 View all habits

✏ Update existing habit

❌ Delete a habit

🖥️ Console-based interaction

🧠 In-memory data storage

🛠️ Technologies Used

Java (Core Java)

OOP Concepts

MVC Architecture

Java Collections (ArrayList)

Scanner Class for Input

📚 Concepts Covered

Classes and Objects

Encapsulation

Constructors

Getters and Setters

Lists and Collections

Loops and Conditionals

Separation of Concerns (MVC)

🚀 How to Run the Project
1️⃣ Clone or Download the Project
git clone <repository-url>


Or download and extract the ZIP file.

2️⃣ Compile the Project

Navigate to the project folder and run:

javac model/*.java view/*.java controller/*.java Main.java

3️⃣ Run the Application
java Main

📖 How It Works

The user selects an option from the menu.

The Controller processes the request.

The Model stores or updates the data.

The View displays the output.

📸 Sample Menu
====== Eco Habit Tracker ======
1. Add Habit
2. View All Habits
3. Update Habit
4. Delete Habit
5. Exit

🎯 Example Use Cases

Track daily water saving habits

Monitor plastic reduction efforts

Record recycling streak

Track eco-friendly commuting

🔮 Future Enhancements

Add file storage (data persistence)

Connect to MySQL using JDBC

Add user authentication

Convert into GUI application (JavaFX/Swing)

Add statistics dashboard
