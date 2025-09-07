Library Management System

A Spring Boot-based RESTful API for managing a library's book inventory.

Features

CRUD Operations: Create, Read, Update, and Delete books.

Partial Updates: Update book details using PATCH requests.

Technologies Used

Spring Boot: Framework for building the application.

Spring Data JPA: For database interactions.

H2 Database: In-memory database for development and testing.

Maven: Build and dependency management.

Project Structure

src/
 └── main/
     ├── java/
     │    └── com/
     │        └── assessment/
     │            └── library/
     │                ├── controller/          # REST API endpoints
     │                ├── dto/                 # Data Transfer Objects
     │                ├── model/               # JPA Entities
     │                ├── repository/          # Data access layer
     │                └── service/             # Business logic
     │                    └── impl/             # Service implementation
     └── resources/
          └── application.properties           # Application configuration


Setup

Clone the Repository:

git clone https://github.com/akshaymishra07/Library-Management.git
cd Library-Management


Build the Project:

mvn clean install


Run the Application:

mvn spring-boot:run


The application will start on http://localhost:8080.

API Endpoints
1. Create a New Book

Endpoint: POST /books

Request Body:

  {
    "title": "Spring Boot Essentials",
    "price": 29.99,
    "author": "John Doe",
    "genre": "Technology",
    "publications": "TechPress"
  }


Response:

  {
    "id": 1,
    "title": "Spring Boot Essentials",
    "price": 29.99,
    "author": "John Doe",
    "genre": "Technology",
    "publications": "TechPress"
  }

2. Get All Books

Endpoint: GET /books

Response:

  [
    {
      "id": 1,
      "title": "Spring Boot Essentials",
      "price": 29.99,
      "author": "John Doe",
      "genre": "Technology",
      "publications": "TechPress"
    }
  ]

3. Get a Book by ID

Endpoint: GET /books/{id}

Response:

  {
    "id": 1,
    "title": "Spring Boot Essentials",
    "price": 29.99,
    "author": "John Doe",
    "genre": "Technology",
    "publications": "TechPress"
  }

4. Update a Book

Endpoint: PUT /books/{id}

Request Body:

  {
    "title": "Spring Boot Advanced",
    "price": 39.99,
    "author": "Jane Doe",
    "genre": "Technology",
    "publications": "AdvancedPress"
  }


Response:

  {
    "id": 1,
    "title": "Spring Boot Advanced",
    "price": 39.99,
    "author": "Jane Doe",
    "genre": "Technology",
    "publications": "AdvancedPress"
  }

5. Partial Update (e.g., Update Price)

Endpoint: PATCH /books/{id}

Request Body:

  {
    "price": 34.99
  }


Response:

  {
    "id": 1,
    "title": "Spring Boot Advanced",
    "price": 34.99,
    "author": "Jane Doe",
    "genre": "Technology",
    "publications": "AdvancedPress"
  }

6. Delete a Book

Endpoint: DELETE /books/{id}

Response:
STATUS.OK
