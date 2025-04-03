# JUnit Calculator Testing Project

This repository contains a comprehensive set of unit tests for the Calculator library (Calculator-1.0.jar). The project demonstrates proper unit testing practices using JUnit 5, including parameterized tests, test lifecycle management, and proper test organization.

## 🛠 Technologies Used

- JUnit 5 (Jupiter)
- Maven
- Maven Surefire Plugin
- Maven Failsafe Plugin

## 🔍 Features

The project includes unit tests for all Calculator methods:

- Basic Arithmetic Operations:
  - Addition (long and double)
  - Subtraction (long and double)
  - Multiplication (long)
  - Division (long and double)
- Trigonometric Functions:
  - Sine (sin)
  - Cosine (cos)
  - Tangent (tg)
  - Cotangent (ctg)
- Other Mathematical Functions:
  - Power (pow)
  - Square Root (sqrt)
- Number Properties:
  - Positivity Check
  - Negativity Check

## 🚀 Getting Started

### Prerequisites

- Java JDK 11 or higher
- Maven 3.6 or higher
- IDE (IntelliJ IDEA, Eclipse, or VS Code recommended)

### Installation

1. Clone the repository:
```bash
git clone https://github.com/MCaius/JUnit-UnitTest-Example.git
cd JUnit-UnitTest-Example
```

2. Make sure you have the Calculator-1.0.jar in your local Maven repository. If not, you'll need to install it:
*This file is not provided 
```bash
mvn install:install-file -Dfile=path/to/Calculator-1.0.jar -DgroupId=com.epam.tat.module4 -DartifactId=calculator -Dversion=1.0 -Dpackaging=jar
```

3. Build the project:
```bash
mvn clean install
```

### Running Tests

1. Run all tests:
```bash
mvn test
```

2. Generate test reports:
```bash
mvn surefire-report:report
```
The report will be generated in `target/reports/surefire.html`

## 📊 Test Structure

Each Calculator method has its own dedicated test class, following the Single Responsibility Principle:

- `AdditionTest.java`
- `SubtractionTest.java`
- `MultiplicationTest.java`
- `DivisionTest.java`
- `SinTest.java`
- `CosTest.java`
- `TangentTest.java`
- `CotangentTest.java`
- `PowerTest.java`
- `SquareRootTest.java`
- `PositivityTest.java`
- `NegativityTest.java`

## 🧪 Test Features

- Parameterized tests using `@ParameterizedTest`
- Test data from CSV files and inline sources
- Proper test lifecycle management with `@BeforeEach` and `@AfterEach`
- Descriptive test names using `@DisplayName`
- Parallel test execution enabled
- Comprehensive assertions for both positive and negative test cases

## 📸 Screenshots

- Test execution results from IDE

![tests-1](https://github.com/user-attachments/assets/b9f88b8c-81bc-44af-9224-c7218fbaa75c)

![tests-2](https://github.com/user-attachments/assets/6c5879ad-f0aa-4b0c-b660-28960bdfec0c)

- Generated test reports surefire

![surefire-report](https://github.com/user-attachments/assets/ac06a960-2170-43e1-86ad-09bab9ec4272)


## 📝 Notes

- Some tests do fail to showcase the improper implementation of methods in the Calculator class from the source file Calculator-1.0.jar file.
- Tests are configured to run in parallel for better performance
- The Calculator-1.0.jar is required as a test dependency (This file is not provided)
- All test classes follow a consistent structure with proper setup and teardown methods


