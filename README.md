URL:
Swagger UI (use this to see and try all controllers): http://localhost:8080/swagger-ui.html
H2 Console: http://localhost:8080/h2-console
Tasks:
Build and run the application.
Q1:Write a REST API method for Employee:
    Create new Employee (Post /api/employees/create).(Controller,Service,Repository layer)
   Retrieve the Employee with ID 5 (GET /api/employees/5).(Controller,Service,Repository layer)
Q2: Write a @ControllerAdvice class to handle:
EntityNotFoundException → return 404 Not Found
Q3: How would you write an integration test for GET /api/employees/{id} using Spring Boot’s @SpringBootTest and H2 database? Provide the setup and one test case.
