# Use a valid OpenJDK base image
FROM eclipse-temurin:17-jammy

# Set working directory inside container
WORKDIR /app

# Expose port 9090 for the Spring Boot app
EXPOSE 9090

# Copy the built JAR from your Maven/Gradle target folder
COPY target/*.jar projection.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "projection.jar"]