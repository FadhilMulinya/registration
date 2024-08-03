
# Java Swing Registration Form Projects

This repository hosts two Java Swing-based registration form applications that demonstrate basic and advanced GUI functionality for collecting user information and displaying it in a table. These projects are great for beginners looking to learn Java Swing and for experienced developers seeking to enhance their GUI design skills.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Screenshots](#screenshots)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Introduction

The repository contains two distinct Java Swing projects:

1. **Basic Registration Form**: A simple form allowing users to input basic information like ID, Name, Gender, Address, and Contact, and then display the details in a table.

2. **Advanced Registration Form**: An extended version with additional fields like Mobile, Date of Birth (D.O.B), and an "Accept Terms and Conditions" checkbox, along with form validation and reset functionality.

These projects are designed to provide a clear understanding of how to create interactive user interfaces using Java Swing components like `JTextField`, `JRadioButton`, `JTable`, `JButton`, and more.

## Features

### Basic Registration Form
- User-friendly interface for entering basic personal details.
- Displays registered information in a table.
- Form validation to ensure all fields are filled.
- Simple and clean design.

### Advanced Registration Form
- Additional input fields for Mobile, D.O.B, and Address.
- Gender selection with radio buttons.
- Date of Birth selection using drop-downs.
- Terms and Conditions checkbox.
- Submit and Reset buttons for enhanced form interaction.
- Improved form validation.

## Screenshots

### Basic Registration Form
![Basic Registration Form](/assets/images/basic1.jpeg)

### Advanced Registration Form
![Advanced Registration Form](/assets/images/advanced1.jpeg)
![Advanced Registration Form](/assets/images/advanced2.jpeg)

## Installation

### Prerequisites

Before running these projects, ensure you have the following installed on your system:

- **Java Development Kit (JDK)**: You need to have `javac`, the Java compiler, installed. You can download it from the [official Oracle website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or install it via a package manager (e.g., `apt-get` on Ubuntu, `brew` on macOS).

### Steps

1. **Clone the repository**:
   ```bash
   git clone git@github.com:FadhilMulinya/registration.git
   ```
   ```bash
   git clone https://github.com/FadhilMulinya/registration.git
   ```
   ```bash
   git clone gh repo clone FadhilMulinya/registration
   ```

2. **Navigate to the project directory**:
   ```bash
   cd registration
   ```

3. **Compile the Java files**:
   ```bash
   javac -d bin src/*.java
   ```
   This command compiles all the Java files in the `src` directory and places the compiled classes in the `bin` directory.

4. **Run the application**:
   ```bash
   java -cp bin Main
   ```
   ```bash
   java -cp bin Registration
   ```


5. **Or Open in an IDE**:
   - Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans).
   - Build and run the project to see the forms in action.

## Usage

These projects can be used as a starting point for developing more complex applications that require user data collection. You can extend the functionality by adding features like database integration, user authentication, and more sophisticated form validation.

## Contributing

Contributions are welcome! If you have suggestions, ideas, or bug fixes, feel free to fork the repository and submit a pull request.

## License

![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

