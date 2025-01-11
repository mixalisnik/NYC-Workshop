# StudyHub - Student Management Platform

A web application for managing students and study groups, built with Spring Boot and Thymeleaf. This project was created for educational purposes and presented as part of a workshop at New York College of Thessaloniki.

## Quick Demo

![StudyHub Demo](docs/demo/studyhub-demo.gif)

## Features

### 🎓 Student Management
- Create, read, update, and delete student profiles
- Track student information and enrollment details
- Efficient student record management

### 👥 Study Groups
- Create and manage study groups
- Facilitate student collaboration
- Track group activities and memberships

### 🎯 Key Features
- Modern, responsive UI
- Real-time updates
- Intuitive navigation
- Data persistence with PostgreSQL
- Secure authentication and authorization

## Technologies Used

### Backend
- Java 17
- Spring Boot 3.x
- Spring Data JPA
- PostgreSQL Database
- Hibernate

### Frontend
- Thymeleaf template engine
- Bootstrap 5.3
- Font Awesome 6.0
- Modern CSS with animations
- Responsive design

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven
- PostgreSQL

### Database Setup
1. Create a PostgreSQL database:
```sql
CREATE DATABASE studentappdb;
```

2. Update database configuration in `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/studyhub.git
cd studyhub
```

2. Build the project:
```bash
./mvnw clean install
```

3. Run the application:
```bash
./mvnw spring-boot:run
```

4. Access the application at: `http://localhost:8080`

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── nyc/
│   │           └── studentapp/
│   │               ├── controllers/
│   │               ├── entities/
│   │               ├── repositories/
│   │               └── services/
│   └── resources/
│       ├── static/
│       ├── templates/
│       └── application.properties
```

## API Endpoints

### Student Management
- `GET /student` - View student management page
- `GET /student/read` - Get all students
- `GET /student/read/{id}` - Get student by ID
- `POST /student/create` - Create new student
- `PUT /student/update/{id}` - Update student
- `DELETE /student/delete/{id}` - Delete student

### Study Groups
- `GET /studygroup` - View study groups page
- `GET /studygroup/read` - Get all study groups
- `GET /studygroup/read/{id}` - Get study group by ID
- `POST /studygroup/create` - Create new study group
- `PUT /studygroup/update/{id}` - Update study group
- `DELETE /studygroup/delete/{id}` - Delete study group

### Development Test Endpoints
#### Student Test Endpoints
- `GET /student/test/create` - Test student creation
- `GET /student/test/update/{id}` - Test student update
- `GET /student/test/delete/{id}` - Test student deletion

#### Study Group Test Endpoints
- `GET /studygroup/test/create` - Test study group creation
- `GET /studygroup/test/update/{id}` - Test study group update
- `GET /studygroup/test/delete/{id}` - Test study group deletion

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Team

- [@mixalisnik](https://github.com/mixalisnik/)
- [@harischatzianastasiou](https://github.com/harischatzianastasiou)
- [@sykalerio](https://github.com/sykalerio)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- [Netcompany Intrasoft](https://www.netcompany-intrasoft.com/) for support and guidance
- Spring Boot and Thymeleaf communities for excellent documentation
- Bootstrap team for the amazing UI framework 
