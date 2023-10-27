# employeemanager

**Project Overview:**

**1) Frontend (Angular):**
  - Angular is utilized to create the user interface for the application.
  - It offers a responsive and interactive web-based interface, integrating a Bootstrap template.

**2) Backend (Spring MVC):**
  - Spring MVC serves as the backend framework responsible for handling HTTP requests from the Angular frontend.
  - It facilitates CRUD operations (Create, Read, Update, Delete) through RESTful API endpoints.
  - Spring Boot, coupled with Spring Data JPA, streamlines database operations, enabling interaction with a PostgreSQL database.
  - For testing and validation, Postman was employed to inspect request and response interactions.

**3) Database (PostgreSQL with pgAdmin):**
  - PostgreSQL functions as the database management system to store employee records and their associated data.
  - pgAdmin, a graphical tool, is employed for the administration and management of the PostgreSQL database. It provides a user-friendly interface for these tasks.

**4) Docker Containerization:**
  - The complete application stack, comprising the Angular frontend, Spring MVC backend, and PostgreSQL database, is containerized using Docker.
  - Containerization ensures consistent and simplified deployment across diverse environments.

**5) Dependency:**
  - The "spring-boot-starter-data-jpa" dependency has been included in your Spring Boot project. It facilitates seamless interaction between your Spring application and the PostgreSQL database.
  - This dependency empowers the use of JPA (Java Persistence API) to manage database entities and conduct CRUD operations.

**Project Functionality:**

**Employee Profile Management:**
  - The project's core functionality revolves around the management of employee profile details.
  - Administrators can execute CRUD operations on employee records and search for specific employees based on various criteria such as name, contact number, email, and more.

**CRUD Operations:**

**1)Create (C):**
  - Description: Add a new employee record to the database.
  - Input: Employee's name, image, contact number, email ID, and job title.
  - Action: Insert the provided information into the database as a new record. An employee code is generated at the backend using `UUID.randomUUID().toString()`.

**2) Read (R):**
  - Description: Retrieve and view existing employee records from the database.
  - Actions:
    - Search for specific employees by name, job title, or other criteria.
    - Retrieve a list of all employees in a structured format for browsing and reporting.

**3) Update (U):**
  - Description: Modify information in an existing employee record.
  - Input: Employee's unique identifier (e.g., ID) and the fields to be updated.
  - Action: Update the specified fields of the employee's record in the database. Note that the employee code is set as non-updatable.

**4) Delete (D):**
  - Description: Remove an employee record from the database.
  - Input: Employee's unique identifier (e.g., ID).
  - Action: Permanently delete the employee's record from the database.

For information please watch the attechted video. 



https://github.com/DhruvPatel2105/employeemanager/assets/58779025/373af822-435e-44a0-961e-ccdc6585be55


