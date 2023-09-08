# Spring-Boot-Hexagonal-Architecture
A simple Kotlin Spring Boot project to demonstrate how hexagonal architecture does implement
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
Ports include input ports (for receiving data or commands) and output ports (for sending data or events).

## **Adapters (Outer Layers):**

Adapters are responsible for implementing the ports defined in the core.
They bridge the gap between the core and external systems, translating requests and responses as needed.
There are different types of adapters, including:
Primary Adapters (or Driven Adapters): These are responsible for receiving input from external sources (e.g., user interfaces, API endpoints) and converting it into a format that the core can understand.
Secondary Adapters (or Driving Adapters): These handle communication with external resources like databases, third-party services, or external APIs.

## **Frameworks and Drivers (Outermost Layer):**

This layer contains the external systems and frameworks that the application uses.
It includes elements like databases, web frameworks, UI libraries, and other external tools.
The adapters in this layer facilitate communication between the application and these external systems.
