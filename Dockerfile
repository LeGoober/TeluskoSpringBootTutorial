FROM maven:3.9.5-openjdk-17-slim AS build

WORKDIR /app

COPY pom.xml .

COPY src ./src

COPY ProductSpringBootFrontend ./ProductSpringBootFrontend

RUN mvn clean package -DskipTests

FROM openjdk:17-jre-slim

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
