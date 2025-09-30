# Use a valid Maven image to build the app
FROM maven:3.8.8-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar weather-api-app-1.0-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "weather-api-app-1.0-SNAPSHOT.jar"]