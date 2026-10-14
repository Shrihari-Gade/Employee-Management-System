# Employee Management System

A backend application developed using Java, Spring Boot, and MySQL to manage employee information through RESTful APIs.

## About the Project

The Employee Management System simplifies employee record management by providing REST API endpoints to create, retrieve, update, and delete employee records. It uses MySQL for data persistence and Spring Boot to build the backend application.

## Features

- Create and register employee records
- Retrieve all employees and individual employee details
- Update existing employee information
- Delete employee records
- Store and manage data using MySQL
- RESTful API development with Spring Boot
- Database integration and request handling

## Technologies Used

| Technology | Purpose |
|---|---|
| Java | Backend programming |
| Spring Boot | Application development |
| Spring Web | REST API creation |
| MySQL | Relational database |
| Maven | Dependency management and build |
| Git & GitHub | Version control and source code hosting |
| Eclipse IDE | Development environment |

## Project Structure

```text
Employee-Management-System/
├── src/
│   └── main/
│       ├── java/
│       │   └── [your Java package]/
│       │       ├── controller/
│       │       ├── service/
│       │       ├── repository/
│       │       └── entity/
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
```

*Note: The package and folder names above are illustrative. Adjust them to match your actual project structure.*

## Prerequisites

Install the following before running the application:

- Java JDK compatible with your project
- Maven
- MySQL Server
- Eclipse IDE or another Java IDE

## Setup and Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/Shrihari-Gade/Employee-Management-System.git
   ```

2. Open the project in Eclipse as an existing Maven project.

3. Create a MySQL database for the application.

4. Configure your database connection in `application.properties`. Set your database username and password through environment variables, such as `DB_USERNAME` and `DB_PASSWORD`, if your configuration uses them.

5. Update Maven dependencies and build the project.

6. Run the Spring Boot application from its main application class.

## REST API Endpoints

Base URL: `http://localhost:8081/api/employees`

| Method | Endpoint | Purpose |
|---|---|---|
| GET | `/api/employees` | Retrieve all employees |
| GET | `/api/employees/{id}` | Retrieve an employee by ID |
| POST | `/api/employees` | Create an employee |
| PUT | `/api/employees/{id}` | Update an employee |
| DELETE | `/api/employees/{id}` | Delete an employee |

*Confirm each endpoint and its request format against your actual controller before relying on this table.*

## Learning Outcomes

- Developing REST APIs with Spring Boot
- Integrating a Java application with MySQL
- Implementing CRUD operations
- Managing project dependencies with Maven
- Using Git and GitHub for version control
- Debugging and testing backend applications

## Future Enhancements

- Input validation and centralized exception handling
- Authentication and role-based authorization
- API documentation using Swagger/OpenAPI
- Automated unit and integration tests
- Deployment to a cloud platform

## Author

**Shrihari Balaji Gade**

MCA, 2026 | Aspiring Java Backend Developer

**GitHub:** [Shrihari-Gade](https://github.com/Shrihari-Gade)

**LinkedIn:** [Connect with me](https://www.linkedin.com/in/shrihari-gade2/)

---

*This project is developed for learning and demonstrating Java backend development skills.*
