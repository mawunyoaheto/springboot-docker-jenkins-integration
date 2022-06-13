FROM openjdk:11
EXPOSE 8080
ADD target/springboot-docker-jenkins-integration.jar springboot-docker-jenkins-integration.jar
ENTRYPOINT ["java","-jar","/springboot-docker-jenkins-integration.jar"]