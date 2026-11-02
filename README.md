# ecom Automation Framework 🚀

An automated end-to-end (E2E) testing framework built for **QKart**, a modern e-commerce web application. This project ensures the reliability of critical user workflows including user registration, authentication, product search, cart management, and seamless checkout processing.

---

## 🛠️ Tech Stack & Tools

- **Programming Language:** Java
- **Automation Engine:** Selenium WebDriver
- **Testing Framework:** TestNG
- **Data-Driven Testing:** Apache POI (Excel integration)
- **Design Pattern:** Page Object Model (POM)
- **Build & Dependency Management:** Maven
- **Version Control:** Git & GitHub

---

## 📂 Project Architecture

```text
ecom/
├── src/
│   ├── main/java/
│   │   ├── pages/         # Page Object Model classes (Login, Products, Checkout, etc.)
│   │   └── base/          # Base class for driver initialization and teardown
│   └── test/java/
│       └── tests/         # Test suites and test cases (TestNG annotations)
├── resources/             # Configuration files and test data (Excel/JSON)
├── pom.xml                # Maven configuration and dependencies
└── README.md

✨ Key Features & Capabilities
Page Object Model (POM): Decouples test scripts from page locators and actions, improving code maintainability and reusability.

Data-Driven Testing: Utilizes Apache POI to fetch test data dynamically from external spreadsheets, supporting multiple data sets for login and checkout scenarios.

Robust Synchronization: Implements explicit and implicit waits to handle dynamic web elements reliably and prevent flakiness.

Automated Workflows:

User Registration & Secure Login validation

Advanced product searching, filtering, and catalog navigation

Dynamic cart operations (adding, updating quantities, removing items)

End-to-end checkout and order placement validation

🚀 Getting Started
Prerequisites
Make sure you have the following installed on your machine:

Java JDK (8 or higher)

Maven

Google Chrome (along with compatible ChromeDriver managed via WebDriverManager)

Cloning & Running Tests
Clone the repository:

Bash
git clone [https://github.com/Antanukumar/ecom.git](https://github.com/Antanukumar/ecom.git)
Navigate to the project directory:

Bash
cd ecom
Run the test suite using Maven:

Bash
mvn clean test
