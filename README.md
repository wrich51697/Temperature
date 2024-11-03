# Temperature Project

## Overview
The Temperature project is a Java application for managing and converting temperature data between Celsius and Fahrenheit. It provides utility classes to facilitate temperature conversions, with a test suite implemented using JUnit 5.

## Features
- Convert temperatures from Celsius to Fahrenheit.
- Convert temperatures from Fahrenheit to Celsius.
- Includes JUnit 5 tests to verify conversion accuracy.

## Project Structure
- `src/main/java/com/example/temperature`: Contains the main Java classes.
    - **Celsius.java**: Class representing Celsius temperatures, with methods to convert to Fahrenheit.
    - **Fahrenheit.java**: Class representing Fahrenheit temperatures, with methods to convert to Celsius.
- `src/test/java/com/example/temperature`: Contains the JUnit test class for verifying the functionality.
    - **TemperatureTest.java**: JUnit 5 test class to ensure accurate temperature conversions.

## Prerequisites
- Java 11 or higher
- Maven 3.6 or higher

## Setup Instructions
1. **Clone the repository**:
   ```bash
   git clone <repository-url>

2. **Navigate to the project directory:**

    ``` bash
    cd Temperature
   
3. **Build the project: Run Maven to compile and package the project.**

    ```bash
    ./mvnw clean package   # For Linux/Mac
    mvnw.cmd clean package # For Windows
    ```
   
# Running the Test
**To verify the functionality, you can run the JUnit tests using Maven:**

```bash
./mvnw test   # For Linux/Mac
mvnw.cmd test # For Windows
```


    

