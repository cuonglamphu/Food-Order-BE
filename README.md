# Food Order Backend

A Spring Boot backend application for a food ordering system.

## Prerequisites

-   Java JDK 8 or higher
-   MySQL Server
-   IntelliJ IDEA

## Setup Instructions

1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Configure MySQL connection in `application.properties`:
    - Set your MySQL username (default is "root")
    - Set your MySQL password if you have one configured
    - The database "foodorderDB" will be created automatically if it doesn't exist
4. The application uses port 8080 by default. If you need to change it, modify `application.properties`

### Running the Application

1. Locate `FoodOrderBackApplication.java` in the project explorer ( src/main/java/com/example/foodorderback/FoodOrderBackApplication.java )
2. Right-click and select "Run 'FoodOrderBackApplication'"
    - Or click the green play button in the top toolbar

The application will:

-   Create/update database tables automatically via Hibernate
-   Start the server on port 8080
-   Enable cross-origin requests (CORS)

## Project Structure

The application follows a standard Spring Boot architecture:

-   `controller/` - REST API endpoints
-   `model/` - Entity classes
-   `repository/` - Data access layer
-   `service/` - Business logic layer
-   `dto/` - Data transfer objects
-   `security/` - Security configuration

## Key Features

-   User authentication and authorization
-   CRUD operations for meals and meal types
-   Order management system
-   Image handling for meals and meal types
-   Role-based access control (Admin, User, Employee)

## API Security

The application uses JWT for authentication. Most endpoints require authentication except:
_(Note: List of public endpoints should be added here)_

## Database Configuration

The application uses MySQL with Hibernate ORM. Key configurations:

-   Hibernate dialect: MySQL5
-   DDL auto: update
-   Show SQL: enabled
-   Naming strategy: ImprovedNamingStrategy

## Running in Development

The application is configured for development with:

-   Auto-reload enabled
-   SQL logging enabled
-   Detailed error messages
-   CORS enabled for all origins

After starting the application, you can access the API at `http://localhost:8080/api/`
# Food-Order-BE
