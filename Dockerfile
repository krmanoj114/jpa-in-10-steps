FROM openjdk:8
EXPOSE 8080
ADD target/jpa-in-10-steps.jar jpa-in-10-steps.jar
ENTRYPOINT ["java", ".jar", "/jpa-in-10-steps.jar"]