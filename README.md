# Spring-Boot-Hexagonal-Architecture
A simple Kotlin Spring Boot project that demonstrates how hexagonal architecture can be implemented
![hexagonal architecture](https://user-images.githubusercontent.com/34120686/266601786-0e55689f-47b6-407c-a5de-55feaaf1933c.jpg)

Hexagonal architecture is a software design approach that organizes an application into concentric layers.
At its core is the business logic, which is surrounded by layers of adapters that interact with external systems such as databases, user interfaces, and external services.
This separation makes it easier to develop and test the core logic independently, promoting flexibility and maintainability.

## **Core (Innermost Layer):**

The core is the heart of the application and contains the business logic.
It represents the fundamental rules and processes that define the application's behavior.
This layer is independent of external systems and should be kept free from any framework-specific code.

## **Ports (Interfaces):**

Ports define the interfaces or contracts through which the core interacts with the external world.
They are essentially the entry and exit points for data and operations in the application.
Ports include input ports (for receiving data or commands) and output ports (for sending data, events, or notifications to external systems without knowing their specific implementations).

## **Adapters (Outer Layers):**

Adapters are responsible for implementing the ports defined in the core.
They bridge the gap between the core and external systems, translating requests and responses as needed.
There are different types of adapters, including:

**Input or Primary Adapters or Driven Adapters:** These are responsible for receiving input from external sources (e.g., user interfaces, API endpoints) and converting it into a format that the core can understand.

**Output or Secondary Adapters or Driving Adapters:** These handle communication with external resources like databases, third-party services, or external APIs.

## **External Systems or Frameworks and Drivers (Outermost Layer):**

This layer contains the external systems and frameworks that the application uses.
It includes elements like databases, web frameworks, UI libraries, and other external tools.
The adapters in this layer facilitate communication between the application and these external systems.


## **How to Dockerize spring boot application?**

before start :

check your build gradle configuration if you are set mainClass.set remove it

step 1 :

get jar file of your spring boot project

cd to your project directory by terminal and run this command:
./gradlew clean build
./gradlew build 

after building the project check this dir:
build/libs
your jar file generated

step 2 :
open the terminal as administrator and cd to the project directory

Create an empty file named Dockerfile.

mac/linux: touch Dockerfile
windows: type nul > Dockerfile

step 3:
now edit the file DockerFile with an editor like this
_______________________________________________________________________

# Use a specific version of the Eclipse Temurin JDK
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY ./build/libs/SpringBootExample-1.0-SNAPSHOT.jar app.jar

# Define the command to run your application
CMD ["java", "-jar", "app.jar"]
_______________________________________________________________________

now build your docker image file by this command:

docker build -t yourProjectName:yourCustomVersion .

example : 
docker build -t myapp .

and finally, run your app in a container by this command:
docker run -p 8080:8080 yourProjectName

example :
docker run -p 8080:8080 myapp
