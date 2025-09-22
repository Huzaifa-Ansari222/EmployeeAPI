URL:
Swagger UI (use this to see and try all controllers): http://localhost:8080/swagger-ui.html
H2 Console: http://localhost:8080/h2-console

Tasks:
Build and run the application.
Q1: Write the REST controller method to create a new Employee.
Use DTOs for request/response, validate the fields (name required, email valid and unique).
Q2: Show how you will map between EmployeeDTO and Employee entity.
Q3:Write a REST API method for Employee:
   Create new Employee (Post /api/employees/create).
   Retrieve the Employee with ID 5 (GET /api/employees/5).
Q4: Implement the service method to create a new LeaveRequest for an employee.
Add validation so that:
endDate must be after startDate.
The leave must not overlap with any existing approved leave for that employee.
Q5: Implement the method for approving a leave (PUT /api/leaves/{id}/approve).
Ensure only requests with header X-ROLE=MANAGER can approve. If not, throw a custom exception.
Q6: Write a @ControllerAdvice class to handle:
EntityNotFoundException → return 404 Not Found
IllegalArgumentException → return 400 Bad Request
Default exception → return 500 Internal Server Error
Q7: Write a JUnit 5 + Mockito test for the service method that creates a leave request. Mock the repository and test both:
A valid leave (should save)
An overlapping leave (should throw exception)
Q8: How would you write an integration test for GET /api/employees/{id} using Spring Boot’s @SpringBootTest and H2 database? Provide the setup and one test case.
