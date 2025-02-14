# Traini8 Training Center API

This project is an MVP for a Training Center registry built with Java and Spring Boot.

## Features
- REST APIs for Training Center management
- Validation using Jakarta Validation
- Embedded H2 database (for testing)
- Maven for project management

## Getting Started

### Prerequisites
- Java 17+
- Maven 3.8+
- Git
- IDE (IntelliJ/VS Code)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Aryanag03/traini8.git

2. Navigate to the project directory:
   ```bash
   cd traini8

3. Build the project:
   ```bash
   mvn clean install

4. Run the project:
   ```bash
   mvn spring-boot:run

## API Endpoints
1. POST /api/training-centers
2. GET /api/training-centers

##Database Configuration (H2)
This project uses an H2 in-memory database for development and testing.

1. H2 Console (Web UI)
Spring Boot provides an embedded web console to interact with the H2 database.

- URL: http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:testdb
- Username: sa
- Password: password