# Blog Platform – Spring Boot Application

## Project Status

> **This project is currently under active development.**  
Features are being implemented step by step as part of a learning-focused backend project.  
Breaking changes, incomplete endpoints, and refactoring are expected.

---

## Overview

This repository contains a **Blog Platform backend application** built with **Spring Boot**.

The project is developed while following the tutorial  
**“Build a Blog Platform App” by Devtiro** and is intended strictly for **educational and non-commercial purposes**.

The main goal is to learn how to design and implement a real-world backend application using modern Spring Boot practices.

---

## What This Project Covers

- REST API design
- User authentication using JWT
- Category, tag, and post management
- Database integration with PostgreSQL
- Test configuration using H2
- Spring Security configuration
- Clean layered architecture:
  - Controllers
  - Services
  - Repositories
  - Domain & DTO layers

A React frontend (provided by the tutorial author) can be used to interact with this backend.

---

## Technology Stack

### Backend
- Java 21
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Spring Security
- JWT (JSON Web Tokens)
- MapStruct
- Lombok
- Jakarta Validation

### Database
- PostgreSQL (Docker-based)
- H2 (in-memory database for tests)

### Tools
- Maven
- Docker & Docker Compose
- IntelliJ IDEA (recommended, but optional)

---

## Requirements

Before running the project, make sure you have:

- Java 21 or newer
- Docker and Docker Compose
- Node.js 20 or newer (only if using the frontend)
- Git

Check versions:
```bash
java -version
docker --version
node --version
```

---

## Running the Application

### Clone the repository
```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

### Start the database
```bash
docker-compose up
```

Services started:
- PostgreSQL: `localhost:5432`
- Adminer: `http://localhost:8888`

### Application configuration

Example `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=changemeinprod!
```

### Run the backend
```bash
./mvnw spring-boot:run
```

The backend will be available at:
```
http://localhost:8080
```

---

## Testing

Tests are configured to use an **H2 in-memory database**.

Run tests with:
```bash
./mvnw test
```

No external services are required for testing.

---

## API Security

Public endpoints (GET only):
- `/api/v1/posts`
- `/api/v1/categories`
- `/api/v1/tags`

Protected endpoints:
- Creating, updating, and deleting resources
- Authentication handled via JWT tokens

---

## Development Notes

- The project evolves incrementally with frequent refactoring
- Some features may be incomplete or experimental
- Code structure prioritizes clarity and learning over optimization
- Commits reflect tutorial milestones and personal improvements

---

## License & Attribution

This project is based on the tutorial:

**Build a Blog Platform App** by Devtiro  
Licensed under the **Creative Commons BY-NC-SA 4.0** license

Original sources:
- https://www.youtube.com/@devtiro
- https://www.devtiro.com

You are free to share and adapt this project for **non-commercial use**, provided that:
- Proper attribution is given
- The same license is applied to derivative works

---

## Author Note

This repository documents my learning process with Spring Boot and backend development.  
It is not intended for production use.

The project will continue to evolve as new features are implemented.
