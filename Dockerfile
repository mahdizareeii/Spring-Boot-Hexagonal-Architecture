# Use a specific version of the Eclipse Temurin JDK
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY ./build/libs/SpringBootExample-1.0-SNAPSHOT.jar app.jar

# Define the command to run your application
CMD ["java", "-jar", "app.jar"]