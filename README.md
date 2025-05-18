# Simple Notification System

A Spring Boot-based notification system that supports Email, SMS, and In-App delivery.

## Features

- Send notifications via REST API  
- Retrieve user-specific notifications  
- Support for Email, SMS, and In-App types  

## Technologies

- Java 17
- Maven 
- Spring Boot  
- MySQL and MySQL Workbench
- Lombok  

## Setup Instructions

1. Clone the github repository

```
git clone https://github.com/QwertyFusion/simple-notification-system.git
cd simple-notification-service
cd notificaton
```

2. Configure your `application.properties`:

```
spring.application.name=notification-service

# MySQL DB config
spring.datasource.url=jdbc:mysql://localhost:3306/notification_service?useSSL=false&serverTimezone=UTC
spring.datasource.username=YOUR_DB_USERNAME
spring.datasource.password=YOUR_DB_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
```

3. Create the database:
```
CREATE DATABASE notification_service;
```

4. Run the app:

```
./mvnw spring-boot:run
```

## API Endpoints
You can use tools like Postman to access the endpoint.
### ✅ Send Notification  
`POST localhost:8080/api/notifications`

**Request:**
```
{
  "userId": 101, //any user ID
  "type": "EMAIL", // EMAIL or SMS, INAPP
  "message": "Hello from the notification service!"
}
```

### ✅ Get User Notifications  
`GET localhost:8080/api/users/{userId}/notifications`

---

## Assumptions

- Notification delivery is mocked using `System.out.println` for Email and SMS, since nothing was explicitly mentioned.
- Future upgrade possible for a retry mechanism which runs every 60 seconds for failed notifications.
- Future upgrade possible with RabbitMQ or Kafka integration for queueing.

---

## Developer

**Rishi Banerjee**  
Github Username: QwertyFusion
B.Tech. in Computer Science Engineering  
Kalinga Institute of Industrial Technology
