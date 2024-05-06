
# Name Sorter Project

## Overview

This project implements a name sorting functionality using solid engineering principles. The application is written in Java, built with Maven, and includes automated tests using both acceptance tests to validate the logic and unit tests to provide assurance of individual components.

Additionally, the project utilizes Docker for containerization, allowing for easy deployment and scalability, and includes a `.travis.yml` file to set up build pipelines on Travis CI for continuous integration.

## Features

- Sorts a list of names alphabetically.
- Supports both acceptance tests and unit tests.
- Utilizes Docker for containerization.
- Configured for continuous integration with Travis CI.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Apache Maven
- Docker

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/leelulibo/nameSorter
   ```

2. Build the project using Maven:

   ```bash
   mvn clean package
   ```

3. Run the Docker container:

   ```bash
   docker build -t name-sorter .
   docker run name-sorter
   ```

## Usage

Once the application is running, you can provide a list of names as input, and the application will sort them alphabetically.

# Running the Code

To run the code after building the project, execute:
1. # Navigate to the root directory of your project
2. # Compile Java source files:
javac -d bin src\main\java\org\example\*.java

3. # Run Java program:
java -cp bin org.example.Main path\to\input-file.txt


## Automated Testing

### Acceptance Tests

The acceptance tests validate the logic of the application by testing the functionality end-to-end. To run the acceptance tests, execute:

```bash
make verify
```

### Unit Tests

The unit tests provide assurance of individual components within the application. To run the unit tests, execute:

```bash
make test
```

## Build Pipelines

The project includes a `.travis.yml` file for setting up build pipelines on Travis CI. The pipelines automatically build and test the project on every push to the repository, ensuring continuous integration.

## Contributing

Contributions are welcome! If you'd like to contribute to the project, please follow the [contribution guidelines](CONTRIBUTING.md).

## License

This project is licensed under the [MIT License](LICENSE).
