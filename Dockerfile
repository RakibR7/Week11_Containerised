FROM eclipse-temurin:17-alpine

WORKDIR /app

COPY target/Week11_Containerized-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "Week11_Containerized-0.0.1-SNAPSHOT.jar"]
