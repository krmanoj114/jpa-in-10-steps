FROM openjdk:8
EXPOSE 8080
ADD target/jpa-in-10-steps-0.0.1-SNAPSHOT.jar jpa-in-10-steps-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/jpa-in-10-steps-0.0.1-SNAPSHOT.jar"]