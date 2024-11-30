# Spring Framework First Project

This project is a simple Spring Framework application configured via XML.

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- Apache Maven 3.6.0 or higher

## Setup

1. Clone the repository:

   ```sh
   git clone https://github.com/Sai-Deepak-1/spring-boot-microservices-learning/tree/main/projects/spring-framework-first-project
   ```

2. Change the Directory
   ```sh
   cd Spring1stProj
   ```
3. Build the project using Maven:

   ```sh
   mvn clean install
   ```

4. Run the application:
   ```sh
   mvn exec:java -Dexec.mainClass="com.saideepak.spring1stproj.App"
   ```

## Configuration

The application is configured using an XML file located at `src/main/resources/spring-context.xml`. This file defines the beans and their dependencies.

## Main Components

<!-- - **AppConfig**: Configuration class for the application. -->
- **App**: The main class that runs the application.
