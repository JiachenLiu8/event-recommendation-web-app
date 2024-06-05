# Event and Ticket Recommendation System

This web application recommends nearby events and tickets, tailored to users' preferences. It uses a combination of technologies including HTML, CSS, JavaScript, Java Servlets, MySQL, MongoDB, and integrates with the Ticketmaster API.

## Features

- **Personalized Recommendations:** Leverages the Ticketmaster API and user preferences to provide personalized event and ticket recommendations.
- **Session-based Authentication:** Manages user sessions to securely handle HTTP requests and authentication.
- **Dual Database Integration:** Utilizes both SQL (MySQL) and NoSQL (MongoDB) databases for optimal data management and retrieval.
- **Robust Testing:** Uses Postman and localhost environments to test servlet functionality and backend logic thoroughly.
- **Scalable Deployment:** Deployed on Amazon Web Services (AWS) via an EC2 instance to ensure scalability and public accessibility.

## Technologies Used

- **Frontend:** HTML, CSS, JavaScript, AJAX
- **Backend:** Java Servlets, MySQL, MongoDB
- **Testing Tools:** Postman
- **Deployment:** AWS EC2

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

The project folder Jupiter contains all the source code.

### Prerequisites

apache-tomcat-9.0.87
mongo-java-driver-3.9.1.jar
jsonassert-1.5.1.jar

### Installing

A step by step series of examples that tell you how to get a development environment running:

1. **Apache Tomcat Setup:**
   - Download and install Apache Tomcat 9.0.87.
   - Configure your IDE to use the Tomcat Server for running the application.

2. **Database Setup:**
   - Install MySQL and MongoDB on your local machine.
   - Create the necessary databases and tables according to the schema provided in the `db` folder.

3. **Running the Application:**
   - Clone the repository and import the project into your IDE.
   - Ensure that the required JAR files are included in the project's library path.
   - Start the Tomcat server and navigate to `http://localhost:8080` to view the application.

## Deployment

Convert the project source code to a WAR file and host it on AWS EC2 instance.
