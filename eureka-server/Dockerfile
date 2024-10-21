FROM openjdk:21-jdk

WORKDIR /app

ADD target/*.jar eureka-server.jar

EXPOSE 8761

ENTRYPOINT ["java","-jar","eureka-server.jar"]