FROM openjdk:21-jdk

WORKDIR /app

ADD target/*.jar task-service.jar

EXPOSE 8082

ENTRYPOINT ["java","-jar","task-service.jar"]