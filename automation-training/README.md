# Automation Training Project

This is a Maven project for Selenium + Rest Assured training.

## Project Structure

```
automation-training/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── aw/
│   │               └── automationtraining/
│   └── test/
│       └── java/
│           └── com/
│               └── aw/
│                   └── automationtraining/
│                       ├── SeleniumTest.java
│                       └── RestAssuredTest.java
├── pom.xml
├── testng.xml
├── .gitignore
└── README.md
```

## Dependencies

- **Java**: 17
- **TestNG**: 7.9.0
- **Selenium**: 4.21.0
- **WebDriverManager**: 5.8.0
- **Rest Assured**: 5.4.0
- **Jackson Databind**: 2.16.1

## Test Cases

### Selenium Test
- **File**: `SeleniumTest.java`
- **Purpose**: Opens https://example.org and asserts the page title
- **Features**: Uses WebDriverManager for automatic driver management

### Rest Assured Test
- **File**: `RestAssuredTest.java`
- **Purpose**: Calls https://reqres.in/api/users?page=2 and asserts page=2
- **Features**: Two test methods demonstrating different assertion approaches

## Running Tests

### Prerequisites
- Java 17 installed
- Maven installed
- Chrome browser installed (for Selenium tests)

### Commands

1. **Compile the project**:
   ```bash
   mvn compile
   ```

2. **Run all tests using TestNG**:
   ```bash
   mvn test
   ```

3. **Run specific test class**:
   ```bash
   mvn test -Dtest=SeleniumTest
   mvn test -Dtest=RestAssuredTest
   ```

4. **Clean and run**:
   ```bash
   mvn clean test
   ```

## Test Results

The tests will:
- Open Chrome browser and navigate to example.org
- Verify the page title is "Example Domain"
- Make API call to reqres.in and verify response data
- Print test results to console

## Notes

- WebDriverManager automatically downloads and manages ChromeDriver
- Rest Assured tests use both programmatic assertions and JSON path assertions
- All tests are configured to run via TestNG suite defined in testng.xml
