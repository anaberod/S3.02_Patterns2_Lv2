# 🧠 Stock Observer Pattern – Level 2

## 📄 Description

This project demonstrates the **Observer Design Pattern** in Java through a simplified stock market system.  
A `StockObservable` (Subject) notifies multiple `StockAgency` (Observer) instances about market changes such as **"market up"**, **"market down"**, or **"market closed"**.

---

## 🎯 Exercise Statement

Design a system where a **Stock Agent (Observable)** notifies various **Stock Agencies (Observers)** when the market goes up or down.  
The Observable must keep references to all Observers and notify them of state changes.

---

## 🧠 What is the Observer Pattern?

The **Observer Pattern** is a behavioral design pattern that defines a **one-to-many dependency** between objects so that when one object changes its state, all its dependents are notified automatically.

In this project:
- The **`StockMarket`** acts as the Observable.
- The **`StockAgency`** instances act as the Observers.
- A **`StockEvent`** carries structured data like event type and description.

This promotes **loose coupling** and makes the system **extensible**.

---

## 📦 Project Structure

| Role                 | Class         | Description                                                        |
|----------------------|---------------|--------------------------------------------------------------------|
| Observable (Subject) | `StockMarket` | Manages a list of observers and notifies them of market changes.   |
| Observer             | `StockAgency` | Reacts to market updates by printing messages.                     |
| Event                | `StockEvent`  | Structured event containing type and description.                  |
| Main                 | `Main`        | Sets up and runs the market simulation.                            |

---

## 💻 Technologies Used

- Java 24
- IntelliJ IDEA or Eclipse
- Git & GitHub

---

## 📋 Requirements

- Java Development Kit (JDK) 8 or higher
- Git (for version control)
- A Java IDE (e.g., IntelliJ IDEA)

---

## 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/anaberod/S3.02_Patterns2_Lv2.git
   ```

2. Open the project in your IDE (IntelliJ IDEA or Eclipse).

3. Make sure `src` is marked as **Sources Root** in the IDE.

---

## ▶️ Execution

1. Open the file `Main.java`
2. Run the `main()` method
3. Sample output:
   ```
   Agency A received: The market is up
   Agency B received: The market is up
   Agency A received: The market is down
   Agency B received: The market has closed
   ```


---

## 🤝 Contributions

Feel free to fork the repository and submit pull requests.

**Guidelines:**
- Use meaningful class and method names
- Follow Java naming conventions
- Keep code clean and modular
- Add helpful comments
- Ensure code compiles and runs correctly

---
