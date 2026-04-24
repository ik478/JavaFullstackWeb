# Full Stack Website From Zero (Java + Frontend)

## What this covers

* Install Java, VS Code, Maven
* Create Spring Boot project
* Run backend
* Build API
* Connect frontend button to backend
* Add Swagger docs
* Grow into a full-stack app

---

# 1) Install

## Java JDK

Check:

```bash
java -version
javac -version
```

## VS Code extensions

* Extension Pack for Java
* Spring Boot Extension Pack

---

# 2) Create Spring Boot Project

Use Spring Initializr:

Dependencies:

* Spring Web

Project structure:

```text
demo/
 ├── src/main/java/com/example/demo
 ├── src/main/resources/static
 └── pom.xml
```

---

# 3) Run backend

Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

Expected:

```text
Tomcat started on port 8080
```

---

# 4) First API

Create ApiController.java

```java
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/hello")
    public String hello() {
        System.out.println("Button Pressed!");
        return "Hello from Java backend";
    }
}
```

Test:

```text
http://localhost:8080/api/hello
```

---

# 5) Frontend

Create:

```text
src/main/resources/static/index.html
```

```html
<!DOCTYPE html>
<html>
<body>
<button onclick="callApi()">Press Me</button>
<p id="result"></p>

<script>
async function callApi(){
 const r=await fetch('/api/hello');
 const text=await r.text();
 document.getElementById('result').innerText=text;
}
</script>
</body>
</html>
```

Open:

```text
http://localhost:8080
```

---

# 6) Change port

application.properties

```properties
server.port=9090
```

---

# 7) Swagger

pom.xml dependency:

```xml
<dependency>
<groupId>org.springdoc</groupId>
<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
<version>2.8.17</version>
</dependency>
```

Open:

```text
http://localhost:8080/swagger-ui/index.html
```

---

# 8) POST endpoint

```java
@PostMapping("/api/button")
public String pressed(){
 return "Received";
}
```

---

# 9) Full stack architecture

```text
Frontend
↓
Spring Boot API
↓
Database
```

Recommended stack:

* React
* Spring Boot
* PostgreSQL
* Swagger

---

# 10) Folder structure for larger apps

```text
controller/
service/
repository/
model/
```

---

# 11) Common HTTP Methods

GET - Read
POST - Create
PUT - Update
DELETE - Remove

---

# 12) Useful commands

Run:

```powershell
.\mvnw.cmd spring-boot:run
```

Build:

```powershell
.\mvnw.cmd clean install
```

Stop:

```text
CTRL+C
```

---

# 13) Learning path

1 HTML
2 CSS
3 JavaScript
4 REST APIs
5 Spring Boot
6 SQL
7 React
8 Authentication
9 Deployment

---

# 14) Project ideas

* Todo app
* Login system
* Dashboard
* CRUD admin panel
* Raspberry Pi control panel

---

You already built your first full stack a
