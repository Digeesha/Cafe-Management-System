<h1 align="center">Cafe Management System</h1>

## About The Project

### Purpose of the Project

The Cafe Management System project aims to streamline cafeteria operations by providing a complete system that allows cafe owners to manage invoices, products, users, and access levels with ease.


## Key Features

### Admin Features

* Dashboard Overview
* Manage Categories (Add, Edit, Filter)
* Manage Products (Add, Edit, Delete, Filter)
* Manage Orders
* Manage Bills (View Details, Download, Cancel, Filter)
* Manage Users (Send Notification, Filter)
* Password Management

### User Features

* Registration & Authentication
* User Dashboard
* Place Orders
* View & Manage Bills (Download, Cancel, Filter)
* Profile Updates
* Password Changes

### Built With

* **Java** — Spring Boot (REST API) \[v2.7.6]
* **Angular** \[v12.2.18]
* **MySQL** \[v8.0.34]

---

## Getting Started

### Frontend (Angular)

To run the Angular application:

1. Open a terminal inside the Angular project folder.
2. Set the environment variable (Windows PowerShell):

```powershell
$env:NODE_OPTIONS = "--openssl-legacy-provider"
```

3. Start the development server:

```bash
ng serve
```

4. Visit [http://localhost:4200](http://localhost:4200) in your browser.

---

### Backend (Spring Boot)

Make sure the Spring Boot application runs on [http://localhost:8082](http://localhost:8082). You can use [Postman](https://www.postman.com/) or [Apidog](https://www.apidog.com) to test API endpoints.

Steps:

1. Register a user account.
2. Log in to retrieve a JWT token.
3. Use this token in headers to access protected endpoints.
4. Admin-only features require admin role tokens. Refer to service logic in the [`ServiceImpl` folder](https://github.com/Bahri-Adem/Cafe-Management-System-Angular-SpringBoot/blob/main/Backend/src/main/java/com/inn/cafe/serviceImpl).

