# Demoblaze Automation Testing Project

## Project Overview
This project involves automated testing of the [Demoblaze](https://www.demoblaze.com/index.html) website using Selenium WebDriver and TestNG. The goal is to ensure the functionality and reliability of the website's features through comprehensive automated test cases.

## Table of Contents
- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Running Tests](#running-tests)
- [Test Cases](#test-cases)
- [Contributing](#contributing)
- [License](#license)

## Technologies Used
- **Java**: Programming language for writing test scripts.
- **Selenium WebDriver**: Tool for automating web application testing.
- **TestNG**: Testing framework for running and managing test cases.
- **Maven**: Build automation tool for managing project dependencies.

## Setup Instructions
1. **Clone the Repository**:
   ```sh
   git clone https://github.com/your-username/demoblaze-automation.git
   cd demoblaze-automation
   ```

2. **Install Dependencies**:
   Ensure you have Maven installed. Run the following command to install project dependencies:
   ```sh
   mvn clean install
   ```

3. **Configure WebDriver**:
   - Download the appropriate WebDriver for your browser (e.g., ChromeDriver for Chrome).
   - Place the WebDriver executable in a directory included in your system's PATH.

4. **Set Up TestNG**:
   - Ensure TestNG is configured in your IDE (e.g., IntelliJ IDEA).

## Running Tests
To run the test suite, use the following Maven command:
```sh
mvn test
```

## Test Cases
The project includes automated test cases for the following features of the Demoblaze website:
- **User Signup**: Verifies the user sign-up process.
- **Login**: Tests the login functionality with valid and invalid credentials.
- **Product Search**: Ensures the search functionality works correctly.
- **Add to Cart**: Tests adding products to the shopping cart.
- **Checkout Process**: Verifies the checkout process, including payment.

## Contributing
Contributions are welcome! Please follow these steps to contribute:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

