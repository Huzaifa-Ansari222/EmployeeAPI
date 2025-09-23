# Employee API - Spring Boot (Java 17)

## 🔗 URLs
- **Swagger UI** (explore and test all APIs):  
  [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

- **H2 Database Console**:  
  [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

---

## 🚀 Tasks

### 1️⃣ Build & Run
- Build and start the application using your preferred IDE or `./gradlew bootRun`.

---

### 2️⃣ REST API (Employee)

**Q1: Implement the following endpoints (Controller, Service, Repository layers):**

- **Create a new Employee**  
  `POST /api/employees/create`  

- **Retrieve Employee with ID 5**  
  `GET /api/employees/5`

---

### 3️⃣ Exception Handling

**Q2: Create a `@ControllerAdvice` class to handle exceptions:**
- `EntityNotFoundException` → return **404 Not Found**

---

### 4️⃣ Integration Testing

**Q3: Write an integration test for**  
`GET /api/employees/{id}` using **Spring Boot’s `@SpringBootTest` and H2 database**.  

👉 Include:
- **Setup** (H2 config, test data initialization)  
- **One test case** (e.g., verify that fetching a valid Employee ID returns `200 OK` with correct response body).  

---

