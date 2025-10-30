FROM openjdk:17-alpine
COPY build/libs/*.jar application.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=local", "-jar", "application.jar"]