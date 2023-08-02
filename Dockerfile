FROM openjdk:17

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

#CMD ["java", "-jar", "DockerEx-0.0.1-SANPSHOT.jar"]
CMD ["./mvnw", "spring-boot:run"]