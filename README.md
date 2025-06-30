# Role Management Application

This is a Spring Boot microservice for managing roles, channels, audit levels, and permissions.

## Features
- RESTful APIs for roles, channels, audit levels, and permissions
- Caching with scheduled refresh from the database
- H2 in-memory database for development
- OpenAPI documentation

## Endpoints
- `/api/roles` — Get all roles
- `/api/channels` — Get all channels
- `/api/audit-levels` — Get all audit levels
- `/api/permissions?role_id=...&permission_category_name=...` — Get permissions for a role and category

## Setup
1. **Clone the repository**
2. **Build the project**
   ```
   mvn clean install
   ```
3. **Run the application**
   ```
   mvn spring-boot:run
   ```
4. **Access H2 Console**
   - URL: `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:testdb`

5. **API Documentation**
   - OpenAPI/Swagger UI: `http://localhost:8080/swagger-ui.html`

## Requirements
- Java 17+
- Maven

## Notes
- The application uses scheduled tasks to refresh cached data from the database every 5 minutes (for roles).
- Sample data is loaded from `src/main/resources/data.sql`. 