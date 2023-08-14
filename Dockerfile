FROM openjdk:17

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

RUN ./mvnw -DskipTests=true package

CMD ["java", "-jar", "./target/DockerEx-0.0.1-SNAPSHOT.jar"]

#CMD ["./mvnw", "spring-boot:run"]