# Leetcode Solutions by vemmkof

Welcome to the Leetcode Solutions repository! This repository contains my solutions to various Leetcode problems. The solutions are implemented in Java, following best practices and aiming for optimal performance. The repository is organized by problem number and includes a variety of data structures, algorithms, and problem-solving techniques.

## Table of Contents

- [About](#about)
- [Setup](#setup)
- [Structure](#structure)
- [Contributing](#contributing)
- [License](#license)

## About

This repository showcases solutions for Leetcode problems, focusing on a range of difficulty levels:

- **Easy**
- **Medium**
- **Hard**

The solutions aim to be clean, efficient, and thoroughly tested to ensure correctness.

### Features:
- Problem-solving using common algorithms and data structures such as Arrays, Linked Lists, Trees, Graphs, and more.
- Solutions tested using JUnit for automated unit testing.
- Solutions categorized by problem number for easy reference.

## Setup

To get started with this repository, follow the steps below:

### Prerequisites

- [JDK 17+](https://adoptopenjdk.net/) (or a later version) is required.
- A Maven build tool to manage dependencies.

### Cloning the Repository

Clone this repository to your local machine using:

```bash
git clone https://github.com/vemmkof/leetcode.git
cd leetcode
```

### Building the Project

Run:

```bash
mvn clean install
```


### Running Tests

Unit tests are provided for most solutions. To run them, use the following command:

Run:

```bash
mvn test
```



## Structure

The repository is organized as follows:

```
leetcode/
├── src/
│   └── main/java/com/vemmkof/leetcode/     # Java solutions for Leetcode problems
│       └── SolutionXXX.java                # Solution for a given problem
├── src/test/java/com/vemmkof/leetcode/     # Test classes for solutions
│       └── SolutionXXXTest.java            # Test cases for ProblemXXX.java
├── README.md                               # Project overview
├── pom.xml                                 # Maven build configuration (if using Maven)
└── build.gradle                            # Gradle build configuration (if using Gradle)
```

## Contributing

Contributions are welcome! If you'd like to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-name`).
3. Implement your changes or add a new solution.
4. Commit your changes (`git commit -am 'Add new solution for problem XXX'`).
5. Push to your branch (`git push origin feature-name`).
6. Create a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to browse through the solutions and contribute to improving them!
