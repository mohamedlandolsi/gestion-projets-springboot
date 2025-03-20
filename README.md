# Gestion des Projets avec Budgets et Ressources
This application is a comprehensive project management system that allows organizations to manage projects, tasks, resources, and employees while tracking budgets and resource allocation.
## Description
The "Gestion des Projets" application is designed to help organizations effectively manage their projects by providing tools for:
- Project creation and management with budget tracking
- Task assignment and monitoring
- Resource allocation and availability tracking
- Employee management and task assignment
- Financial reporting and cost tracking per project

## Technologies Used
### Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Lombok
- RESTful API architecture

### Frontend
- Angular (recommended)
- TypeScript
- HTML/CSS
- Bootstrap (optional)

### Deployment & Infrastructure
- Docker
- Docker Compose
- Git for version control

## Application Structure
### Core Entities
1. **Project**: Contains project information including name, timeline, budget, and status
2. **Task**: Represents project tasks with responsible employees, descriptions, status, and deadlines
3. **Resource**: Tracks resources available for projects including cost and availability
4. **Employee**: Manages information about employees, their roles, and teams

## Installation and Setup
### Prerequisites
- Java 17
- Maven
- MySQL
- Docker and Docker Compose (for containerized deployment)
- Node.js and npm (for Angular frontend)

### Backend Setup
1. Clone the repository:
``` bash
   git clone https://github.com/YOUR-USERNAME/gestion-projets.git
   cd gestion-projets
```
1. Configure database connection in `src/main/resources/application.properties` (already set up for local development)
2. Build the application:
``` bash
   mvn clean install
```
1. Run the Spring Boot application:
``` bash
   mvn spring-boot:run
```
The backend will start on `http://localhost:8080`
### Frontend Setup
1. Navigate to the Angular frontend directory:
``` bash
   cd frontend
```
1. Install dependencies:
``` bash
   npm install
```
1. Start the Angular development server:
``` bash
   ng serve
```
The frontend will be accessible at `http://localhost:4200`
## Docker Deployment
### Using Docker Compose
1. Make sure Docker and Docker Compose are installed on your system
2. Build and start the containers:
``` bash
   docker-compose up -d
```
1. Access the application at `http://localhost:8080`
2. To stop the containers:
``` bash
   docker-compose down
```
## Features
- CRUD operations for projects and tasks
- Budget management
- Resource allocation by task and project
- Financial reporting and cost tracking by project
- Employee management and task assignment
- Status tracking for projects and tasks
- Priority management for tasks

## Contributing
1. Create a feature branch: `git checkout -b feature/new-feature`
2. Commit your changes: `git commit -m "feat: Add new feature"`
3. Push to the branch: `git push origin feature/new-feature`
4. Submit a pull request
