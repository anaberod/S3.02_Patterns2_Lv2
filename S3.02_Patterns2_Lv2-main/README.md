
# 🧠 Stock Observer Pattern – Level 2

## 📄 Description – Exercise Statement

This project implements the **Observer Design Pattern** in Java. The scenario simulates a stock trading system where a `StockObservable` (subject) notifies multiple `StockAgency` observers when the stock market rises or falls.

**Statement:**  
Design a system where a **Stock Agent (Observable)** notifies various **Stock Agencies (Observers)** whenever the market goes up or down. The Observable must keep references to all Observers and notify them of state changes.

## 💻 Technologies Used

- Java 8+
- IntelliJ IDEA / Eclipse (Recommended IDEs)
- Git & GitHub for version control

## 📋 Requirements

- Java Development Kit (JDK) 8 or higher
- Git (to clone the repository)
- A Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse)
- No external dependencies required

## 🛠️ Installation

To set up the project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/anaberod/S3.02_Patterns2_Lv2.git
   ```
2. Open the project in your IDE.
3. Compile all `.java` files inside the `src` folder.

## ▶️ Execution

To run the project:

1. Locate and open the `Main.java` file.
2. Run the `main()` method.
3. You should see output in the console indicating how each stock agency received notifications when the market went up or down.


## 🌐 Deployment

This project is intended for educational purposes and does not require deployment.  
However, if needed, it can be packaged into a `.jar` file:

```bash
javac *.java
jar cvfe StockObserverApp.jar Main *.class
java -jar StockObserverApp.jar
```

## 🤝 Contributions

Feel free to fork the repository and open a pull request.  
Contributions should follow these guidelines:

- Keep class and method names meaningful.
- Follow Java naming conventions.
- Use clean and modular code.
- Add comments where necessary.
- Ensure your code compiles and runs without errors.

---
