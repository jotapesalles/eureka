FROM openjdk:21-jdk

WORKDIR /app

ADD target/*.jar user-service.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","user-service.jar"]