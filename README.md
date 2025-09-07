<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Library Management System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
            background-color: #f9f9f9;
        }
        h1, h2, h3 {
            color: #2c3e50;
        }
        code, pre {
            background-color: #ecf0f1;
            padding: 5px;
            border-radius: 4px;
            display: block;
        }
        table {
            border-collapse: collapse;
            width: 100%;
            margin-bottom: 20px;
        }
        th, td {
            border: 1px solid #bdc3c7;
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #34495e;
            color: #fff;
        }
        .endpoint {
            background-color: #3498db;
            color: white;
            padding: 3px 6px;
            border-radius: 4px;
            font-weight: bold;
        }
        .section {
            background-color: #fff;
            padding: 15px 20px;
            margin-bottom: 20px;
            border-radius: 6px;
            box-shadow: 0 2px 6px rgba(0,0,0,0.1);
        }
    </style>
</head>
<body>

    <h1>Library Management System</h1>
    <p>A <strong>Spring Boot-based RESTful API</strong> for managing a library's book inventory.</p>

    <div class="section">
        <h2>Features</h2>
        <ul>
            <li>CRUD Operations – Create, Read, Update, and Delete books.</li>
            <li>Partial Updates – Update book details using PATCH requests.</li>
        </ul>
    </div>

    <div class="section">
        <h2>Technologies Used</h2>
        <table>
            <tr>
                <th>Technology</th>
                <th>Purpose</th>
            </tr>
            <tr>
                <td>Spring Boot</td>
                <td>Framework for building the application</td>
            </tr>
            <tr>
                <td>Spring Data JPA</td>
                <td>Database interactions</td>
            </tr>
            <tr>
                <td>H2 Database</td>
                <td>In-memory database for development/testing</td>
            </tr>
            <tr>
                <td>Maven</td>
                <td>Build and dependency management</td>
            </tr>
        </table>
    </div>

    <div class="section">
        <h2>Setup</h2>
        <h3>1. Clone the Repository</h3>
        <pre><code>git clone https://github.com/akshaymishra07/Library-Management.git
cd Library-Management</code></pre>

        <h3>2. Build the Project</h3>
        <pre><code>mvn clean install</code></pre>

        <h3>3. Run the Application</h3>
        <pre><code>mvn spring-boot:run</code></pre>
        <p>The application will start on <strong>http://localhost:8080</strong></p>
    </div>

    <div class="section">
        <h2>API Endpoints</h2>

        <h3><span class="endpoint">POST /books</span> - Create a New Book</h3>
        <pre><code>{
  "title": "Spring Boot Essentials",
  "price": 29.99,
  "author": "John Doe",
  "genre": "Technology",
  "publications": "TechPress"
}</code></pre>

        <h3>Response</h3>
        <pre><code>{
  "id": 1,
  "title": "Spring Boot Essentials",
  "price": 29.99,
  "author": "John Doe",
  "genre": "Technology",
  "publications": "TechPress"
}</code></pre>

        <h3><span class="endpoint">GET /books</span> - Get All Books</h3>
        <pre><code>[
  {
    "id": 1,
    "title": "Spring Boot Essentials",
    "price": 29.99,
    "author": "John Doe",
    "genre": "Technology",
    "publications": "TechPress"
  }
]</code></pre>

        <h3><span class="endpoint">GET /books/{id}</span> - Get Book by ID</h3>
        <pre><code>{
  "id": 1,
  "title": "Spring Boot Essentials",
  "price": 29.99,
  "author": "John Doe",
  "genre": "Technology",
  "publications": "TechPress"
}</code></pre>

        <h3><span class="endpoint">PUT /books/{id}</span> - Update a Book</h3>
        <pre><code>{
  "title": "Spring Boot Advanced",
  "price": 39.99,
  "author": "Jane Doe",
  "genre": "Technology",
  "publications": "AdvancedPress"
}</code></pre>

        <h3><span class="endpoint">PATCH /books/{id}</span> - Partial Update (Price)</h3>
        <pre><code>{
  "price": 34.99
}</code></pre>

        <h3><span class="endpoint">DELETE /books/{id}</span> - Delete a Book</h3>
        <pre><code>{
  "message": "Book with ID 1 has been deleted."
}</code></pre>
    </div>

    <div class="section">
        <h2>Database Configuration</h2>
        <pre><code>spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.h2.console.enabled=true</code></pre>
        <p>H2 Console: <strong>http://localhost:8080/h2-console</strong></p>
        <ul>
            <li>JDBC URL: <code>jdbc:h2:mem:testdb</code></li>
            <li>Username: <code>sa</code></li>
            <li>Password: leave blank</li>
        </ul>
    </div>

    <div class="section">
        <h2>Testing</h2>
        <pre><code>mvn test</code></pre>
    </div>

    <div class="section">
        <h2>License</h2>
        <p>This project is licensed under the MIT License - see the <a href="LICENSE">LICENSE</a> file for details.</p>
    </div>

</body>
</html>
